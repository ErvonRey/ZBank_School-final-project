package Core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import DatabaseConnection.DBConnection;
import User.SessionManager;
import javax.swing.JOptionPane;

public class PaymentMethod {
    
    private double balance;
    
    public void refreshBalance(){
        
        try (Connection connection = DBConnection.getConnection()){
            
            String SQLgetBalance = "SELECT user_balance FROM users_balance WHERE user_id = ?";
            
            PreparedStatement gettingBalance = connection.prepareStatement(SQLgetBalance);
            
            gettingBalance.setInt(1, SessionManager.getUserID());
            
            ResultSet result = gettingBalance.executeQuery();
            
            if (result.next()){
                
                balance = result.getDouble("user_balance");
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error on database method(refreshBalance): " + e.getMessage());
        }
        
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void payHelper(double value){
        
        //deduct what they paid for
        double currentBalance = getBalance();
        
        if (value > currentBalance){
            JOptionPane.showMessageDialog(null, "Failed to pay using generic method. Not enough balance!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLPay = "UPDATE users_balance SET user_balance = user_balance - ? WHERE user_id = ?";
            
            PreparedStatement paying = connection.prepareStatement(SQLPay);
            
            paying.setDouble(1, value);
            paying.setDouble(2, SessionManager.getUserID());
            
            paying.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Generic Payment Successful.");
            
        } catch (SQLException e) {
            System.out.println("Error on database method(sendMoney username): " + e.getMessage());
        }
        
    }
    
    public static void paying(double amount){
        
        PaymentMethod pay = new PaymentMethod();
        
        pay.payHelper(amount);
        
    }
    
}

class PaymentPaypal extends PaymentMethod{
    
    public void payHelper(double value){
        
        //deduct what they paid for
        double currentBalance = getBalance();
        
        if (value > currentBalance){
            JOptionPane.showMessageDialog(null, "Failed to pay using Paypal. Not enough balance!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLPay = "UPDATE users_balance SET user_balance = user_balance - ? WHERE user_id = ?";
            
            PreparedStatement paying = connection.prepareStatement(SQLPay);
            
            paying.setDouble(1, value);
            paying.setDouble(2, SessionManager.getUserID());
            
            paying.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Paypal Payment Successful.");
            
        } catch (SQLException e) {
            System.out.println("Error on database method(sendMoney username): " + e.getMessage());
        }
        
    }
    
    public static void paying(double amount){
        
        PaymentPaypal pay = new PaymentPaypal();
        
        pay.payHelper(amount);
        
    }
    
}

class PaymentCard extends PaymentMethod{
    
    public void payHelper(double value){
        
        //deduct what they paid for
        double currentBalance = getBalance();
        
        if (value > currentBalance){
            JOptionPane.showMessageDialog(null, "Failed to pay using Card. Not enough balance!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLPay = "UPDATE users_balance SET user_balance = user_balance - ? WHERE user_id = ?";
            
            PreparedStatement paying = connection.prepareStatement(SQLPay);
            
            paying.setDouble(1, value);
            paying.setDouble(2, SessionManager.getUserID());
            
            paying.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Card Payment Successful.");
            
        } catch (SQLException e) {
            System.out.println("Error on database method(sendMoney username): " + e.getMessage());
        }
        
    }
    
    public static void paying(double amount){
        
        PaymentCard pay = new PaymentCard();
        
        pay.payHelper(amount);
        
    }
    
}