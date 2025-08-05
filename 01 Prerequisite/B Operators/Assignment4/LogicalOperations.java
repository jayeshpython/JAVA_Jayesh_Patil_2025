
import java.util.Scanner;

public class LogicalOperations{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first boolean: ");
        boolean a = sc.nextBoolean();

        System.out.println("Enter second boolean: ");
        boolean b = sc.nextBoolean();

        System.out.println("Logical Operations");
        System.out.println("Checking both are true: " + (a && b));
        System.out.println("Checking either one is true: " + (a || b));
        System.out.println("Reverse a: " + (!a));
        System.out.println("Reverse b: " + (!b));
    }
}