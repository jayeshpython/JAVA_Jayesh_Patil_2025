

class Payment{
    void makePayment(){
        System.out.println("Payment class Processing.");
    }
}

class CreditCardPayment extends Payment{
    @Override
    void makePayment(){
        System.out.println("Credit card payment processing.");
    }
}

class DebitCardPayment extends Payment{
    @Override
    void makePayment(){
        System.out.println("Debit card payment processing.");
    }
}

class NetBankingPayment extends Payment{
    @Override
    void makePayment(){
        System.out.println("Net banking processing.");
    }
}

public class PaymentClass{
    public static void main(String[] args) {
         Payment p = new Payment();
         p.makePayment();
         System.out.println();
         p = new CreditCardPayment();
         p.makePayment();
         System.out.println();
         p = new DebitCardPayment();
         p.makePayment();
         System.out.println();
         p = new NetBankingPayment();
         p.makePayment();
    }
}