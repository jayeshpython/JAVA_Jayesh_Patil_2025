
import java.util.Scanner;

public class PrimeArray{
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

        int sum =0;
        for(int i =0; i < arr.length; i++){
            int a = 2, flag =0;

            if(arr[i] <= 1){
                flag = 1;
            }
            else{
                while(arr[i]/2 >= a){
                    if(arr[i] %a == 0){
                        flag = 1;
                        break;
                    }
                    a++;
                }
            }
            if(flag == 0){
                sum += arr[i];
            }
        }
        System.out.println("Prime numbers sum: " + sum);
    }
}
  