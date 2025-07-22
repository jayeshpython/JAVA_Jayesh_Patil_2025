
import java.util.Scanner;

public class MenuDriven{

    void addition(int a, int b){
        System.out.println("Addition of two numbers: " + (a+b));
    }
    void subtraction(int a, int b){
        System.out.println("Subtration of two numbers: " + (a-b));
    }
    void multiplication(int a, int b){
        System.out.println("Multiplication of two numbers: " + (a*b));
    }
    void division(int a, int b){
       if(b == 0){
            System.out.println("Cannot divide by zero");
        } else{
            System.out.println("Division of two numbers: " + (a / b));
        }
    }

    public static void main(String[] args) {
        MenuDriven cd = new MenuDriven();
        Scanner sc = new Scanner(System.in);

        int a, b, ch;

        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();

        while(true){
            System.out.println("Menu driven program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                cd.addition(a, b);
                break;

                case 2:
                cd.subtraction(a, b);
                break;

                case 3:
                cd.multiplication(a, b);
                break;

                case 4:
                cd.division(a, b);
                break;

                case 5:
                System.out.println("Exiting program.");
                System.exit(0);

                default:
                System.out.println("Invalid choice");
                
            }
        }
    }
}