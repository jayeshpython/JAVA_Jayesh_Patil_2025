
/*
    - Write a program that prompts the user to enter a number.
    - If the number entered is negative, throw an "IllegalArgumentException"
	- If the number is positive print "Number is Accepted".
    - Catch the exception and display " -ve number are not allowed please try again"   	
*/

import java.util.*;

public class NumberExceptionClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number: ");
            int num = sc.nextInt();

            if(num < 0){
                throw new IllegalArgumentException();
            }
            System.out.println("Number is accepted");
        } catch (IllegalArgumentException e) {
            System.out.println("Negative number are not allowed");
        }
    }
}

