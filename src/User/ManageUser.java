package User;

/*

    This is for the creation of the account, its different from the session
    manager because this is for the creation of the account to increment the userID without issues.

    Its on the Function class in the autoIncrementID() method.

*/

public class ManageUser {
    
    public ManageUser(){}
    
    private int currentUserID;
    private int currentBalanceID;
    
    public void setUserID(int tempUserID){
        currentUserID = tempUserID;
    }
    
    public int getUserID(){
        return currentUserID;
    }
    
    public void setBalID(int tempBalID){
        currentBalanceID = tempBalID;
    }
    
    public int getBalID(){
        return currentBalanceID;
    }
    
    public void clearSession(){
        currentUserID = -1;
        currentBalanceID = -1;
    }
    
}