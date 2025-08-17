

import java.util.Scanner;

class BankAccount{
    String holderName;
    String accountNumber;
    double balance;

    void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder name: ");
        holderName = sc.nextLine();
        System.out.println("Enter account number: ");
        accountNumber = sc.nextLine();
        System.out.println("Enter balance: ");
        balance = sc.nextDouble();
    }

    void displayDetails(){
        System.out.println("Account holder name: " + holderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    double deposit(double amount){
        balance += amount;
        return balance;
    }

    double withdrawal(double amount){
        balance -= amount;
        return balance;
    }
}

public class BankAccountTransaction{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double depositAmount, withdrwAmount;

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        System.out.println("Accept details for account 1: ");
        b1.acceptDetails();
        System.out.println("Accept details for account 2: ");
        b2.acceptDetails();

        System.out.println();
        b1.displayDetails();
        System.out.println();
        b2.displayDetails();

        System.out.println("Enter amount to deposit: ");
        depositAmount = sc.nextDouble();
        System.out.println("Enter amount to withdraw: ");
        withdrwAmount = sc.nextDouble();

        System.out.println();
        double depo1 = b1.deposit(depositAmount);
        System.out.println("Bank account 1 balance after deposit: " + depo1);
        double withd1 = b1.withdrawal(withdrwAmount);
        System.out.println("Bank account 1 balance after withrawal: " + withd1);

        System.out.println();
        double depo2 = b2.deposit(depositAmount);
        System.out.println("Bank account 2 balance after deposit: " + depo2);
        double withd2 = b2.withdrawal(withdrwAmount);
        System.out.println("Bank account 1 balance after withrawal: " + withd2);
    }
}