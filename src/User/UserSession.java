package User;

//import here:
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import DatabaseConnection.*;
import UI.Login;
import User.SessionManager;



public class UserSession {
    
    public static void checkLogin(String username, String password){
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLCheckingLogin = "SELECT * FROM bank_users WHERE user_username = ? AND user_password = ?";
            
            PreparedStatement loggingIn = connection.prepareStatement(SQLCheckingLogin);
            
            loggingIn.setString(1, username);
            loggingIn.setString(2, password);
            
            ResultSet result = loggingIn.executeQuery();
            
            if (result.next()) {
                
                //Account matched
                System.out.println("Account matched...");
                
            } else {
                
                //Account does not match
                String errorMessage = "Incorrect username or password, please try again.";
                JOptionPane.showMessageDialog(null, errorMessage, "Login Error", JOptionPane.ERROR_MESSAGE);
                
            }
            
            
            
        } catch (SQLException e) {
            System.out.println("Error on database method(checkLogin): " + e);
        }
        
    }

    public static void main(String[] args) {
        
        
        
    }
    
}
