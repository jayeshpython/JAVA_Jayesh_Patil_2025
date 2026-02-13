package dto;

import Bean.*;
import java.util.*;

public class StudentRequest {

    public Scanner sc = new Scanner(System.in);
    private StudentMain studentmain = new StudentMain();

    public Student ValidateStudentRequest() {

        System.out.println("Enter the User Name : ");
        String userName = sc.nextLine().trim().toUpperCase();

        if (!validateName(userName)) {
            return null;
        }

        System.out.println("Enter Email Id: ");
        String emailId = sc.nextLine().trim();
        if (validateEmail(emailId)) {

            ArrayList<Student> studlist = studentmain.getStudentList();
            for (Student s : studlist) {
                if (s.getStudentEmail().equals(emailId)) {
                    System.out.println("This email already exist");
                    return null;
                }
            }
        }

        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine().trim();
        if (!validatePhoneNumber(phoneNumber)) {
            return null;
        }

        System.out.println("Enter Password: ");
        String passWord = sc.nextLine().trim();

        System.out.println("Confirm Password: ");
        String confirmPassword = sc.nextLine().trim();

        if (!validateConfirmPassWord(passWord, confirmPassword)) {
            return null;
        }

        int id = studentmain.generateId();

        return new Student(id, userName, emailId, phoneNumber, passWord);

    }

    public boolean validateName(String studentName) {
        if (!studentName.matches("[a-zA-Z ]+")) {
            System.out.println("Name cannot contain symbols");
            return false;
        }
        return true;
    }

    public boolean validateEmail(String emailId) {
        if (!emailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("please entered correct Email format..!");
            return false;
        }
        return true;
    }

    public boolean validateConfirmPassWord(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            System.out.println("confirmPassword does not matches the password");
            return false;
        }
        return true;
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        if (!(phoneNumber.length() == 10)) {
            System.out.println("phone number should contain 10 numbers");
            return false;
        } else if (!(phoneNumber.matches("[0-9]+"))) {
            System.out.println("Phone number cannot contain symbols other than numbers");
            return false;
        } else {
            return true;
        }
    }

    public Student ValidatestudentLogin() {

        System.out.print("Enter the User Name : ");
        String userName = sc.nextLine().trim().toUpperCase();
        System.out.print("Enter the User Password : ");
        String userPassword = sc.nextLine().trim();

        ArrayList<Student> studlist = studentmain.getStudentList();
        for (Student s : studlist) {
            if ((s.getStudentName().equals(userName)) && s.getPassWord().equals(userPassword)) {
                return s;
            }
        }
        return null;

    }

}
