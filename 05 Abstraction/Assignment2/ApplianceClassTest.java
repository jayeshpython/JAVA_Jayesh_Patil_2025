
import java.util.Scanner;

abstract class Appliance{
    String status;

    abstract void turnON();
    abstract void turnOFF();

    void showStatus(){
        System.out.println("Appliance is " + status);
    }
}

class WashingMachine extends Appliance{
    void turnON(){
        System.out.println("Washing machine is turning on");
    }
    void turnOFF(){
        System.out.println("Washing machine is turning off");
    }
}

class Refrigerator extends Appliance{
    void turnON(){
        System.out.println("Refrigerator is turning on");
    }
    void turnOFF(){
        System.out.println("Refrigerator is turning off");
    }
}

public class ApplianceClassTest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Appliance a;

        while (true) {
            System.out.println("\nChoose Appliance:");
            System.out.println("1. Washing Machine");
            System.out.println("2. Refrigerator");
            System.out.println("3. Exit");
  
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    a = new WashingMachine();
                    break;

                case 2:
                    a = new Refrigerator();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.print("Enter Status (ON/OFF): ");
            a.status = sc.next();

            a.showStatus();
        }
    }
}