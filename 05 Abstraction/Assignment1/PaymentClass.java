
abstract class Payment{
    void paymentConfirmation(){
        System.out.println("Payment successful.");
    }

    abstract void processPayment(double amount);
}

class CreditPayment extends Payment{
    void processPayment(double amount){
        System.out.println("Credit card payment of: " + amount);
    }
}

class DebitPayment extends Payment{
    void processPayment(double amount){
        System.out.println("Debit card payment of: " + amount);

    }
}

class UPIPayment extends Payment{
    void processPayment(double amount){
        System.out.println("UPI card payment of: " + amount);
    }
}

class PayPalPayment extends Payment{
    void processPayment(double amount){
        System.out.println("PayPAl payment of: " + amount);
    }
}

public class PaymentClass{
    public static void main(String[] args) {
        
        Payment p;

        p = new CreditPayment();
        p.processPayment(2000);
        p.paymentConfirmation();
        System.out.println();

        p = new DebitPayment();
        p.processPayment(1500);
        p.paymentConfirmation();
        System.out.println();

        p = new UPIPayment();
        p.processPayment(1000);
        p.paymentConfirmation();
        System.out.println();

        p = new PayPalPayment();
        p.processPayment(500);
        p.paymentConfirmation();
        System.out.println();
    }
}