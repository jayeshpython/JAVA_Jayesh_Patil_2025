
import java.util.Scanner;

public class RotateArray{

    public static void rotateArray(int[] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

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

        int k;
        System.out.println("Enter size to rotate: ");
        k = sc.nextInt();

        k = k%size;

        rotateArray(arr,0, size-k-1);
        rotateArray(arr, size - k,size-1);
        rotateArray(arr, 0, size-1);

        System.out.println("Array after rotating by k: ");
        for(int i: arr){
            System.out.print(i + " ");
        }

    }
}