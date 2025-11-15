package User;

/*

    This is for the creation of the account, its different from the session
    manager because this is for the creation of the account to increment the userID without issues.

    Its on the Function class in the autoIncrementID() method.

*/

public class ManageUser {
    
    private static int userID;
    
    public static void setCurrentUserID(int tempUserID){
        userID = tempUserID;
    }
    
    public static int getCurrentUserID(){
        return userID;
    }
    
}