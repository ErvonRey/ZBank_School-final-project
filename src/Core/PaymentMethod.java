package Core;

public class PaymentMethod {
    
    private double balance;
    
    public void updateBalance(){
        
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void pay(double value){
        System.out.println("");
    }
    
}

class PaymentPaypal extends PaymentMethod{
    
    
    
    public void pay(double value){
        
        //deduct what they paid for
        
    }
    
}

class PaymentCard extends PaymentMethod{
    
    public void pay(double value){
        
        //deduct what they paid for 
        
    }
    
}