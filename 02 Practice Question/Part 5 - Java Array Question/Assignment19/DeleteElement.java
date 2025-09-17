
import java.util.Scanner;

public class DeleteElement{
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

        System.out.print("Enter position to delete : ");
        int pos = sc.nextInt();

        if(pos < 0 || pos > size)
            System.out.println("Invalid position");

        for(int i = pos-1; i < size-1; i++){
            arr[i] = arr[i+1];
        }
        size = size-1;

        System.out.println("Array after deletion: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}