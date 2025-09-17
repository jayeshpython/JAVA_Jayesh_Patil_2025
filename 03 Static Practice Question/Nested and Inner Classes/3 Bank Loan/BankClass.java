

class Bank{

    void calculateLoan(int amount){
        class Interest{
            float rateOfInterest = 0.3f;

            double calculateAmount(){
                return amount + (amount * rateOfInterest);
            }
        }

        Interest i = new Interest();
        double totalAmount = i.calculateAmount();
        
        System.out.println("Loan Amount: " + amount);
        System.out.println("Total Repayment: " + totalAmount);
    }
}

public class BankClass{
    public static void main(String[] args) {
        
        Bank b = new Bank();
        b.calculateLoan(10000);
    }
}

