
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, a;
        int fact = 1;

        System.out.println("Enter number: ");
        num = sc.nextInt();

        while(num != 0){

            a = num % 10;
            fact = fact * a;
            num--;
        }
        System.out.println("Factorial: " + fact);
    }
}