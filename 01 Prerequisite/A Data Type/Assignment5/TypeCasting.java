import java.util.Scanner;
public class TypeCasting{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;
        double b;

        System.out.println("Enter integer number: ");
        a = sc.nextInt();
        System.out.println("Enter double value: ");
        b = sc.nextDouble();

        double c = a + b;
        System.out.println("After type casting: " + c);

    }
}