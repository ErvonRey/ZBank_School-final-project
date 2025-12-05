package Core;

//import here:

import DatabaseConnection.DBConnection;
import User.ManageUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecordTransaction {
    
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

    public void recordSend(int sentToID, double amount){
        
        autoGenerateReferenceNumber();
        
        try (Connection connection = DBConnection.getConnection()){
            
            String transacSendSQL = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, sent_to_or_from, amount, date_performed)"
                    + "VALUES (?,?,?,?,?, NOW())";
            
            PreparedStatement transacSend = connection.prepareStatement(transacSendSQL);
            
            transacSend.setString(1, "Sent Money");
            transacSend.setString(2, Integer.toString(referenceNumber));
            transacSend.setInt(3, ManageUser.getUserID());
            transacSend.setInt(4, sentToID);
            transacSend.setString(5, " - " + amount);
            
            transacSend.executeUpdate();
            
            String transacReceiveSendSQL = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, sent_to_or_from, amount, date_performed)"
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
    
    public void recordPay(double value, String paymentMethod){
        
        autoGenerateReferenceNumber();
        
        try (Connection connection = DBConnection.getConnection()){
            
            String paySQL = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, amount, date_performed)"
                    + "VALUES (?,?,?,?, NOW())";
            
            PreparedStatement paying_perform = connection.prepareStatement(paySQL);
            
            paying_perform.setString(1, "Pay using: " + paymentMethod);
            paying_perform.setString(2, Integer.toString(referenceNumber));
            paying_perform.setInt(3, ManageUser.getUserID());
            paying_perform.setString(4, " - " + value);
            
            paying_perform.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error on database method(pay transaction history): " + e.getMessage());
        }
        
    }
    
    public void recordDeposit(double value){
        
        autoGenerateReferenceNumber();
        
        try (Connection connection = DBConnection.getConnection()){
            
            String sql = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, amount, date_performed)"
                    + "VALUES (?,?,?,?, NOW())";
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, "Deposit");
            ps.setString(2, Integer.toString(referenceNumber));
            ps.setInt(3, ManageUser.getUserID());
            ps.setString(4, " + " + value);
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error on database method(depoist transaction history): " + e.getMessage());
        }
        
    }
    
    public void recordWithdraw(double value){
        
        autoGenerateReferenceNumber();
        
        try (Connection connection = DBConnection.getConnection()){
            
            String sql = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, amount, date_performed)"
                    + "VALUES (?,?,?,?, NOW())";
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, "Withdraw");
            ps.setString(2, Integer.toString(referenceNumber));
            ps.setInt(3, ManageUser.getUserID());
            ps.setString(4, " - " + value);
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error on database method(withdraw transaction history): " + e.getMessage());
        }
        
    }
    
    public void recordInvesting(double value){
        
        autoGenerateReferenceNumber();
        
        try (Connection connection = DBConnection.getConnection()){
            
            String sql = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, amount, date_performed)"
                    + "VALUES (?,?,?,?, NOW())";
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, "Investing");
            ps.setString(2, Integer.toString(referenceNumber));
            ps.setInt(3, ManageUser.getUserID());
            ps.setString(4, " - " + value);
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error on database method(investing transaction history): " + e.getMessage());
        }
    }
    
    public void recordClaimingInvest(double value){
        
        autoGenerateReferenceNumber();
        
        try (Connection connection = DBConnection.getConnection()){
            
            String sql = "INSERT INTO transactions(type_of_transaction, reference_number, performed_by, amount, date_performed)"
                    + "VALUES (?,?,?,?, NOW())";
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, "Claiming Investment");
            ps.setString(2, Integer.toString(referenceNumber));
            ps.setInt(3, ManageUser.getUserID());
            ps.setString(4, " + " + value);
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error on database method(claiming investment transaction history): " + e.getMessage());
        }
    }
}
