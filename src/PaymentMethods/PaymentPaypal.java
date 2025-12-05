package PaymentMethods;

//import here:


public class PaymentPaypal extends PaymentGeneric {
    
    private final String paymentMethod = "Paypal";
    
    @Override
    public void pay(double value) {
        
        payHelper(value, paymentMethod);
        record.recordPay(value, paymentMethod);
        
    }
}
