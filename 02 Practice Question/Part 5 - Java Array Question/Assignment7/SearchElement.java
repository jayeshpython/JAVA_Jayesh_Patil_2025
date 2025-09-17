
import java.util.Scanner;

public class SearchElement{
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

        int key, flag = 0;
        System.out.println("Enter element to search: ");
        key = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("key found");
        }else
            System.out.println("key not found");
    }
}