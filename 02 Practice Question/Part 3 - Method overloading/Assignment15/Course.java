
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

}