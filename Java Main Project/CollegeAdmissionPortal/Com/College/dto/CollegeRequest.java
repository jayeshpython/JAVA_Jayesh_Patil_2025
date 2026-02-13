package dto;
import Bean.*;
import java.util.*;

public class CollegeRequest {
    private int collegeCode ;
    private Scanner sc = new Scanner(System.in);

    public College AcceptCollegeDetails() {
        
        System.out.println("Enter College Code:");
        collegeCode = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter College Name:");
        String collegeName = sc.nextLine();

        System.out.println("Enter College Email: ");
        String collegeEmail = sc.nextLine();

        System.out.println("Enter college phone number: ");
        String collegeNumber = sc.nextLine();

        System.out.println("Enter college Location: ");
        String collegeLocation = sc.nextLine();

        if(!validateName(collegeName) || !validateEmail(collegeEmail) || !validatePhoneNumber(collegeNumber)){
            System.out.println("Please Entered Valid College Information..!");
            return null;
        }

        CollegeType type = null;
        try {
            System.out.println("Enter College Type: ");
            type = CollegeType.valueOf(sc.nextLine().toUpperCase());

            switch(type) {
                case CollegeType.OtherEngineering:
                    return new Engineering(collegeName, collegeEmail, collegeNumber, collegeLocation, CollegeType.OtherEngineering);

                case CollegeType.OtherMedical:
                    return new Medical(collegeName,collegeEmail,collegeNumber,collegeLocation,CollegeType.OtherMedical);
                
                case CollegeType.OtherPharmacy:
                    return new Pharmacy(collegeName,collegeEmail,collegeNumber,collegeLocation,CollegeType.OtherPharmacy);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Type");
        }

        return null;
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

    public int getCollegeCode(){
        return collegeCode;
    }
}
