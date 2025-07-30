import java.util.Scanner;

class Number{
    int num1, num2, num3;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        num2 = sc.nextInt();

        System.out.println("Enter number 3: ");
        num3 = sc.nextInt();
    }
    void checkMaxNumber(){

        if((num1 > num2) && (num1 > num3))
            System.out.println("Number 1 is greatest");
        else if((num2 > num1) && (num2 > num3))
            System.out.println("Number 2 is greatest");
        else{
            System.out.println("Number 3 is greatest");
        }
    }
}
public class MaximumNumber{
    public static void main(String[] args) {
        Number n = new Number();
        n.accept();
        n.checkMaxNumber();
    }
}