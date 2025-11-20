package DatabaseConnection;

//Coded by a BSIT 2A student at DSSC

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/bankdb";     //URL of the Database
    private static final String USER = "ervonrey";                              //USERNAME of the Database
    private static final String PASSWORD = "mellisaAdmin1023!";                 //PASSWORD of the Database
    
    public static Connection getConnection(){
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Connected Successfully");     //debugging
        } catch (SQLException e) {
            
            e.printStackTrace();
            System.out.println("Error at connecting to Database");
            
        }
        
        return connection;
        
    }
    
}
