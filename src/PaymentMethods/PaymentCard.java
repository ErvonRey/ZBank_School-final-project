package PaymentMethods;

//import here:


public class PaymentCard extends PaymentGeneric {
    
    private final String paymentMethod = "Card";
    
    @Override
    public void pay(double value) {
        
        payHelper(value, paymentMethod);
        record.recordPay(value, paymentMethod);
        
    }
    
}
