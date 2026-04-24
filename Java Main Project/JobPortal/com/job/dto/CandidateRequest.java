
package com.job.dto;

import com.job.bean.Candidate;
import com.job.bean.CandidateMain;
import java.util.*;

public class CandidateRequest {
    
    Scanner sc = new Scanner(System.in);
    static CandidateMain candMain = new CandidateMain();

    public Candidate ValidateCandidateRegistration(){
        
        String userName;
        while(true){
            try{
                System.out.print("\n\t\tEnter the User Name : ");
                userName = sc.nextLine().trim().toUpperCase();
                validateName(userName);
                break;
            }catch(InValidNameException e){
                System.out.println("\n\t\t" + e.getMessage());
            }
        }

        String email;
        while(true){
            try {
                System.out.print("\t\tEnter Email: ");
                email = sc.nextLine().trim();
                validateEmail(email);
                break;
            } catch (InValidEmailException e) {
                System.out.println("\n\t\t" + e.getMessage());
            }
        }

        String phoneNumber;
        while (true) { 
            try {
                System.out.print("\t\tEnter Phone Number: ");
                phoneNumber = sc.nextLine().trim();
                validatePhoneNumber(phoneNumber);
                break;
            } catch (InValidPhoneNumberException e) {
                System.out.println("\n\t\t" + e.getMessage());
            }
        }


        System.out.print("\n\t\tEnter Password: ");
        String passWord = sc.nextLine().trim();

        System.out.print("\n\t\tConfirm Password: ");
        String confirmPassword = sc.nextLine().trim();

        int attemptsToValidatePassword = 3;
        while(attemptsToValidatePassword != 0) {
            while(!validateConfirmPassWord(passWord, confirmPassword)){
                System.out.print("\n\t\tEnter Password: ");
                passWord = sc.nextLine().trim();
                System.out.print("\n\t\tEnter Confirm Password: ");
                confirmPassword = sc.nextLine().trim();
            }
            attemptsToValidatePassword--;
        }

        int id = candMain.generateCandidateId();

        candMain.addCandidate(new Candidate(userName, id, email, phoneNumber, confirmPassword));

        return candMain.getCandidateById(id);
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

    public Candidate ValidateCandidateLogin() {

        int attempts = 0;
        while(attempts <= 3){

            System.out.print("\n\tEnter the User Name : ");
            String userName = sc.nextLine().trim().toUpperCase();
            System.out.print("\n\tEnter the User Password : ");
            String userPassword = sc.nextLine().trim();

            ArrayList<Candidate> candlist = candMain.getCandidateList();
            for (Candidate  c: candlist) {
                if ((c.getUserName().equals(userName)) && c.getUserPassword().equals(userPassword)) {
                    System.out.println("\t *** Student Login Successful ***");
                    return c;
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
