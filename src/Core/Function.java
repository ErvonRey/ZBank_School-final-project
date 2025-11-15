package Core;

//import here:
import UI.Login;
import User.SessionManager;
import User.ManageUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import DatabaseConnection.*;


public class Function {
    
    public static void autoIncrementID() {
        
        try (Connection connection = DBConnection.getConnection()) {
            
            PreparedStatement ps = connection.prepareStatement("SELECT user_id FROM bank_users ORDER BY user_id DESC LIMIT 1");
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                int ID = rs.getInt("user_id");
                int n = ID + 1;
                ManageUser.setCurrentUserID(n);
                //encapsulation here
                
            } else {
                
                ManageUser.setCurrentUserID(1000);
                //encapsulation here
                //sets up the default lowest id value to 1000
                
            }
        } catch (SQLException e) {
            System.out.println("Error on database method(autoIncrement): " + e.getMessage());
        }
    }

    public static void addAccount(
            
            String username, String email, String password, String phoneNumber,
            String firstName, String middleName, String lastName, String nameExtension,
            int month, int day, int year, String PurStr, String MunCit, String Region
            
        )   {
        
        autoIncrementID();
        
        try (Connection conn = DBConnection.getConnection();)
            
        {
            
            //creating a new account on bank_user
            String SQLCreatingAccount = "INSERT INTO bank_users("
                + "user_id, user_username, user_email, user_password, user_phone_number,"
                + "user_first_name, user_middle_name, user_last_name, user_name_extension,"
                + "user_birthdate, user_purok_street, user_municipal_city, user_region, user_status)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement creatingAccount = conn.prepareStatement(SQLCreatingAccount);
            
            creatingAccount.setString(1, Integer.toString(ManageUser.getCurrentUserID()));
            creatingAccount.setString(2, username);
            creatingAccount.setString(3, email);
            creatingAccount.setString(4, password);
            creatingAccount.setString(5, phoneNumber);
            creatingAccount.setString(6, firstName);
            creatingAccount.setString(7, middleName); 
            creatingAccount.setString(8, lastName); 
            creatingAccount.setString(9, nameExtension);
            
            //birthdate format
            String birthdate = String.format("%04d-%02d-%02d", year, month, day);
            creatingAccount.setString(10, birthdate);
            
            creatingAccount.setString(11, PurStr);
            creatingAccount.setString(12, MunCit);
            creatingAccount.setString(13, Region);
            creatingAccount.setBoolean(14, true);    //default value for status
            
            creatingAccount.executeUpdate();
            
            //creating a row and linking it to the current account creator
            String SQLCreatingBalance = "INSERT INTO user_balance (user_id) VALUES (?)";
            
            PreparedStatement creatingBalance = conn.prepareStatement(SQLCreatingBalance);
            
            creatingBalance.setString(1, Integer.toString(ManageUser.getCurrentUserID()));
            
            creatingBalance.executeUpdate();
            
//            System.out.println("Successful!");
            
            
        } catch (SQLException e) {
            System.out.println("Error on database method(createAccount): " + e.getMessage());
        }
        
    }
    
    public static void updateAccount(String username, String password, String firstName, String middleName, String lastName, String nameExtension, String birthdate, String PurStr, String MunCit, String region) {
        
    
        try (Connection connection = DBConnection.getConnection();) {         //Whole connection
            
            String SQLUpdateInformation = "UPDATE bank_users SET user_username = ?, user_password = ?, user_first_name = ?, "
                    + "user_middle_name = ?, user_last_name = ?, user_name_extension = ?, user_purok_street = ?, user_municipal_city = ?, user_region = ?"
                    + " WHERE user_id = ?";
                    
            PreparedStatement UpdatePreparedStatement = connection.prepareStatement(SQLUpdateInformation);

            UpdatePreparedStatement.setString(1, username);
            UpdatePreparedStatement.setString(2, password);
            UpdatePreparedStatement.setString(3, firstName);
            UpdatePreparedStatement.setString(4, middleName);
            UpdatePreparedStatement.setString(5, lastName);
            UpdatePreparedStatement.setString(6, nameExtension);
            UpdatePreparedStatement.setString(7, PurStr);
            UpdatePreparedStatement.setString(8, MunCit);
            UpdatePreparedStatement.setString(9, region);
            UpdatePreparedStatement.setInt(10, ManageUser.getCurrentUserID());

            UpdatePreparedStatement.executeUpdate();
            
            } catch (SQLException e) {
                System.out.println("Error on database method(updateAccount): " + e.getMessage());
        }
        
        
    }
    
    public static void searchAccount(int ID){
        
        try (Connection connection = DBConnection.getConnection();) {  
            
        String sql = "SELECT * FROM bank_users WHERE user_id = ?";
        
        PreparedStatement searchUser = connection.prepareStatement(sql);

        searchUser.setInt(1, ID);
        
        ResultSet result = searchUser.executeQuery();
                
            if (result.next()) {
                    
                String userID = result.getString("user_id");
                String username = result.getString("user_username");
                String firstName = result.getString("user_first_name");
                String middleName = result.getString("user_middle_name");
                String lastName = result.getString("user_last_name");
                String nameExtension = result.getString("user_name_extension");
                String userBirthdate = result.getString("user_birthdate");
                String PurStr = result.getString("user_purok_street");
                String MunCit = result.getString("user_municipal_city");
                String region = result.getString("user_region");
                boolean status = result.getBoolean("user_status");
                    
                String searchResult =
                        
                        "User's ID: " + userID + "\n"
                        + "Username: " + username + "\n"
                        + "Full Name: " + firstName + " " + middleName + " " + lastName + " " + nameExtension + "\n"
                        + "Birthdate: " + userBirthdate + " (YYYY-MM-DD)" + "\n"
                        + "Address: " + PurStr + ", " + MunCit + " " + region + "\n"
                        + "Status: " + status + "\n(Enabled = True, Disabled = False)" + "\n";
                
                JOptionPane.showMessageDialog(null, searchResult, "Search Result (via ID)", JOptionPane.INFORMATION_MESSAGE);
                    
            }
            
            else {
                
                JOptionPane.showMessageDialog(null, "ID doesnt exist");
                
            }
        
        } catch (SQLException e) {
            System.out.println("Error on database method(searchAccount(int)): " + e.getMessage());
        }
            
    }
    
    public static void searchAccount(String tempUsername){
    
        try (Connection connection = DBConnection.getConnection();) {  
            
        String sql = "SELECT * FROM bank_users WHERE user_username = ?";
        
        PreparedStatement searchUser = connection.prepareStatement(sql);

        searchUser.setString(1, tempUsername);
        
        ResultSet result = searchUser.executeQuery();
                
            if (result.next()) {
                    
                String userID = result.getString("user_id");
                String username = result.getString("user_username");
                String firstName = result.getString("user_first_name");
                String middleName = result.getString("user_middle_name");
                String lastName = result.getString("user_last_name");
                String nameExtension = result.getString("user_name_extension");
                String userBirthdate = result.getString("user_birthdate");
                String PurStr = result.getString("user_purok_street");
                String MunCit = result.getString("user_municipal_city");
                String region = result.getString("user_region");
                boolean status = result.getBoolean("user_status");
                
                String searchResult =
                        
                        "User's ID: " + userID + "\n"
                        + "Username: " + username + "\n"
                        + "Full Name: " + firstName + " " + middleName + " " + lastName + " " + nameExtension + "\n"
                        + "Birthdate: " + userBirthdate + " (YYYY-MM-DD)" + "\n"
                        + "Address: " + PurStr + ", " + MunCit + " " + region + "\n"
                        + "Status: " + status + "\n(Enabled = True, Disabled = False)" + "\n";
                
                JOptionPane.showMessageDialog(null, searchResult, "Search Result (via username)", JOptionPane.INFORMATION_MESSAGE);
                    
            }
            
            else {
                
                JOptionPane.showMessageDialog(null, "Username doesnt exist");
                
            }
            
        
        } catch (SQLException e) {
            System.out.println("Error on database method(searchAccount username): " + e.getMessage());
        }
    
    }
    
    public static void deleteAccount(){
            
        int currentID = SessionManager.getUserID();
        
        try (Connection connection = DBConnection.getConnection()) {

            String SQLDeleteUser = "DELETE FROM bank_users WHERE user_id = ?";

            PreparedStatement deleteAccountOfUser = connection.prepareStatement(SQLDeleteUser);

            deleteAccountOfUser.setInt(1, currentID);

            deleteAccountOfUser.executeUpdate();
                
            //------------------------------------
            
            String SQLToDelete = "DELETE FROM user_balance WHERE user_id = ?";

            PreparedStatement deleteUserBalance = connection.prepareStatement(SQLToDelete);

                deleteUserBalance.setInt(1, currentID);

                int rowsAffected = deleteUserBalance.executeUpdate();

                if (rowsAffected > 0) {

                    JOptionPane.showMessageDialog(null, "Successfully deleted your account!", "Account Deletion", JOptionPane.INFORMATION_MESSAGE);
                    
                    Login login = new Login();
                    login.setVisible(true);
                    SessionManager.clearSession();
                    
                }
        
        } catch (SQLException e) {
                
            System.out.println("Error on database method(deleteAccount): " + e.getMessage());
            
        }
    }
 
    
    public static void main(String[] args) {
        
//        addAccount(
//                
//                "@ervonrey", "ervonrey@gmail.com", "test123", "09631406262",
//                "Ervon Rey", "Quinones", "Mellisa", "",
//                2, 10, 2006, "Purok 1-B, Bacungan", "Magsaysay", "Davao del Sur"
//                
//            );

//        updateAccount(
//        
//               "@zumiiDesu", "test123", "Ervon Rey", "Quinones", "Mellisa", "",
//                "2006-02-10", "Purok 1-B Bacungan", "Magsaysay", "Davao del Sur"
//                
//        );

//        searchAccount(1000);
//        searchAccount("@zumiiDesu");
        
//        deleteAccount();
        
    }
    
}
