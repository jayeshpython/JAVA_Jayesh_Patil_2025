

/*

   *** Student Management system ***
   
   - Imagine you are building student management system where you need to store student ID(unique) & their corresponding names you also have to perform operations such as: 
				- retrival of information 
				- Adding a new student or removing student.
	( use put() to add, get() to fetch students by their ID, put() to override the value associated with the key, remove to delete key value pair, containskey() to verify student list and entrySet() to iterate over all entries.

*/

import java.util.*;

class Student{
	private int studId;
	private String studName;

	//Constructor
	public Student(int studId, String studName){
		this.studId = studId;
		this.studName = studName;
	}

	//Getters
	public int getStudentID(){
		return studId;
	}

	public String getStudentName(){
		return studName;
	}

	public String toString(){
		return "Student name " + studName + " | ID: " + studId;
	}
}

class StudentManagement{
	private ArrayList<Student> stud = new ArrayList<>();

	public void addStudents(int id, String name){
		Student s = new Student(id, name);
		stud.add(s);
		System.out.println("Student added successfully");
	}

	public void searchStudent(int id){
		for(Student s: stud){
			if(s.getStudentID() == id){
				System.out.println("Student found");
				System.out.println("Student name: " + s.getStudentName() + " | ID: " + s.getStudentID());
				return;
			}
		}
		System.out.println("Student not found");
	}

	public void removeStudent(int id){
    	for(int i = 0; i < stud.size(); i++){
        	if(stud.get(i).getStudentID() == id){
            	stud.remove(i);  
            	System.out.println("Student removed successfully");
            	return;
        	}
    	}
    	System.out.println("Student is not present in the list");
	}

	public void displayStudents(){
		System.out.println("Students data: ");
		for(Student s: stud){
			System.out.println("Student name: " + s.getStudentName() + " | ID: " + s.getStudentID());
		}
	}
}

public class StudentManagementSystem{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentManagement student = new StudentManagement();

		int choice;
		int id;
		String name;

		do { 
            System.out.println("\n*********** Student Menu **********");
            System.out.println("1. Add Student");
            System.out.println("2. Display All");
            System.out.println("3. Search student by ID");
			System.out.println("4. Remove student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 -> {
                    System.out.print("Enter student name: ");
                    name = sc.nextLine();
                    System.out.print("Enter student id: ");
                    id = sc.nextInt();
                    student.addStudents(id, name);
                } 
				case 2 -> student.displayStudents();

                case 3 -> {
                    System.out.print("Enter student id to search: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    student.searchStudent(id);
                }

				case 4 -> {
					System.out.print("Enter student id to remove: ");
					id = sc.nextInt();
                    sc.nextLine();
                    student.removeStudent(id);
				}

                case 5 -> System.out.println("Exiting....");
                default -> System.out.println("Invalid choice.");
			}
		}while(choice != 5);
		sc.close();
	}
}
