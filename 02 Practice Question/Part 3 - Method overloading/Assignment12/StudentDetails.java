

class Student{
   
    void display(String name, int rollNo){
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
    }

    void display(String name, int rollNo, int m1, int m2, int m3){
        
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("M1 marks: " + m1);
        System.out.println("M2 marks: " + m2);
        System.out.println("M3 marks: " + m3);
    }

    void display(String name, int rollNo, int m1, int m2, int m3, float percentage){

        percentage = (m1+m2+m3)/3.0f;
        char grade;

        if(percentage >= 90)
            grade = 'A';
        if(percentage >= 75)
            grade = 'B';
        if(percentage >= 60)
            grade = 'C';
        if(percentage >= 50)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("M1 marks: " + m1);
        System.out.println("M2 marks: " + m2);
        System.out.println("M3 marks: " + m3);
        System.out.println("Grade: " + grade);
    }
}

public class StudentDetails{
    public static void main(String[] args) {
        
        Student s = new Student();

        s.display("Raj", 21);
        System.out.println();
        s.display("Ketan", 11, 90, 92, 87);
        System.out.println();
        s.display("Sameer", 10, 90, 98, 82, 0.0f);
    }
}