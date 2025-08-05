

import java.util.Scanner;

public class ConvertToBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, binary = 0;
        System.out.println("Enter number: ");
        num = sc.nextInt();

        while(num != 0){
            binary = (num %2) + binary;
            num = num %2;
        }
        System.out.println("Integer to Binary form: %d" + binary);
    }
}