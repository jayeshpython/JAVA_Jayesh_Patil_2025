
/*


	*** Reverse Number and start ***
	
	- Write a method that accepts an array of integer, reverses each number and returns the resulting array in sorted order.
	
	- Method Name: qetSorted() 
    - Method Description: Reverse each number, sort the aray, and return it.  
    - Input: int [] numbers 
    - Retun Type: int[] 
	
    - Additional Challenge: Handle Ieading zeros in reversed numbrs	
*/
import java.util.Arrays;
import java.util.Scanner;

class ArrayNumbers{
    
    public int[] getSorted(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int rev = 0;
            int a = 0;

            while(arr[i] != 0){
                a = arr[i] %10;
                rev = rev*10 + a;
                arr[i] = arr[i]/10;
            }
            arr[i] = rev;
           
        }
        Arrays.sort(arr);
        return arr;
    }
}

public class ReverseNumberClass {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter values in array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        ArrayNumbers array = new ArrayNumbers();
        int[] b = array.getSorted(arr);

        System.out.println("\nReversed and sorted array elements:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
