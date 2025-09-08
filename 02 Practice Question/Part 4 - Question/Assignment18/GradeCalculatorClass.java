

import java.util.Scanner;

class GradeCalculator{
    String name;
    int rollNo;
    int[] marks = new int[5];
    float percentage;
    char grade;

    void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = sc.nextLine();
        System.out.println("Enter student roll no: ");
        rollNo = sc.nextInt();
        
        System.out.println("Enter mrks for 5 subjects: ");
        for(int i = 0; i < marks.length; i++){
            marks[i] = sc.nextInt();
        }
    }

    void calculatePercentage(){
        int total = 0;
        for(int i =0; i < marks.length; i++){
            total += marks[i];
        }

        percentage = total/3.0f;
    }

    char calculateGrade(){

        if(percentage > 75)
            return 'A';
        else if(percentage >= 60 && percentage < 75)
            return 'B';
        else if(percentage >= 40 && percentage <60)
            return 'C';
        else 
            return 'F';
    }
}

public class GradeCalculatorClass{
    public static void main(String[] args) {
        
        char grade;
        GradeCalculator gc = new GradeCalculator();
        gc.acceptDetails();
        gc.calculatePercentage();
        grade = gc.calculateGrade();

        System.out.println("Grade scored by student: " + grade);
    }
}