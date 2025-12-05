package User;

import UI.Login;
import javax.swing.JOptionPane;

/*

    This is for the creation of the account, its different from the session
    manager because this is for the creation of the account to increment the userID without issues.

    Its on the Function class in the autoIncrementID() method.

*/

public class ManageUser {
    
    private static int currentUserID;
    private static int currentBalanceID;
    
    public static void setUserID(int tempUserID){
        currentUserID = tempUserID;
    }
    
    public static int getUserID(){
        return currentUserID;
    }
    
    public static void setBalID(int tempBalID){
        currentBalanceID = tempBalID;
    }
    
    public static int getBalID(){
        return currentBalanceID;
    }
    
    public static void clearSession(){
        currentUserID = -1;
        currentBalanceID = -1;
        
        Login login = new Login();
        login.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Successfully logged off!");
    }
    
}