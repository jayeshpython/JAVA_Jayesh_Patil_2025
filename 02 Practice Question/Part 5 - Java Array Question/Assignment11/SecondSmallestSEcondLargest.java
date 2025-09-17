
import java.util.Scanner;

public class SecondSmallestSEcondLargest{
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

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second smallest element: " + arr[1]);
        System.out.println("Second largest element: " + arr[arr.length - 2]);
    }
}