/*

  Write a program for nested try and multiple catch: 
  1. Use a scanner input
  2. Perform following operations inside nested try block.
		i) Ask the user to enter an integer divisor 
	   ii) Divide 100 by the divisor and handle the Arithmetic Exception
	  iii) In inner try block ask the user the size of array and create that size   array and handle the negative size array exception(NegativeArraySizeExcption)
       iv) Ask the user to enter an index to access the  array. Asign value to specific index and handle ArrayOutOfBoundException
        v) Provide specific error message for each exception using appropriate blocks. 	   

*/

import java.util.Scanner;

public class MultipleException{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter integer divisor: ");
            int divisor = sc.nextInt();

            int result = 100/divisor;
            System.out.println("Result: " + result);

            try {
                System.out.print("Enter size of array: ");
                int size = sc.nextInt();

                int[] arr = new int[size];

                System.out.println("Enter index to insert value: ");
                int index = sc.nextInt();

                arr[index] = 20;
                System.out.println("Value enter in array at index " + index);

            } catch (NegativeArraySizeException e) {
                System.out.println("Error: Array size can't be nagative");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: Index is out of array range");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}