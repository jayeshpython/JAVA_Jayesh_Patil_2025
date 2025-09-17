
import java.util.Scanner;

public class CopyArray{
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

        int[] b = new int[size];
        for(int i = 0; i< arr.length; i++){
            b[i] = arr[i];
        }
        System.out.println("Array b: ");
        for(int i : b){
            System.out.println(i);
        }

    }
}