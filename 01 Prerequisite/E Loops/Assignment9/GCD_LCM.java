
import java.util.Scanner;

public class GCD_LCM{
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        int a =1, b =1, high =1;

        while(a <= num1 && b <= num2){

            if(num1 %a == 0 && num2 %b == 0){
                high = a;
            }
            a++;
            b++;
        }
        System.out.println("The GCD of two numbers is: " + high);

        int lcm;
        lcm = (num1 * num2)/high;
        System.out.println("The LCM of two numbers is: " + lcm);
    }
}