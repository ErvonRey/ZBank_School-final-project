package User;

import DatabaseConnection.DBConnection;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FullInformation {

    private String firstName;
    private String middleName;
    private String lastName;
    private String extensionName;
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String StreetPurok;
    private String MunicipalCity;
    private String Region;
    private String birthdate;

    // ======= SETTERS =======
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setMiddleName(String middleName){ this.middleName = middleName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void setExtensionName(String extensionName){ this.extensionName = extensionName; }
    public void setUsername(String username){ this.username = username; }
    public void setEmail(String email){ this.email = email; }
    public void setPhoneNumber(String phoneNumber){ this.phoneNumber = phoneNumber; }
    public void setPassword(String password){ this.password = password; }
    public void setStreetPurok(String StreetPurok){ this.StreetPurok = StreetPurok; }
    public void setMunicipalCity(String MunicipalCity){ this.MunicipalCity = MunicipalCity; }
    public void setRegion(String Region){ this.Region = Region; }
    public void setBirthdate(String birthdate){ this.birthdate = birthdate; }

    // ======= GETTERS =======
    public String getFirstName(){ return firstName; }
    public String getMiddleName(){ return middleName; }
    public String getLastName(){ return lastName; }
    public String getExtensionName(){ return extensionName; }
    public String getUsername(){ return username; }
    public String getEmail(){ return email; }
    public String getPhoneNumber(){ return phoneNumber; }
    public String getPassword(){ return password; }
    public String getStreetPurok(){ return StreetPurok; }
    public String getMunicipalCity(){ return MunicipalCity; }
    public String getRegion(){ return Region; }
    public String getBirthdate(){ return birthdate; }

    // ======= FETCHING INFO =======
    public void getInformation(int userID){

        try (Connection connection = DBConnection.getConnection()) {

            String getting_info_SQL =
                "SELECT " +
                "    u.user_username, u.user_email, u.user_password, " +
                "    i.user_first_name, i.user_middle_name, i.user_last_name, i.user_name_extension, " +
                "    i.user_birthdate, i.user_phone_number, " +
                "    a.purok_street, a.municipal_city, a.region " +
                "FROM bank_users u " +
                "LEFT JOIN users_information i ON u.user_id = i.user_id " +
                "LEFT JOIN users_address a ON u.user_id = a.user_id " +
                "WHERE u.user_id = ?;";

            PreparedStatement gettingInfo = connection.prepareStatement(getting_info_SQL);
            gettingInfo.setInt(1, userID);

            ResultSet rs = gettingInfo.executeQuery();

            if (rs.next()) {

                setFirstName(rs.getString("user_first_name"));
                setMiddleName(rs.getString("user_middle_name"));
                setLastName(rs.getString("user_last_name"));
                setExtensionName(rs.getString("user_name_extension"));

                setUsername(rs.getString("user_username"));
                setEmail(rs.getString("user_email"));
                setPassword(rs.getString("user_password"));
                setPhoneNumber(rs.getString("user_phone_number"));

                setStreetPurok(rs.getString("purok_street"));
                setMunicipalCity(rs.getString("municipal_city"));
                setRegion(rs.getString("region"));

                setBirthdate(rs.getString("user_birthdate"));
            }

        } catch (SQLException e) {
            System.out.println("Error on database method(getInformation users' info): " + e);
        }
    }
}
