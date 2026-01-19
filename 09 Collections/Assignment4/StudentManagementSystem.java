
/*
     *** Student Management System ***
    
	1) ArrayList: Manage enrolled students with the following names: (Ram, Sham, Vishnu, Radha, Sita, Durga).

    2) Linkedlist: Stimulate attendance queue with initial student:(Vishnu, Sita, Durga).
 
    3) Operations to perform: 
       1: Remove the first student from attendance queue to stimulate Attendance.
	   2: Dynamically add "Ganesh" to the queue end and "Om" to the front.
	   3: Search if "Shankar" is enrolled in the ArrayList.
	   4: Remove "Durga" from the enrolled list 
	   5: Iterate through both the enrolled student Attendance queue(Linkedlist) & print their final status.
*/

import java.util.*;

public class StudentManagementSystem{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		ArrayList<String> student = new ArrayList<>();
		LinkedList<String> attendance = new LinkedList<>();

		student.add("Ram");
		student.add("Sham");
		student.add("Vishnu");
		student.add("Radha");
		student.add("Sita");
		student.add("Durga");

		attendance.add("Vishnu");
		attendance.add("Sita");
		attendance.add("Durga");

		//1: Remove the first student from attendance queue to stimulate Attendance.
		String removed = attendance.removeFirst();
		System.out.println("After removing first student: " + removed);

		//2: Dynamically add "Ganesh" to the queue end and "Om" to the front.
		attendance.addFirst("OM");
		attendance.addLast("Ganesh");
		System.out.println();
		System.out.println("Queue after adding Ganesh and Om: " + attendance);

		//3: Search if "Shankar" is enrolled in the ArrayList.
		System.out.println();
		System.out.println("Contains Shankar ? " + student.contains("Shankar"));

		//4: Remove "Durga" from the enrolled list
		student.remove("Durga");
		System.out.println();
		System.out.println("Array list after removing durga: " + student);

		//5: Iterate through both the enrolled student Attendance queue(Linkedlist) & print their final status.
		System.out.println();
		System.out.println("Final enrolled student: ");
		for(String stud: student){
			System.out.print(stud + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Fianal attendance queue: ");
		for(String attd: attendance){
			System.out.print(attd + " " );
		}
	}
}

