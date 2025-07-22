
import java.util.Scanner;
class Calculator{

    void addition(int a, int b){
        System.out.println("Addition: " + (a+b));
    }
    void subtraction(int a, int b){
        System.out.println("Subtraction: " + (a-b));
    }
    void multiplication(int a, int b){
        System.out.println("Multiplication: " + (a*b));
    }
    void division(int a, int b){
        System.out.println("Division: " + (a/b));
    }
}

public class SwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator sd = new Calculator();

        int a,b, ch;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter choice: ");
        ch = sc.nextInt();

        switch (ch){
            case 1:
            sd.addition(a,b);
            break;

            case 2:
            sd.subtraction(a, b);
            break;

            case 3:
            sd.multiplication(a, b);
            break;

            case 4:
            sd.division(a,b);
            break;
                
            default:
                System.out.println("Invalid choice");
        }
    }
}