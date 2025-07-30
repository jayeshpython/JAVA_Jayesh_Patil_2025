
import java.util.Scanner;
class Student{
    int m1, m2, m3;
    float percentage;

    void acceptDetails(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for m1: ");
        m1 = sc.nextInt();
        System.out.println("Enter marks for m2: ");
        m2 = sc.nextInt();
        System.out.println("Enter marks for m3: ");
        m3 = sc.nextInt();
    }
    void calculatePercentage(){

        percentage = (m1 + m2 + m3)/3;
    }
    void displayDetails(){
        System.out.println("M1 marks: " + m1);
        System.out.println("M2 marks: " + m2);
        System.out.println("M3 marks: " + m3);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + calculateGrade());
    }
    String calculateGrade(){

        if(percentage >= 90)
            return "A";
        else if(percentage >= 80)
            return "B";
        else if(percentage >= 70)
            return "C";
        else if(percentage >= 60)
            return "D";
        else
            return "Fail";
    }
}

public class CalculateGrade{
    public static void main(String[] args) {
        
        Student stud = new Student();
        stud.acceptDetails();
        stud.calculatePercentage();
        stud.displayDetails();
    }
}