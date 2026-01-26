
/*Write a Java program that reads a line of integers and then displays each
integer and the sum of all integers. (Use String Tokenizer class)?
 */

import java.util.*;

public class IntegerClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter string of numbers: ");
        String numbers = sc.nextLine();

        StringTokenizer str = new StringTokenizer(numbers, " ");

        int sum = 0;

        System.out.println("String as integer: ");
        while(str.hasMoreTokens()){
            int num = Integer.parseInt(str.nextToken());
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println("\nSum of all integer values inside string: " + sum);
    }
}