package dto;

import Bean.*;
import java.util.*;

public class StudentRequest {

    public Scanner sc = new Scanner(System.in);
    private StudentMain studentmain = new StudentMain();

    public Student ValidateStudentRequest() {

        System.out.print("\n\tEnter the User Name : ");
        String userName = sc.nextLine().trim().toUpperCase();

        while(!validateName(userName)){
            System.out.print("\n\tEnter user name: ");
            userName = sc.nextLine().trim().toUpperCase();
        }

        System.out.print("\n\tEnter Email Id: ");
        String emailId = sc.nextLine().trim();
        while(!validateEmail(emailId)) {
            System.out.print("\n\tEnter Email id: ");
            emailId = sc.nextLine().trim();
        }

        System.out.print("\n\tEnter Phone Number: ");
        String phoneNumber = sc.nextLine().trim();
        while(!validatePhoneNumber(phoneNumber)) {
            System.out.print("\n\tEnter Phone Number: ");
            phoneNumber = sc.nextLine().trim();
        }

        System.out.print("\n\tEnter Password: ");
        String passWord = sc.nextLine().trim();

        System.out.print("\n\tConfirm Password: ");
        String confirmPassword = sc.nextLine().trim();

        int attemptsToValidatePassword = 3;
        while(attemptsToValidatePassword != 0) {
            while(!validateConfirmPassWord(passWord, confirmPassword)){
                System.out.print("\n\tEnter Password: ");
                passWord = sc.nextLine().trim();
                System.out.print("\n\tEnter Confirm Password: ");
                confirmPassword = sc.nextLine().trim();
            }
            attemptsToValidatePassword--;
        }

        int id = studentmain.generateId();

        studentmain.addStudent(new Student(id, userName, emailId, phoneNumber, passWord));

        return studentmain.getStudentById(id);

    }

    public boolean validateName(String studentName) {
        if (!studentName.matches("[a-zA-Z ]+")) {
            System.out.println("\tName cannot contain symbols");
            System.out.println("Please again enter name.");
            return false;
        }
        return true;
    }

    public boolean validateEmail(String emailId) {
        if (!emailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("\tPlease entered correct Email format..!");
            System.out.println("\tPlease again enter Email id.");
            return false;
        }
        return true;
    }

    public boolean validateConfirmPassWord(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            System.out.println("\n\tConfirm Password does not matches the Password");
            System.out.println("\tPlease again enter Password");
            return false;
        }
        return true;
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        if (!(phoneNumber.length() == 10)) {
            System.out.println("\n\tphone number should contain 10 numbers");
            System.out.println("\tPlease again enter Phone Number.");
            return false;
        } else if (!(phoneNumber.matches("[0-9]+"))) {
            System.out.println("\n\tPhone number cannot contain symbols other than numbers");
            return false;
        } else {
            return true;
        }
    }

    public Student ValidatestudentLogin() {

        int attempts = 0;
        while(attempts <= 3){

            System.out.print("\n\tEnter the User Name : ");
            String userName = sc.nextLine().trim().toUpperCase();
            System.out.print("\n\tEnter the User Password : ");
            String userPassword = sc.nextLine().trim();

            ArrayList<Student> studlist = studentmain.getStudentList();
            for (Student s : studlist) {
                if ((s.getStudentName().equals(userName)) && s.getPassWord().equals(userPassword)) {
                    System.out.println("\t *** Student Login Successful ***");
                    return s;
                }
                else{
                    System.out.println("\tInvalid Log In credentials.");
                }
            }
            attempts++;

            if(attempts <= 3){
                System.out.println("\tAttempts left: " + (4 - attempts));

            }
        }
        System.out.println("\n\tYou have exceeded maximum login attempts (3). Access Denied ");
        return null;
    }
}
