package Core;

//import here:

import DatabaseConnection.DBConnection;
import User.ManageUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Record {
    
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
                
            }
        } catch (SQLException e) {
            System.out.println("Error on database method(autoIncrement reference number): " + e.getMessage());
        }
    }

    public void sendMoneyTransaction(int sentToID, double amount){
        
        autoGenerateReferenceNumber();
        
        try (Connection connection = DBConnection.getConnection()){
            
            String transacSendSQL = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, sent_to, amount_sent, date_performed)"
                    + "VALUES (?,?,?,?,?, NOW())";
            
            PreparedStatement transacSend = connection.prepareStatement(transacSendSQL);
            
            transacSend.setString(1, "Sent Money");
            transacSend.setString(2, Integer.toString(referenceNumber));
            transacSend.setInt(3, ManageUser.getUserID());
            transacSend.setInt(4, sentToID);
            transacSend.setString(5, " - " + amount);
            
            transacSend.executeUpdate();
            
            String transacReceiveSendSQL = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, sent_to, amount_sent, date_performed)"
                    + "VALUES (?,?,?,?,?, NOW())";
            
            PreparedStatement transacReceive = connection.prepareStatement(transacReceiveSendSQL);
            
            transacReceive.setString(1, "Received Money");
            transacReceive.setInt(2, referenceNumber);
            transacReceive.setInt(3, sentToID);
            transacReceive.setInt(4, ManageUser.getUserID());
            transacReceive.setString(5, " + " + amount);
            
            transacReceive.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error on database method(sendMoney transaction history): " + e.getMessage());
        }
        
    }
}
