
import java.util.Scanner;

public class RemoveDuplicate{
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
        int k = 0;

        for(int i = 0; i < arr.length; i++){
            int flag = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j] && i > j){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                b[k] = arr[i];
                k++;
            }
        }
        
        System.out.println("Array after removing duplicate elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(b[i] + " ");
        }
    }
}