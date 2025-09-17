
import java.util.Scanner;

public class CountEvenOdd{
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

        int even = 0, odd = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even number: " + even);
        System.out.println("Odd number: " + odd);
    }
}