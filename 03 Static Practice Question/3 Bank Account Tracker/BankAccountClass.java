

class BankAccount{
    private int accountNo;
    private static int generateNo = 10001;
    private static int totalAccount = 0;

    public BankAccount(){
        this.accountNo = generateAccountNumber();
        totalAccount++;
    }

    public static int generateAccountNumber(){
        generateNo = 20+ generateNo;
        return generateNo;
    }

    public void displayAccountNumber(){
        System.out.println("Account Number: " + accountNo);
    }

    public static void showTotalAccount(){
        System.out.println("Total account:: " + totalAccount);
    }
}

public class BankAccountClass{
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();

        acc1.displayAccountNumber();
        System.out.println();
        acc2.displayAccountNumber();
        System.out.println();
        acc3.displayAccountNumber();
        System.out.println();
        BankAccount.showTotalAccount();
    }
}