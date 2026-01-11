
/*
   	- Define an interface Person having method speak() . 
	- Define another interface student extends person which is having method study().
    - Define a class CollegeStudent implements student.
    - Create an object in the main method and call both methods.
*/

interface Person{
    public void speak();
}

interface Student extends Person{
    public void study();
}

class CollegeStudent implements Student{

    public void speak(){
        System.out.println("Person speaks.");
    }
    public void study(){
        System.out.println("Student studies.");
    }
}

public class StudentClass{
    public static void main(String[] args) {
        
        CollegeStudent sg = new CollegeStudent();
        sg.speak();
        sg.study();
    }
}
