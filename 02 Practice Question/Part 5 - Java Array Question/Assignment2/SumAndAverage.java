
import java.util.Scanner;

public class SumAndAverage{
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

        float sum = 0;
        float avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = sum/arr.length;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + avg);

    }
}