

import java.util.Scanner;

class NumberStats{

    void countEvenOddNumbers(int[] arr){

        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even++;
            }
            else
                odd++;
        }
        System.out.println("Even number count: " + even);
        System.out.println("Odd number count: " + odd);
    }
    void countPositiveNegativeZero(int[] arr){

        int post = 0, negt = 0, zero = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 1)
                post++;
            else if(arr[i] < 1)
                negt++;
            else
                zero++;
        } 
        System.out.println("Positive number count: " + post);
        System.out.println("Negative number count: " + negt);
        System.out.println("Zero number count: " + zero);  
    }
    void countTotalAverage(int[] arr){

        int total = 0;
        float avg = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        avg = total/arr.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

public class NumberStatsClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        NumberStats n1 = new NumberStats();

        int[] arr = new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        n1.countEvenOddNumbers(arr);
        n1.countPositiveNegativeZero(arr);
        n1.countTotalAverage(arr);
    }
}