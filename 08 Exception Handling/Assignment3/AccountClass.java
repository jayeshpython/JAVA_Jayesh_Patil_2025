/*
    - Write a Java program that: 
	  1. Prompts the user to enter their current account balance & withdrawal amount.
	  2. Throws an IllegalArgumentException if the withdrawal amount is greater than the account balance.
	  3. Diplay the message "Transaction Successful" if the withdrawal is valid.
	  4. If an exception occurs, catch it and display "Insufficient balance ! Transaction failed!"

*/

class BankAccount{
    private String holderName;
    private double balance;

    public BankAccount(String holderName, double balance){
        this.holderName = holderName;
        this.balance = balance;
    }

    String getHolderName(){ return holderName;}
    double getBalance() { return balance;}

    void withdraw(double amount) throws IllegalArgumentException{
        if(amount > balance){
            throw new IllegalArgumentException("Insufficinet bank balance.");
        }
        balance -= amount;
    }
}

public class AccountClass{
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount("Karan", 10000);
       
        try {
            b1.withdraw(5000);
            System.out.println("Transaction successful");
            System.out.println("Remaining balance: " + b1.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Insufficient balance ! Transaction failed!");
        }
    }
}