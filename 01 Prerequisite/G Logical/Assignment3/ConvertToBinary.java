

import java.util.Scanner;

public class ConvertToBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter number: ");
        num = sc.nextInt();

        int []binary = new int[10];
        int i = 0;

        while(num != 0){
           binary[i] = num %2;
           num = num /2;
           i++;
        }

        System.out.println("Integer to Binary form: ");
        for(int j = i-1; j >= 0; j--){
            System.out.print(binary[j]);
        }
    }
}