
class Course{
    private String courseName;
    private String instructor;
    private int duration;
    private String lastEnrolledStudent;
    private static int totalEnrollments = 0;

    public Course(String courseName){
        this.courseName = courseName;
        this.instructor = "To be decided";
        this.duration = 1;
    }

    public Course(String courseName, String instructor){
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = 1;
    }

    public Course(String courseName, String instructor, int duration){
        this.courseName = courseName;
        this.instructor = instructor;
        setDuration(duration);
    }

    public Course(int duration, String courseName, String instructor){
        this.courseName = courseName;
        this.instructor = instructor;
        setDuration(duration);
    }

    private void setDuration(int duration){

        if(duration > 1){
            this.duration = 1;
        }
        else{
            System.out.println("Invalid duration provided. Setting default duration to 1");
            this.duration = 1;
        }
    }

    public void enrollStudent(String studentName){
        System.out.println(studentName + " enrolled in " + courseName);
        lastEnrolledStudent = studentName;
        totalEnrollments++;
    }

    public void enrollStudent(String studentName, int age){
        System.out.println(studentName + "(Age: " + age + ") enrolled in " + courseName);
        lastEnrolledStudent = studentName;
        totalEnrollments++;
    }

    public void enrollStudent(String studentName, int age, String email){
        System.out.println(studentName + "(Age: " + age + ", Email: " + email + ") enrolled in " + courseName);
        lastEnrolledStudent = studentName;
        totalEnrollments++;
    }

    public void dislayCourseDetails(){

        System.out.println("Course name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration: " + duration + " hrs");
        System.out.println("Last Enrolled: " + (lastEnrolledStudent != null ? lastEnrolledStudent : "None"));
    }

    public static int getTotalEnrollements(){
        return totalEnrollments;
    }
}

public class Main{
    public static void main(String[] args) {
        
        Course c1 = new Course("Java Programming");
        Course c2 = new Course("Data Structure", "Ms. Pooja");
        Course c3 = new Course("Spring Boot", "Mr. Omkar", 35);
        Course c4 = new Course(40, "C, C++", "Mr. Deshmukh");

        c1.enrollStudent("Akash");
        c2.enrollStudent("Sneha", 22);
        c3.enrollStudent("Jayant", 23, "jayant@gmail.com");

        c1.dislayCourseDetails();
        System.out.println();
        c2.dislayCourseDetails();
        System.out.println();
        c3.dislayCourseDetails();
        System.out.println();
        c4.dislayCourseDetails();

        System.out.println("Total enrollements: " + Course.getTotalEnrollements());
    }
}