
import java.util.Scanner;

public class MergeArray{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter size: ");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements for array a: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] b = new int[size];
        System.out.println("Enter elements for array b: ");
        for(int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
        }

        int[] c = new int[arr.length + b.length];

        for(int i = 0; i < arr.length; i++){
            c[i] = arr[i];
        }
        for(int j = 0; j < b.length; j++){
            c[arr.length + j] = b[j];
        }

        for(int i = 0; i < c.length; i++){
            for(int j = i+1; j < c.length; j++){

                if(c[i] > c[j]){
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        System.out.println("Merged Array: ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}