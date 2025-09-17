
import java.util.Scanner;

public class EvenOddIndex{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter size: ");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int evenSum =0, oddSum =0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
    }
}