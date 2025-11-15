package User;

public class SessionManager {
    
    SessionManager(){}
    
    private static int currentUserID;

    public static int getUserID(){
        return currentUserID;
    }
    
    public static void setUserID(int userID){
        currentUserID = userID;
    }
    
    public static void clearSession(){
        currentUserID = -1;
    }

}
