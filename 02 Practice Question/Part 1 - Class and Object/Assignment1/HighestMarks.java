
import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    int m1,m2,m3;
    float total;

    void acceptDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter roll no: ");
        rollNo = sc.nextInt();
        System.out.println("Enter m1 marks: ");
        m1 = sc.nextInt();
        System.out.println("Enter m2 marks: ");
        m2 = sc.nextInt();
        System.out.println("Enter m3 marks: ");
        m3 = sc.nextInt();
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("M1 marks: " + m1);
        System.out.println("M2 marks: " + m2);
        System.out.println("M3 marks: " + m3);
    }

    void findHighestMarks(){
        total = (m1 + m2 + m3)/3.0f;
    }

    Student compareMarks(Student s1, Student s2){

        if(this.total > s1.total && this.total > s2.total)
            return this;

        if(this.total < s1.total && s1.total > s2.total)
            return s1;
        return s2;
    }
}

public class HighestMarks{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Accept details for student 1: ");
        s1.acceptDetails();
        System.out.println("Accept details for student 2: ");
        s2.acceptDetails();
        System.out.println("Accept details for student 3: ");
        s3.acceptDetails();

        System.out.println("Displaying student 1 details: ");
        s1.displayDetails();
        System.out.println("Displaying student 2 details: ");
        s2.displayDetails();
        System.out.println("Displaying student 3 details: ");
        s3.displayDetails();

        System.out.println("Displaying details of student with highst marks: ");
        Student s4 = s1.compareMarks(s2, s3);
        s4.displayDetails();
    }
}
