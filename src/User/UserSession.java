package User;

//import here:
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import DatabaseConnection.*;
import User.SessionManager;

public class UserSession {
    
    public static boolean checkLogin(String username, String password){
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLCheckingLogin = "SELECT * FROM bank_users WHERE user_username = ? AND user_password = ?";
            
            PreparedStatement loggingIn = connection.prepareStatement(SQLCheckingLogin);
            
            loggingIn.setString(1, username);
            loggingIn.setString(2, password);
            
            ResultSet result = loggingIn.executeQuery();
            
            if (result.next()) {
                
                //Account matched
                System.out.println("Account matched...");
                return true;
                
            } else {
                
                //Account does not match
                String errorMessage = "Incorrect username or password, please try again.";
                JOptionPane.showMessageDialog(null, errorMessage, "Login Error", JOptionPane.ERROR_MESSAGE);
                return false;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error on database method(checkLogin): " + e);
        }
        
        return false;
    }
    
    public static void logOut(){
        
        SessionManager.clearSession();
        
    }

    public static void main(String[] args) {
        
        
        
    }
    
}
