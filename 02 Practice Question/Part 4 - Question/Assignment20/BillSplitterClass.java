

import java.util.Scanner;

class BillSplitter{
    int amount;
    int numberOfFtrieds;
    int eachSplit;

    void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount: ");
        amount = sc.nextInt();
        System.out.println("Enter number of friends: ");
        numberOfFtrieds = sc.nextInt();
    }

    void calculateEachSplit(){
        eachSplit = amount/numberOfFtrieds;
    }

    void displayDetails(){
        System.out.println("Total bill: " + amount);
        System.out.println("Number of friends: " + numberOfFtrieds);
        System.out.println("Each split: " + eachSplit);
    }
}

public class BillSplitterClass{
    public static void main(String[] args) {
        
        BillSplitter b1 = new BillSplitter();
        b1.acceptDetails();
        b1.calculateEachSplit();
        b1.displayDetails();
    }
}