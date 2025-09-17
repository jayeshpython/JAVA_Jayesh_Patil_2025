
import java.util.Scanner;

public class NegativeElement{
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

        System.out.println("Negative elements: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }
        }
    }
}