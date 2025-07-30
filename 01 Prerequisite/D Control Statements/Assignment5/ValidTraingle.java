
import java.util.Scanner;

public class ValidTraingle{

    void displayTraingleSide(int a, int b, int c){
        System.out.println("Side 1: " + a);
        System.out.println("Side 2: " + b);
        System.out.println("Side 3: " + c);
    }
    void validTraingle(int a, int b, int c){

        if(a + b > c && b + c > a && a + c > b)
            System.out.println("The traingle is valid");
        else
            System.out.println("The traingle is not valid");
    }

    public static void main(String[] args) {

        ValidTraingle vt = new ValidTraingle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first side: ");
        int a = sc.nextInt();
        System.out.println("Enter second side: ");
        int b = sc.nextInt();
        System.out.println("Enter third side: ");
        int c = sc.nextInt();

        vt.displayTraingleSide(a, b, c);
        vt.validTraingle(a, b, c);
    }
}