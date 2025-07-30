import java.util.Scanner;

public class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,a, cnt =0;
        
        System.out.println("Enter number: ");
        num = sc.nextInt();

        while(num != 0){
            cnt++;
            num = num/10;
        }
        System.out.println("Total number of digits: " + cnt);
    }
}
