package Core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import DatabaseConnection.DBConnection;
import User.ManageUser;
import javax.swing.JOptionPane;

public class PaymentMethod {
    
    ManageUser mu = new ManageUser();
    
    protected double balance;

    public void refreshBalance() {
        
        try (Connection connection = DBConnection.getConnection()) {
            
            String SQLgetBalance = "SELECT user_balance FROM users_balance WHERE user_id = ?";
            PreparedStatement stmt = connection.prepareStatement(SQLgetBalance);
            stmt.setInt(1, mu.getUserID());
            ResultSet result = stmt.executeQuery();
            
            if (result.next()) {
                balance = result.getDouble("user_balance");
            }
            
        } catch (SQLException e) {
            System.out.println("Error on refreshBalance: " + e.getMessage());
        }
    }

    public double getBalance() {
        return balance;
    }

    //template method for all subclasses uses this
    public void payHelper(double value, String methodName) {
        
        refreshBalance();
        
        if (value > balance) {
            
            JOptionPane.showMessageDialog(null, "Failed to pay using " + methodName + ". Not enough balance!", "Transaction Cancelled", JOptionPane.ERROR_MESSAGE);
            return;
            
        }

        try (Connection connection = DBConnection.getConnection()) {
            
            String SQLPay = "UPDATE users_balance SET user_balance = user_balance - ? WHERE user_id = ?";
            PreparedStatement stmt = connection.prepareStatement(SQLPay);
            stmt.setDouble(1, value);
            stmt.setInt(2, mu.getUserID());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, methodName + " Payment Successful.");
            
        } catch (SQLException e) {
            System.out.println("Error on payment: " + e.getMessage());
        }
    }

    //this is the default method, can be overridden using polymorphism
    public void pay(double value) {
        payHelper(value, "Generic");
    }
}

class PaymentPaypal extends PaymentMethod {
    @Override
    public void pay(double value) {
        payHelper(value, "Paypal");
    }
}

class PaymentCard extends PaymentMethod {
    @Override
    public void pay(double value) {
        payHelper(value, "Card");
    }
}