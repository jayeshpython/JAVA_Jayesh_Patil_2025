
import java.util.Scanner;

public class PrintFactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Factors of number: " + num);
        int a =1;

        while(a <= num){

            if(num % a == 0){
                System.out.print(a + " ");
            }
            a++;
        }
    }
}