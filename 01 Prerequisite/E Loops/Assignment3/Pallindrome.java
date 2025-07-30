

import java.util.Scanner;

public class Pallindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,a, reverse = 0;
        
        System.out.println("Enter number: ");
        num = sc.nextInt();

        int number = num;

        while(number != 0){
            a = number %10;
            reverse = reverse *10 + a;
            number = number/10;
        }

        if(num == reverse){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}