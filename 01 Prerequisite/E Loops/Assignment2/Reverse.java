
import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, a, reverse = 0;
        
        System.out.println("Enter number: ");
        num = sc.nextInt();

        while(num != 0){
            a = num %10;
            reverse = reverse *10 + a;
            num = num/10;
        }
        System.out.println("Reversed number: " + reverse);
    }
}