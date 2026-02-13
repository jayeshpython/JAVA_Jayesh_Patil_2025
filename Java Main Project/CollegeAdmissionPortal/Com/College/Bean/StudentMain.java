package Bean;
import java.util.*;



public class StudentMain {
    private int id=1;
    private HashMap<Integer,Student> studentsList;
   

    public StudentMain(){
        studentsList=new HashMap<>();
    }

    public void addStudent(Student s){
        studentsList.put(s.getStudentId(),s);
        System.out.println("Student successfully sign in");
    }

    public ArrayList<Student> getStudentList(){
        ArrayList<Student> sl=new ArrayList<>();
        for(Student s:studentsList.values()){
            sl.add(s);
        }
        return sl;
    }

    public Student getStudentById(int id){
        return studentsList.get(id);
    }

    public int generateId(){
        return id++;
    }

    public void applytoCollege(Scanner sc,Student student,College college) {

        college.displayAllBranches();
        System.out.println("Choose branch for which you want to apply for (from above mention branches): ");
        String branchName=sc.nextLine();
        Branch branch=college.getBranch(branchName);
        if(branch==null){
            System.out.println("Invalid Branch Name");
            return;
        }
        ApplicationForm form = new ApplicationForm(student,college,branch);
        int seats=branch.getAvailableSeats()-1;
        branch.setAvailableSeats(seats);
        student.formsList.add(form);
        System.out.println("\nApplication Submitted Successfully..! ");

    }

}
