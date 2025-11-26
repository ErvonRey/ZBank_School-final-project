package User;

//import here:
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import DatabaseConnection.*;

public class UserSession {
    
    UserSession(){}
    
    private static String currentUser;
    private static String currentUsername;
    private static double currentBalance;
    private static double currentInvestmentBalance;
    
    
    //getters
    public static String getCurrentUsername(){ return currentUsername; }
    public static String getCurrentUser(){ return currentUser; }
    public static double getCurrentUserBalance(){ return currentBalance; }
    public static double getCurrentInvestmentBalance(){ return currentInvestmentBalance; }
    
    
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
//                System.out.println("Account matched on bank_users...");
                
                //getting user_id
                int userID = result.getInt("user_id");
                ManageUser.setUserID(userID);
                
                //getting bal_id
                String SQLBalance = "SELECT bal_id FROM users_balance WHERE user_id = ?;";
                PreparedStatement balanceLogin = connection.prepareStatement(SQLBalance);
                balanceLogin.setInt(1, userID);
                ResultSet balResult = balanceLogin.executeQuery();
                
                if (balResult.next()){
                    int balID = balResult.getInt("bal_id");
                    ManageUser.setBalID(balID);
                }
                
                //Account matched
//                System.out.println("Account matched on users_balance...");
                
                return true;
                
            } else {
                
                //Account does not match
                String errorMessage =
                        "Account either does not exist or you typed\n"
                        + "an incorrect username or password. kindly\n"
                        + "confirm and then try again...";
                
                JOptionPane.showMessageDialog(null, errorMessage, "Login Error", JOptionPane.ERROR_MESSAGE);
                return false;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error on database method(checkLogin): " + e);
        }
        
        return false;
    }
    
    public static void logOut(){
        
        ManageUser.clearSession();
        
    }

    public static void getUserInformation(){
        
        //bank_users table
        try (Connection connection = DBConnection.getConnection()){
            
            String SQLbank_users_stmt = "SELECT * FROM bank_users WHERE user_id = ?";
            
            PreparedStatement bank_users_stmt = connection.prepareStatement(SQLbank_users_stmt);
            
            bank_users_stmt.setInt(1, ManageUser.getUserID());
            
            ResultSet bank_users_result = bank_users_stmt.executeQuery();
            
            if (bank_users_result.next()){
                
                String firstName = bank_users_result.getString("user_first_name");
                String middleName = bank_users_result.getString("user_middle_name");
                char middleInitial = middleName.isEmpty() ? ' ' : middleName.charAt(0);
                String lastName = bank_users_result.getString("user_last_name");
                String nameExtension = bank_users_result.getString("user_name_extension");
                
                String fullName = firstName 
                    + (middleName.isEmpty() ? "" : " " + middleInitial + ".") 
                    + " " + lastName 
                    + (nameExtension.isEmpty() ? "" : " " + nameExtension);

                currentUser = fullName.trim();
                currentUsername = bank_users_result.getString("user_username");
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error on database method(getUserInformation bank_user): " + e);
        }
        
        //users_balance table
        try (Connection connection = DBConnection.getConnection()){
            
            String SQLusers_balance_stmt = "SELECT * FROM users_balance WHERE bal_id = ?";
            
            PreparedStatement users_balance_result = connection.prepareStatement(SQLusers_balance_stmt);
            
            users_balance_result.setInt(1, ManageUser.getBalID());
            
            ResultSet result = users_balance_result.executeQuery();
            
            if (result.next()){
                
                currentBalance = result.getDouble("user_balance");
                currentInvestmentBalance = result.getDouble("user_investment");
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error on database method(getUserInformation users_balance): " + e);
        }
        
    }
    
}
