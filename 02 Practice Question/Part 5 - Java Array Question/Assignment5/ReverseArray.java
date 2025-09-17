
import java.util.Scanner;

public class ReverseArray{
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

        for(int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Reversed array: ");
        for(int i : arr){
            System.out.println(i);
        }
    }
}