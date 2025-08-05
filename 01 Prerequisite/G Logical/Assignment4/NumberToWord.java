

import java.util.Scanner;

public class NumberToWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, a, b, reverse = 0;
        System.out.println("Enter number: ");
        num = sc.nextInt();

        int temp = num;
        while(temp != 0){
            a = temp %10;
            reverse = reverse *10 + a;
            temp = temp/10;
        }
        
        while(reverse != 0){
            b = reverse %10;

            switch(b){
                case 0: System.out.print("zero "); break;
                case 1: System.out.print("one "); break;
                case 2: System.out.print("two "); break;
                case 3: System.out.print("three "); break;
                case 4: System.out.print("four "); break;
                case 5: System.out.print("five "); break;
                case 6: System.out.print("six "); break;
                case 7: System.out.print("seven "); break;
                case 8: System.out.print("eight "); break;
                case 9: System.out.print("nine "); break; 
            }
            reverse = reverse/10;
        }
    }
}