
import java.util.Scanner;
public class GreatestNumber{
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        num3 = sc.nextInt();

        if(num1 > num2  && num1 > num3){
            System.out.println("First number is greatest");
        }
        else if(num2 > num1 && num2 > num3)
            System.out.println("Second number is greatest");
        else 
            System.out.println("Third number is greatest");
    }
}