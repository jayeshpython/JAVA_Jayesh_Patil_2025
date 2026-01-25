

/*
	- Create a class " MethodExample " to demonstrate exception handling for arithmetic operations. 
	- The program should include a method named divide() that takes two integer argument : 
			- numerator 
			- denomenator 
	- the devide() should perform division and return the result. 
	- If the denomenator is 0 then the program should throw an arithmetic exception which must be caught and handle in ain method.
*/

import java.util.*;

public class MethodExample{

    static double divide(double num, double den)throws ArithmeticException{
        if(den == 0){
            throw new ArithmeticException();
        }
        return num/den;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        double n = sc.nextDouble();
        System.out.println("Enter denominator: ");
        double d = sc.nextDouble();

        try {
            double result = MethodExample.divide(n,d);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division can't be possibl by 0");
        }
        
    }
}