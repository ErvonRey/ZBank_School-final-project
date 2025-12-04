package Core;

//import here:

import DatabaseConnection.DBConnection;
import User.ManageUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Record {
    
    ManageUser mu = new ManageUser();
    
    private int referenceNumber;
    
    public void autoGenerateReferenceNumber(){
        
        try (Connection connection = DBConnection.getConnection()) {
            
            PreparedStatement ps = connection.prepareStatement("SELECT reference_number FROM transactions ORDER BY reference_number DESC LIMIT 1");
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                int refNum = rs.getInt("reference_number");
                int n = refNum + 1;
                referenceNumber = n;
                //encapsulation here
                
            } else {
                
                referenceNumber = 500;
                //encapsulation here
                //sets up the default lowest id value to 1000
                
            }
        } catch (SQLException e) {
            System.out.println("Error on database method(autoIncrement reference number): " + e.getMessage());
        }
    }

    public void sendMoneyTransaction(int userSentTo, double amountSent){
        
        try (Connection connection = DBConnection.getConnection()){
            
            String transacEntrySQL = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, sent_to, amount_sent, date_performed)"
                    + "VALUES (?,?,?,?,?, NOW())";
            
            PreparedStatement transacEntryPerform = connection.prepareStatement(transacEntrySQL);
            
            transacEntryPerform.setString(1, "Sent Money");
            transacEntryPerform.setInt(2, referenceNumber);
            transacEntryPerform.setInt(3, mu.getUserID());
            transacEntryPerform.setInt(4, userSentTo);
            transacEntryPerform.setDouble(5, amountSent);
            
            transacEntryPerform.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error on database method(sendMoney transaction history): " + e.getMessage());
        }
        
    }
}
