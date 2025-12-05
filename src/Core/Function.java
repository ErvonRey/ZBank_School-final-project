package Core;

//import here:
import User.ManageUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import DatabaseConnection.*;
import UI.Login;

public class Function {
    
    public static void autoIncrementUserID() {
        
        try (Connection connection = DBConnection.getConnection()) {
            
            PreparedStatement ps = connection.prepareStatement("SELECT user_id FROM bank_users ORDER BY user_id DESC LIMIT 1");
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                int ID = rs.getInt("user_id");
                int n = ID + 1;
                ManageUser.setUserID(n);
                //encapsulation here
                
            } else {
                
                ManageUser.setUserID(1000);
                //encapsulation here
                //sets up the default lowest id value to 1000
                
            }
        } catch (SQLException e) {
            System.out.println("Error on database method(autoIncrement userID): " + e.getMessage());
        }
    }
    
    public static void autoIncrementBalanceID() {
        
        try (Connection connection = DBConnection.getConnection()) {
            
            PreparedStatement ps = connection.prepareStatement("SELECT bal_id FROM users_balance ORDER BY bal_id DESC LIMIT 1");
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                int ID = rs.getInt("bal_id");
                int n = ID + 1;
                ManageUser.setBalID(n);
                //encapsulation here
                
            } else {
                
                ManageUser.setBalID(1);
                //encapsulation here
                //sets up the default lowest id value to 1
                
            }
        } catch (SQLException e) {
            System.out.println("Error on database method(autoIncrement balID): " + e.getMessage());
        }
    }

    public void addAccount(
            
            String username, String email, String password, String phoneNumber,
            String firstName, String middleName, String lastName, String nameExtension,
            int month, int day, int year, String PurStr, String MunCit, String Region
            
        )   {
        
        autoIncrementUserID();
        autoIncrementBalanceID();
        
        try (Connection connection = DBConnection.getConnection();)
            
        {
            //creating a new row on bank_user table
            String bank_users_SQL = "INSERT INTO bank_users(user_id, user_username, user_email, user_password, user_status)"
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement bank_users = connection.prepareStatement(bank_users_SQL);
            
            bank_users.setString(1, Integer.toString(ManageUser.getUserID()));
            bank_users.setString(2, username);
            bank_users.setString(3, email);
            bank_users.setString(4, password);
            bank_users.setString(5, "Active");
            
            bank_users.executeUpdate();
            
            //linking it to users_information
            String users_information_SQL = "INSERT INTO users_information(user_id, user_first_name, user_middle_name, user_last_name, user_name_extension, user_birthdate, user_phone_number)"
                    + "VALUES(?,?,?,?,?,?,?)";
            PreparedStatement users_information = connection.prepareStatement(users_information_SQL);
            
            users_information.setString(1, Integer.toString(ManageUser.getUserID()));
            users_information.setString(2, firstName);
            users_information.setString(3, middleName); 
            users_information.setString(4, lastName); 
            users_information.setString(5, nameExtension);
            //birthdate format
            String birthdate = String.format("%04d-%02d-%02d", year, month, day);
            users_information.setString(6, birthdate);
            users_information.setString(7, phoneNumber);
            
            users_information.executeUpdate();
            
            //linking it to users_address
            String users_address_SQL = "INSERT INTO users_address(user_id, purok_street, municipal_city, region)"
                    + "VALUES(?,?,?,?)";
            PreparedStatement users_address = connection.prepareStatement(users_address_SQL);
            
            users_address.setString(1, Integer.toString(ManageUser.getUserID()));
            users_address.setString(2, PurStr);
            users_address.setString(3, MunCit);
            users_address.setString(4, Region);
            
            users_address.executeUpdate();
            
            //creating a row and linking it to the current account creator
            String SQLCreatingBalance = "INSERT INTO users_balance (bal_id ,user_id) VALUES (?, ?)";
            
            PreparedStatement creatingBalance = connection.prepareStatement(SQLCreatingBalance);
            
            creatingBalance.setString(1, Integer.toString(ManageUser.getBalID()));
            creatingBalance.setString(2, Integer.toString(ManageUser.getUserID()));
            
            creatingBalance.executeUpdate();
            
//            System.out.println("Successful!");
            JOptionPane.showMessageDialog(null, "Successfully created a new account!");
            
            
        } catch (SQLException e) {
            System.out.println("Error on database method(createAccount): " + e.getMessage());
        }
        
    }
    
    public void updateAccount(
            String password, String firstName, String middleName,
            String lastName, String nameExtension, String PurStr,
            String MunCit, String Region)
    {
    
        try (Connection connection = DBConnection.getConnection();) {
            
            //for the bank_users table
            String bank_users_SQL = "UPDATE bank_users SET user_password = ?"
                    + " WHERE user_id = ?";
                    
            PreparedStatement bank_users = connection.prepareStatement(bank_users_SQL);
            
            bank_users.setString(1, password);
            bank_users.setInt(2, ManageUser.getUserID());

            bank_users.executeUpdate();
            
            //for the users_information table
            String users_information_SQL = "UPDATE users_information SET user_first_name = ?, user_middle_name = ?,"
                    + "user_last_name = ?, user_name_extension = ? WHERE user_id = ?";
            PreparedStatement users_information = connection.prepareStatement(users_information_SQL);
            
            users_information.setString(1, firstName);
            users_information.setString(2, middleName);
            users_information.setString(3, lastName);
            users_information.setString(4, nameExtension);
            users_information.setInt(5, ManageUser.getUserID());
            
            users_information.executeUpdate();
            
            //for the users_address table
            String users_address_SQL = "UPDATE users_address SET purok_street = ?, municipal_city = ?,"
                    + "region = ? WHERE user_id = ?";
            PreparedStatement users_address = connection.prepareStatement(users_address_SQL);
            
            users_address.setString(1, PurStr);
            users_address.setString(2, MunCit);
            users_address.setString(3, Region);
            users_address.setInt(4, ManageUser.getUserID());
            
            users_address.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully updated your information!");
            
            } catch (SQLException e) {
                System.out.println("Error on database method(updateAccount): " + e.getMessage());
        }
        
        
    }
    
    public void searchAccount(int ID){
        
        String userID = "", username = "", firstName = "", middleName = "", lastName = "", nameExtension = ""
               , birthdate = "", PurStr = "", MunCit = "", Region = "", status = "", phoneNumber = "";
        
        try (Connection connection = DBConnection.getConnection();) {
            
        String bank_users_SQL =
                
                "SELECT u.user_id, u.user_username, u.user_status,\n" +
                "       i.user_first_name, i.user_middle_name, i.user_last_name, i.user_name_extension, i.user_birthdate, i.user_phone_number,\n" +
                "       a.purok_street, a.municipal_city, a.region\n" +
                "FROM bank_users u\n" +
                "LEFT JOIN users_information i ON u.user_id = i.user_id\n" +
                "LEFT JOIN users_address a ON u.user_id = a.user_id\n" +
                "WHERE u.user_id = ?;";
        
        PreparedStatement search_SQL = connection.prepareStatement(bank_users_SQL);

        search_SQL.setInt(1, ID);
        
        ResultSet search_result = search_SQL.executeQuery();
                
        if (search_result.next()) {
                    
            userID = search_result.getString("user_id");
            username = search_result.getString("user_username");
            status = search_result.getString("user_status");
            firstName = search_result.getString("user_first_name");
            middleName = search_result.getString("user_middle_name");
            if (middleName == null) middleName = ""; //if the middle name is null make it blank
            lastName = search_result.getString("user_last_name");
            nameExtension = search_result.getString("user_name_extension");
            if (nameExtension == null) nameExtension = ""; //same as the middle name idea, so it wont be null
            birthdate = search_result.getString("user_birthdate");
            phoneNumber = search_result.getString("user_phone_number");
            PurStr = search_result.getString("purok_street");
            MunCit = search_result.getString("municipal_city");
            Region = search_result.getString("region");   
                
        } else {
                
                JOptionPane.showMessageDialog(null, "user with that ID does not exist");
                return;
                
            }
        
            String searchResult =
                        
                "User's ID: " + userID + "\n"
                + "Username: " + username + "\n"
                + "Full Name: " + firstName + " " + middleName + " " + lastName + " " + nameExtension + "\n"
                + "Birthdate: " + birthdate + " (YYYY-MM-DD)" + "\n"
                + "Address: " + PurStr + ", " + MunCit + ", " + Region + "\n"
                + "Phone number: " + phoneNumber + "\n"
                + "Status: " + status;
            
            JOptionPane.showMessageDialog(null, searchResult, "Search Result", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (SQLException e) {
            System.out.println("Error on database method(searchAccount(int)): " + e.getMessage());
        }
            
    }
    
    public void searchAccount(String tempUsername){
    
        try (Connection connection = DBConnection.getConnection();) {  
            
        String sql = "SELECT user_id FROM bank_users WHERE user_username = ?";
        
        PreparedStatement searchUser = connection.prepareStatement(sql);

        searchUser.setString(1, tempUsername);
        
        ResultSet result = searchUser.executeQuery();
                
            if (result.next()) {
                    
                int userID = result.getInt("user_id");
                searchAccount(userID);
                
            }
            
            else {
                
                JOptionPane.showMessageDialog(null, "user with that username does not exist");
                return;
                
            }
            
        
        } catch (SQLException e) {
            System.out.println("Error on database method(searchAccount username): " + e.getMessage());
        }
    
    }
    
    public void deleteAccount(){
            
        int currentID = ManageUser.getUserID();
        
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
                    ManageUser.clearSession();
                    
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

//    ManageUser.setUserID(1000);
//    updateAccount(
//                "ervonrey", "zumi@gmail.com","ervon", "Ervon Rey", "Quinones",
//                "Mellisa", "", "Purok 1-B Burikaka",
//                "Baritongtong", "Davao del Sur");

//        searchAccount(1000);
//        searchAccount("ervon");
        
//        deleteAccount();
        
    }
    
}
