

import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,a = 0, b = 1, sum = 0;
        
        System.out.println("Enter number: ");
        num = sc.nextInt();

        System.out.println("Fibonacci Series: ");
        while(sum <= num){
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a+b;
        }
    }
}