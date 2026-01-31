
/*Create a method that accepts a number and modifies it such that the each of the digit in
the newly formed number is equal to the difference between two consecutive digits in the
original number. The digit in the unit place can be left as it is.
Note: Take the absolute value of the difference. Ex: 6-8 = 2
Method Name modifyNumber
Method Description Accepts a number and modify it as per the

requirement
Argument int number1
Return Type int
Logic Accept a number and modify it such that the each of
the digit in the newly formed number is equal to the
difference between two consecutive digits in the
original number.
For example.
Input: 45862
Output:13242
Algorithm:
 Convert number into String
 Extract each char using charAt method
 Convert char to int and find the difference
 Create new StringBuffer object and keep adding
the difference
 Finally convert StringBuffer to int
 */

import java.util.Scanner;

public class ModifyNumberClass {
    
    static int modifyNumber(int number1){

        StringBuffer result = new StringBuffer();

        String num = Integer.toString(number1);  //num = 45862

        for(int i = 0; i < num.length()-1; i++){
            int num1 = (num.charAt(i+1) -'0') , num2 = (num.charAt(i) - '0');
            int a = num1 - num2;
            if(a < 0) a = a*(-1);
            result.append(a); // append only positive
        }
        result.append(num.charAt(num.length()-1));

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ModifyNumberClass modify = new ModifyNumberClass();

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int result = ModifyNumberClass.modifyNumber(number);
        System.out.println("Number after modifying: " + result);
    }
}
