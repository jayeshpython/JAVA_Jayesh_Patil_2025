package Services;
import Bean.*;
import dto.*;

public class SignInAndlogInSystem {

    private StudentRequest studentRequest = new StudentRequest();
    private StudentMain std = new StudentMain();

    private AdminRequest adminRequest = new AdminRequest();
    private Admin adm = new Admin();

    public SignInAndlogInSystem() {}

    public Student SignInForStudent() {

        Student student= studentRequest.ValidateStudentRequest();
        std.addStudent(student);
        return std.getStudentById(student.getStudentId());
    }

    public Student LogInForStudent() {

       return studentRequest.ValidatestudentLogin();
    }

    public boolean LogInForAdmin(){
        return adminRequest.ValidateAdminLogin();
    }
}
