

class Course {
    private String courseName;
    private String instructor;
    private int duration;
    private String lastEnrolledStudent;
    private static int TotalEnrollment = 0;

    //Constructor 1: Only course name(c1)
    public Course(String courseName) {
        this.courseName = courseName;
        this.instructor = "Pritam Pyaare";
        this.duration = 1;
    }

    //Constructor 2: Course name and instructor(c2)
    public Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = 1;
    }

    //Constructor 3: Course name, instructor and duration
    public Course(String courseName, String instructor, int duration) {
        this.courseName = courseName;
        this.instructor = instructor;
        setDuration(duration);
    }

    //Validate and set duration
    private void setDuration(int duration) {
        if (duration > 0) { 
            this.duration = duration;
        } else { 
            System.out.println("Invalid duration provided. Setting default duration to 1");
            this.duration = 1;
        }
    }

    //Method overloading: Enroll student with just name
    public void enrollStudent(String studentName) {
        System.out.println(studentName + " enrolled in: " + courseName);
        lastEnrolledStudent = studentName;
        TotalEnrollment++;
    }

    //Method overloading: Enroll student with name and age
    public void enrollStudent(String studentName, int age) {
        System.out.println(studentName + " (age: " + age + ") enrolled in " + courseName);
        lastEnrolledStudent = studentName;
        TotalEnrollment++;
    }

    //Method overloading: Enroll student with name, age and email
    public void enrollStudent(String studentName, int age, String email) {
        System.out.println(studentName + " (age: " + age + ", email: " + email + ") enrolled in " + courseName);
        lastEnrolledStudent = studentName;
        TotalEnrollment++;
    }

    //Display Course details
    public void displayCourseDetails() {
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration: " + duration + " month(s)");
        System.out.println("Last enrolled: " + (lastEnrolledStudent != null ? lastEnrolledStudent : "No students yet"));
        System.out.println("Total Enrollments across all courses: " + TotalEnrollment);
    }
}


public class Main{
    public static void main(String[] args) {
        
        Course c1 = new Course("Java Program");
        Course c2 = new Course("Data Structure", "Ms Pooja");
        Course c3 = new Course("Spring Boot", "Mr Omkar", 35);
        Course c4 = new Course(40, "C, C++", "Mr Deshmukh");

        //Enroll student
        c1.enrollStudent("Akash");
        c2.enrollStudent("Sneha", 22);
        c3.enrollStudent("Jayant", 25, "jayant@gmail.com");

        //Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
        c4.displayCourseDetails();

        //Print total enrollments
        System.out.println("Total enrollments across all courses: " + Course.getTotalEnrollment);
    }
}