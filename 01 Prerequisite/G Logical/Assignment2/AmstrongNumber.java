
import java.util.Scanner;

public class AmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int a, amst = 0, number = num;

        while(number != 0){
            a = number %10;
            amst = amst + (a * a * a);
            number = number /10;
        }
        if(num == amst){
            System.out.println("Amstrong number");
        }else{
            System.out.println("Not amstrong number");
        }
    }
}