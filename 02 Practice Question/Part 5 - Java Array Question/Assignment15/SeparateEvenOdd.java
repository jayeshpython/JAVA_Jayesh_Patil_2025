
import java.util.Scanner;

public class SeparateEvenOdd{
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

        int j =0, k =0;
        int[] b = new int[size];
        int[] c = new int[size];

        for(int i = 0; i< arr.length; i++){

            if(arr[i] %2 == 0){
                b[j] = arr[i];
                j++;
            }
            else{
                c[k] = arr[i];
                k++;
            }
        }

        System.out.println("Even elements array: ");
        for(int i = 0; i < j; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.println("Odd elements array: ");
        for(int i =0; i < k; i++){
            System.out.print(c[i] + " ");
        }
    }
}