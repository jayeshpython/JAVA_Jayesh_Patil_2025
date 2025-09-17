
import java.util.Scanner;

public class IntegerClass{
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

        System.out.println("Displaying array elements: ");
        for(int a: arr){
            System.out.println(a);
        }
    }
}