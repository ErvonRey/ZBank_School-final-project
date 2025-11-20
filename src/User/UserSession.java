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
    
    public static boolean isUsernameDuplicated(String username){
        
        try (Connection connection = DBConnection.getConnection()) {
            
            String SQLChecking = "SELECT user_username FROM bank_users WHERE user_username = ?";
            
            PreparedStatement checking = connection.prepareStatement(SQLChecking);
            
            checking.setString(1, username);
            
            ResultSet result = checking.executeQuery();
            
            if (result.next()) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error on database method(isUsernameDuplicated): " + e);
        }
        
        return true;
    }
    
    public static boolean checkLogin(String username, String password){
        
        try (Connection connection = DBConnection.getConnection();){
            
            String SQLCheckingLogin = "SELECT * FROM bank_users WHERE user_username = ? AND user_password = ?";
            
            PreparedStatement loggingIn = connection.prepareStatement(SQLCheckingLogin);
            
            loggingIn.setString(1, username);
            loggingIn.setString(2, password);
            
            ResultSet result = loggingIn.executeQuery();
            
            if (result.next()) {
                
                //Account matched
//                System.out.println("Account matched...");
                int userID = result.getInt("user_id");
                SessionManager.setUserID(userID);
                
                return true;
                
            } else {
                
                //Account does not match
                String errorMessage =
                        "Account either does not exist or you typed\n"
                        + "an incorrect username or password. kindly\n"
                        + "check then try again...";
                
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
