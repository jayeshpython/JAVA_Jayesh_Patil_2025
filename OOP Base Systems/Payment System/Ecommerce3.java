// Payment Gateway System - Polymorphism Example

class Payment {
    void processPayment(double amount) {
        System.out.println("Processing generic payment of " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of " + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}

public class Ecommerce3 {
    public static void main(String[] args) {
        Payment p;

        // Runtime decision → CreditCardPayment
        p = new CreditCardPayment();
        p.processPayment(1000);

        // Runtime decision → UPIPayment
        p = new UPIPayment();
        p.processPayment(2000);

        p = new Payment();
        p.processPayment(3000);


    }
}
