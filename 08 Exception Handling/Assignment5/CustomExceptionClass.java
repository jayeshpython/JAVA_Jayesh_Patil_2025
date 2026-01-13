/*

   - To define a custom exception call "InvalidGradeExcption"
   - Write a program which prompts the user to enter grades(A, B, C, D, F)
   - If the grade entered is not one of the valid option (A, B, C, D, F) throw the custom exception. 
   - Catch the exception and display "Invalid grade entered ! please try again".

*/
//package Assignment5;
import java.util.*;

class ExceptionClass{
   private String grade;

   public ExceptionClass(String grade) throws InvalidGradeException{
      this.grade = grade;

      if(!grade.equals("A") && !grade.equals("B") && !grade.equals("C") && !grade.equals("D") && !grade.equals("F")){
            throw new InvalidGradeException("Invalid grade entered ! please try again");
      }
      System.out.println("Valid grades are enterd"); 
   }
}

public class CustomExceptionClass{
   public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      String grade;

      try{
         System.out.print("Enter grades for 3 subjects: ");
         for(int i = 0; i < 3; i++){
            grade = sc.next();
            ExceptionClass ex = new ExceptionClass(grade);
         }

      }catch(InvalidGradeException e){
         System.out.println("Error: " + e.getMessage());
      }
   }
}
