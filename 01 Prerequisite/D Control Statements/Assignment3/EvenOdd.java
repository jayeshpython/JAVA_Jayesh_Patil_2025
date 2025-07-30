import java.util.Scanner;

class Number{
    int num;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
    }
    void checkEvenOdd(){
        if(num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
public class EvenOdd{
    public static void main(String[] args) {
        Number ed = new Number();
        ed.accept();
        ed.checkEvenOdd();
    }
}