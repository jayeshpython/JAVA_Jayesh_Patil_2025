

package Bean;
import java.util.*;

public class StudentMain {
    private int id=1;
    private HashMap<Integer,Student> studentsList;
   
    public static final String ANSI_GREEN = "\u001B[32m";

    public StudentMain(){
        studentsList=new HashMap<>();
    }

    public void addStudent(Student s){
        studentsList.put(s.getStudentId(),s);
        
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

}
