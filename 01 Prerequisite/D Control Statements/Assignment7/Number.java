
import java.util.Scanner;

public class Number{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0, a =1;

        while(a < num){
            if(num %a == 0){
                sum += a;
            }
            a++;
        }
        
        if (sum == num){
            System.out.println(num + " is a Perfect Number");
        } else if (sum > num){
            System.out.println(num + " is an Abundant Number");
        } else{
            System.out.println(num + " is a Deficient Number");
        }
    }
}
