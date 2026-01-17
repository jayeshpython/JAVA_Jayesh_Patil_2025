
/*
    - Build a student management System for school the System needs to handle following. 
	
	1) Store the name of student in each class (class A, Class B, etc.)
	2) Ensure no duplicate names exists within the same class.
	3) Quickly retrive the list of students for the specific class when requested .
*/

import java.util.*;

class StudentManagement{
    HashMap<String, HashSet<String>> student = new HashMap<>();

    public void addStudent(String className, String studentName){
        student.get(className).add(studentName);
    }

    public void displayStudents(String className){
        System.out.println("Students in " + className);
        System.out.println(student.get(className));
    }

}

public class StudentManagementSystem{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        StudentManagement stud = new StudentManagement();
        stud.student.put("Class A", new HashSet<>());
        stud.student.put("Class B", new HashSet<>());
        stud.student.put("Class C", new HashSet<>());
        int ch;

        do { 
            System.out.println("******** Student Management System ********");
            System.out.println("1. Add student in Class A.");
            System.out.println("2. Add student in class B.");
            System.out.println("3. Add student in class C.");
            System.out.println("4. Display students from Class A.");
            System.out.println("5. Display students from class B.");
            System.out.println("6. Display students from class C.");
            System.out.println("7. Exiting....");

            System.out.println("Enter choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Enter student name: ");
                    String studentA = sc.next();
                    stud.addStudent("Class A", studentA);
                    break;

                case 2:
                    System.out.println("Enter student name: ");
                    String studentB = sc.next();
                    stud.addStudent("Class B", studentB);
                    break;

                case 3:
                    System.out.println("Enter student name: ");
                    String studentC = sc.next();
                    stud.addStudent("Class C", studentC);
                    break;

                case 4:
                    stud.displayStudents("Class A");
                    break;

                case 5:
                    stud.displayStudents("Class B");
                    break;

                case 6:
                    stud.displayStudents("Class C");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 7);
        sc.close();
    }
}

