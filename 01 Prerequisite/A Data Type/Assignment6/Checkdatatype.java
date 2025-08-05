
import java.util.Scanner;
public class Checkdatatype{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num;
        System.out.println("Enter number: ");
        num = sc.nextLong();

        if(num >= -128 && num <= 128)
            System.out.println("Can be stored in byte");
        else
            System.out.println("Cannot stored in byte");

        if(num >= -32768 && num <= 32767)
            System.out.println("Can be stored in short");
        else
            System.out.println("Cannot stored in short");

        if(num >= -2147483648 && num <= 2147483647)
            System.out.println("Can be stored in short");
        else
            System.out.println("Cannot stored in short");

        System.out.println("Can be stored in long");

        sc.close();
    }

}