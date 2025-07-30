import java.util.Scanner;

public class SumOfEvenDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,a, sum = 0;
        
        System.out.println("Enter number: ");
        num = sc.nextInt();

        while(num != 0){

            a = num%10;
            if(num % 2 ==0){
                sum += a;
            }
            num = num/10;
        }
        System.out.println("Sum of even digits: " + sum);
    }
}
