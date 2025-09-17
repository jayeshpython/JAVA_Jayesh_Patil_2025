
import java.util.Scanner;

public class InsertElement{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter size: ");
        size = sc.nextInt();

        int[] arr = new int[size +1];
        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to insert: ");
        int key = sc.nextInt();

        System.out.print("Enter position to insert : ");
        int pos = sc.nextInt();

        if(pos < 0 || pos > size+1)
            System.out.println("Invalid position");

        for(int i = size; i >= pos; i--){
            arr[i] = arr[i-1];
        }

        arr[pos - 1] = key;

        System.out.println("Array after insertion: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}