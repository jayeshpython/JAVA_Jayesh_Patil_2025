
/*

	- Design an online payment sytem using the interfaces. 
	- Implement the folllowing requirements: 
	
		- Interface PaymentMethod: 
			-> Define a constant TransactionFee = 0.02. 
			-> Add an abstract method pay(double amount).
			-> Create a default method calculateFee(double amount).
			to calculate and print the  fee based on TransactionFee. 
			-> Add a static method to print TransactionLimit() which display transaction limit as 1 lakh.
		
		- Additional Interfaes: 
			-> interface OnlineTranfer with an abstract method   AuthenticateUser(string Username, string Password).
			-> interface CardPayment with an abstract method verifyCardDetails(String CardNumber,string ExpiryDate)
			
		- Classes:
			-> CreditCard :
					It implements paymentMethod , CardPayment and fields for CardNumber and ExpiryDate.
					also implements verifyCardDetails().
			-> DigitalWallet: 
					It implements PaymentMethod , OnlineTranfer and has fields for 
					Username and Password.
					also implements AuthenticateUser().
					
    - Create objects of CreditCard and DigitalWallet and demonstrate pay(),calculateFee() and print TransactionLimit().
*/

import java.util.*;

interface PaymentMethod{

    double transactionFee = 0.02;
    abstract void pay(double amount);

    default double calculateFee(double amount){

        if(amount <= 0){
            System.out.println("Deposit some amount of money.");
        }
        return transactionFee * amount;
    }

    static void transactionLimit(){
        System.out.println("Transaction limit : 100000");
    }
}

interface OnlineTranfer{
    abstract void authenticateUser(String Username, String Password);
}

interface CardPayment{
    abstract void verifyCardDetails(String CardNumber, String ExpiryDate);
}



class CreditCard implements PaymentMethod, CardPayment{
    String cardNumber;
    String expiryDate;

    public CreditCard(String cardNumber, String expiryDate){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount){
        double fee = calculateFee(amount);
        System.out.println("Paid " + amount + " using Card");
        System.out.println("Transaction Fee: " + fee);
    }

    @Override
    public void verifyCardDetails(String CardNumber, String ExpiryDate){
        if(this.cardNumber.equals(CardNumber) && this.expiryDate.equals(ExpiryDate)){
            System.out.println("Card details varified");
        }
        else{
            System.out.println("Card details didn't varified");
        }
    }
}

class DigitalWallet implements PaymentMethod, OnlineTranfer{
    String username;
    String password;

    public DigitalWallet(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(double amount){
        double fee = calculateFee(amount);
        System.out.println("Paid " + amount + " using Digital Wallet");
        System.out.println("Transaction Fee: " + fee);
    }

    @Override
    public void authenticateUser(String Username, String Password){
        if(this.username.equals(Username) && this.password.equals(Password)){
            System.out.println("User details are authenticate");
        }
        else{
            System.out.println("User details are not authenticate");
        }
    }

}

public class OnlinePaymentSystem{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        PaymentMethod.transactionLimit();
        System.out.println();

        CreditCard cc = new CreditCard("1234", "07/28");
        DigitalWallet dw = new DigitalWallet("Karan", "Karan@1234");
        System.out.println();

        System.out.println("Enter card number: ");
        String cardNumber = sc.nextLine();
        System.out.println("Enter expiry date: ");
        String expiryDate = sc.nextLine();
        System.out.println("Enter user name: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        System.out.println();

        cc.verifyCardDetails(cardNumber, expiryDate);
        System.out.println();
        dw.authenticateUser(username, password);
        System.out.println();

        cc.pay(5000);
        System.out.println();
        dw.pay(2000);
    }
}
