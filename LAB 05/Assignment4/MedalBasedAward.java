
/*
	 *** Award MedalsBased on Marks ***
	
	- A scholl awards medals based on the following criterian: 
		- Gold : Marks >= 90.
		- Silver : 80 <= Marks < 90.
		- Bronze : 70 <= Marks < 80.
	- Write a method that accepts a Hashmap of student registration numbers and their marks, and returns a map of eligible students with their medal type.
	
	- Method name: getStudents().

*/

import java.util.HashMap;

class StudentMarks{
    HashMap<Integer, Integer> map = new HashMap<>();
    
    public void acceptDetails(int registration, int marks){
        map.put(registration, marks);
        System.out.println("Student of " + registration +" number added sucessefully");
    }

    public HashMap<Integer, String> getStudent(){
        HashMap<Integer, String> result = new HashMap<>();

        for(int regNo: map.keySet()){

            int marks = map.get(regNo);
            
            if(marks >= 90){
                result.put(marks, "Gold");
            }
            else if(marks >= 80){
                result.put(marks, "Silver");
            }
            else if(marks >= 70){
                result.put(marks, "Bronze");
            }
            else{
                result.put(marks, "Fail");
            }
        }
        return result;
    }
}

public class MedalBasedAward{
    public static void main(String[] args) {
        
        StudentMarks stud = new StudentMarks();
        stud.acceptDetails(111, 92);
        stud.acceptDetails(121, 76);
        stud.acceptDetails(201, 93);
        stud.acceptDetails(221, 62);
        stud.acceptDetails(251, 85);

        HashMap<Integer, String> map = stud.getStudent();
        System.out.println();
        System.out.println(map);
    }
}