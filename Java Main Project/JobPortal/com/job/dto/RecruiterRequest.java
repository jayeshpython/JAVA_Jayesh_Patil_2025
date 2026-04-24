
package com.job.dto;

import com.job.bean.Candidate;
import com.job.bean.Recruiter;
import com.job.bean.RecruiterMain;

import java.util.*;

public class RecruiterRequest {

    Scanner sc = new Scanner(System.in);
    static RecruiterMain recMain = new RecruiterMain();

    public Recruiter ValidateRecruiterRegistration(){

        String userName;
        while(true){
            try{
                System.out.print("\n\tEnter the User Name : ");
                userName = sc.nextLine().trim().toUpperCase();
                validateName(userName);
                break;
            }catch(InValidNameException e){
                System.out.println("\t" + e.getMessage());
            }
        }

        String email;
        while(true){
            try {
                System.out.print("Enter Email: ");
                email = sc.nextLine().trim();
                validateEmail(email);
                break;
            } catch (InValidEmailException e) {
                System.out.println("\t" + e.getMessage());
            }
        }

        String phoneNumber;
        while (true) { 
            try {
                System.out.print("Enter Phone Number: ");
                phoneNumber = sc.nextLine().trim();
                validatePhoneNumber(phoneNumber);
                break;
            } catch (InValidPhoneNumberException e) {
                System.out.println("\t" + e.getMessage());
            }
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

        String company;
        System.out.println("Enter Company Name: ");
        company = sc.nextLine().trim();

        int id = recMain.generateRecruiterById();

        recMain.addRecruiter(new Recruiter(userName, id,email, phoneNumber, confirmPassword, company));

        return recMain.getRecruiterById(id);
    }

    public void validateName(String studentName) throws InValidNameException{
        if (!studentName.matches("[a-zA-Z ]+")) {
            throw new InValidNameException("\tName cannot contain symbols");
            
        }
    }

    public void validateEmail(String emailId) throws InValidEmailException{
        if (!emailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new InValidEmailException("\tPlease entered correct Email format..!");
            
        }

    }

    public boolean validateConfirmPassWord(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            System.out.println("\n\tConfirm Password does not matches the Password");
            System.out.println("\tPlease again enter Password");
            return false;
        }
        return true;
    }

    public void validatePhoneNumber(String phoneNumber) throws InValidPhoneNumberException {
        if (!(phoneNumber.length() == 10)) {
            throw new InValidPhoneNumberException("\n\tphone number should contain 10 numbers");
            
        } else if (!(phoneNumber.matches("[0-9]+"))) {
            throw new InValidPhoneNumberException("\n\tPhone number cannot contain symbols other than numbers");
            
        } 
    }

    public Recruiter ValidateRecruiterLogin() {

        int attempts = 0;
        while(attempts <= 3){

            System.out.print("\n\tEnter the User Name : ");
            String userName = sc.nextLine().trim().toUpperCase();
            System.out.print("\n\tEnter the User Password : ");
            String userPassword = sc.nextLine().trim();

            ArrayList<Recruiter> reclist = recMain.getRecruiterList();
            for (Recruiter  r: reclist) {
                if ((r.getUserName().equals(userName)) && r.getUserPassword().equals(userPassword)) {
                    System.out.println("\t *** Recruiter Login Successful ***");
                    return r;
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
