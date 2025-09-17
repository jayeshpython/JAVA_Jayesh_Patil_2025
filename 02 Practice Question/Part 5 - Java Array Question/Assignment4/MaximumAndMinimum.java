
import java.util.Scanner;

public class MaximumAndMinimum{
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

        int high = arr[0], low = arr[0];
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > high)
                high = arr[i];
            else if (arr[i] < low)
                low = arr[i];
        }
        System.out.println("Maximum element: " + high);
        System.out.println("Minimum element: " + low);
    }
}