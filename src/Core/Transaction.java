package Core;

//import here:
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import DatabaseConnection.*;
import User.SessionManager;

public class Transaction {
    
    public static double getBalanceFrom(int ID){
        
        try (Connection connection = DBConnection.getConnection();) {
            
            String SQLCheckBalance = "SELECT user_balance FROM users_balance WHERE user_id = ?";
            
            PreparedStatement checkingBalance = connection.prepareStatement(SQLCheckBalance);
            
            checkingBalance.setInt(1, ID);
            
            ResultSet result = checkingBalance.executeQuery();
            
            if (result.next()) {
                
                return result.getDouble("user_balance");
                    
            }
            
        } catch (SQLException e){
            System.out.println("Error on database method(getBalance): " + e.getMessage());
        }
        
        return 0;
    }
    
    //for the PaymentMethod class
    public static void paymentDeduction(){
        
    }

    public static void sendMoney(double amount, int ID){
        
        double currentBalance = getBalanceFrom(SessionManager.getUserID());
        
        if (amount > currentBalance){
            JOptionPane.showMessageDialog(null, "Failed to send. Not enough balance!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //  sendMoney('amount to send', 'to who');
        
        Connection connection = null;
        
        try {
            
            connection = DBConnection.getConnection();
            
            connection.setAutoCommit(false); //starts to turn off auto save just in case it fails
            
            String SQLSendMoney = "UPDATE users_balance SET user_balance = user_balance + ? WHERE user_id = ?";
            
            PreparedStatement sendingMoney = connection.prepareStatement(SQLSendMoney);
            
            sendingMoney.setDouble(1, amount);
            sendingMoney.setInt(2, ID);
            
            int rowsUpdated = sendingMoney.executeUpdate();
            
            if (rowsUpdated == 0) {
                
            //if there is no changes on the row that means the id or username is not existing
            JOptionPane.showMessageDialog(null, "Transaction cancelled, ID does not exist.");
            connection.rollback();
            
                return;
                //cancels the whole transaction
            }
            
            //deduct balance from the sender
            
            String SQLDeductMoney = "UPDATE users_balance SET user_balance = user_balance - ? WHERE user_id = ?";
            
            PreparedStatement deductMoney = connection.prepareStatement(SQLDeductMoney);
            
            deductMoney.setDouble(1, amount);
            deductMoney.setInt(2, SessionManager.getUserID());
            
            deductMoney.executeUpdate();
            
            connection.commit();
            JOptionPane.showMessageDialog(null, "Transaction Completed.");
            
        } catch (SQLException e) {
            if (connection != null) {
                try { connection.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
            }
            System.out.println("Error on database method(sendMoney ID)" + e.getMessage());
        }
        
        finally {
            
            if (connection != null) {
                try {
                    connection.setAutoCommit(true); //resetting the auto commit just in case
                    connection.close(); //closing the connection
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            
        }
        
    }
    
    public static void sendMoney(double amount, String username){
        
        double currentBalance = getBalanceFrom(SessionManager.getUserID());
        
        if (amount > currentBalance){
            JOptionPane.showMessageDialog(null, "Failed to send. Not enough balance!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //  sendMoney('amount to send', 'to who');
        
        Connection connection = null;
        
        try {
            
            connection = DBConnection.getConnection();
            
            connection.setAutoCommit(false); //starts to turn off auto save just in case it fails
            
            String SQLSendMoney = "UPDATE users_balance SET user_balance = user_balance + ? WHERE user_username = ?";
            
            PreparedStatement sendingMoney = connection.prepareStatement(SQLSendMoney);
            
            sendingMoney.setDouble(1, amount);
            sendingMoney.setString(2, username);
            
            int rowsUpdated = sendingMoney.executeUpdate();
            
            if (rowsUpdated == 0) {
                
            //if there is no changes on the row that means the id or username is not existing
            JOptionPane.showMessageDialog(null, "Transaction cancelled, username does not exist.");
            connection.rollback();
            
                return;
                //cancels the whole transaction
            }
            
            //deduct balance from the sender
            
            String SQLDeductMoney = "UPDATE users_balance SET user_balance = user_balance - ? WHERE user_id = ?";
            
            PreparedStatement deductMoney = connection.prepareStatement(SQLDeductMoney);
            
            deductMoney.setDouble(1, amount);
            deductMoney.setInt(2, SessionManager.getUserID());
            
            deductMoney.executeUpdate();
            
            connection.commit();
            JOptionPane.showMessageDialog(null, "Transaction Completed.");
            
        } catch (SQLException e) {
            if (connection != null) {
                try { connection.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
            }
            System.out.println("Error on database method(sendMoney username)" + e.getMessage());
        }
        
        finally {
            
            if (connection != null) {
                try {
                    connection.setAutoCommit(true); //resetting the auto commit just in case
                    connection.close(); //closing the connection
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            
        }
        
    }
    
    public static void withdrawCash(double amount){
        
        double currentBalance = getBalanceFrom(SessionManager.getUserID());
        
        if (amount > currentBalance){
            JOptionPane.showMessageDialog(null, "Failed to withdraw. Not enough balance!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLWithdraw = "UPDATE users_balance SET user_balance = user_balance - ? WHERE user_id = ?";
            
            PreparedStatement withdrawing = connection.prepareStatement(SQLWithdraw);
            
            withdrawing.setDouble(1, amount);
            withdrawing.setDouble(2, SessionManager.getUserID());
            
            withdrawing.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Withdrawal Successful.");
            
        } catch (SQLException e) {
            System.out.println("Error on database method(sendMoney username): " + e.getMessage());
        }
        
    }
    
    public static void depositCash(double amount){
        
        if (amount <= 0){
            JOptionPane.showMessageDialog(null, "Failed to deposit. Invalid amount!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLDeposit = "UPDATE users_balance SET user_balance = user_balance + ? WHERE user_id = ?";
            
            PreparedStatement depositing = connection.prepareStatement(SQLDeposit);
            
            depositing.setDouble(1, amount);
            depositing.setDouble(2, SessionManager.getUserID());
            
            depositing.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deposit Successful.");
            
        } catch (SQLException e) {
            System.out.println("Error on database method(sendMoney username): " + e.getMessage());
        }
        
    }
    
    public static void investMoney(double amount){
        
        double currentBalance = getBalanceFrom(SessionManager.getUserID());
        
        if (amount > currentBalance){
            JOptionPane.showMessageDialog(null, "Failed to invest. Not enough balance!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLDeducting = "UPDATE users_balance SET user_balance = user_balance - ? WHERE user_id = ?";
            
            PreparedStatement investing = connection.prepareStatement(SQLDeducting);
            
            investing.setDouble(1, amount);
            investing.setDouble(2, SessionManager.getUserID());
            
            investing.executeUpdate();
            
            String SQLAdding = "UPDATE users_balance SET user_investment = user_investment + ? WHERE user_id = ?";
            
            PreparedStatement adding = connection.prepareStatement(SQLAdding);
            
            adding.setDouble(1, amount);
            adding.setDouble(2, SessionManager.getUserID());
            
            adding.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Investment Successful.");
            
        } catch (SQLException e) {
            System.out.println("Error on database method(sendMoney username): " + e.getMessage());
        }
        
    }

}
