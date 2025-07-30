
import java.util.Scanner;

public class StrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,a, sum = 0;
        
        System.out.println("Enter number: ");
        num = sc.nextInt();

        int number = num;

        while(number != 0){

            a = number %10;

            int fact = 1;
            int i = 1;

            while(i <= a){
                fact = fact *i;
                i++;
            }
            sum += fact;
            number = number/10;
        }

        if(sum == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is not a Strong Number");
        }
    }
}