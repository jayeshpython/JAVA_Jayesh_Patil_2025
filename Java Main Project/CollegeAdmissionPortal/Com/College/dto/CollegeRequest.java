package dto;
import Bean.*;
import java.util.*;

public class CollegeRequest {
    private int collegeCode ;
    private Scanner sc = new Scanner(System.in);

    public College AcceptCollegeDetails() {

        
            System.out.print("\tEnter College Code:");
            collegeCode = sc.nextInt();
            sc.nextLine();

            System.out.print("\tEnter College Name:");
            String collegeName = sc.nextLine();

            System.out.print("\tEnter College Email: ");
            String collegeEmail = sc.nextLine();

            System.out.print("\tEnter college phone number: ");
            String collegeNumber = sc.nextLine();

            System.out.print("\tEnter college Location: ");
            String collegeLocation = sc.nextLine();

            if(!(validateName(collegeName) && validateEmail(collegeEmail) && validatePhoneNumber(collegeNumber))){
                System.out.println("Please Entered Valid College Information..!");
                return AcceptCollegeDetails();
            }

            //Branch details
            System.out.println("\n\tEntering branch details.");
            HashMap<String, Branch> map = new HashMap<>();

            System.out.print("\n\tEnter number of branches in Colleges: ");
            int number = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < number; i++){
                System.out.print("\n\tEnter branch name: ");
                String branchName = sc.nextLine();
                
                System.out.print("\tEnter number of seats: ");
                int seat = sc.nextInt();
                sc.nextLine();
                System.out.print("\tEnter last year cutoff: ");
                double lastYear = sc.nextDouble();
                System.out.print("\tEnter this year cutoff: ");
                double thisYear = sc.nextDouble();

                map.put(branchName, new Branch(lastYear, thisYear, seat));
            }

            CollegeType type = null;
            boolean validType = false;

            do{
                System.out.println("\nEnter College Type: ");
                System.out.println("(IIT, NIT, BITS, IISER, OtherEngineering, AIIMS, OtherMedical, OtherPharmacy)");

                try {
                    
                    type = CollegeType.valueOf(sc.nextLine().toUpperCase());
                    validType = true;

                    if(type == CollegeType.IIT || type == CollegeType.NIT || type == CollegeType.BITS || type == CollegeType.IISER || type ==CollegeType.OtherEngineering){
                        Engineering eng = new Engineering(collegeName, collegeEmail, collegeNumber, collegeLocation, type);
                        eng.setBranchWiseCutOffsForEngineering(map);
                        return eng;                
                    }

                    else if(type == CollegeType.AIIMS || type == CollegeType.OtherMedical){
                        Medical med = new Medical(collegeName,collegeEmail,collegeNumber,collegeLocation, type);
                        med.setBranchWiseCutOffsForMedical(map);
                        return med;
                    }
                    else{
                        Pharmacy ph = new Pharmacy(collegeName, collegeEmail, collegeNumber, collegeLocation, type);
                        ph.setBranchWiseCutOffsForPharmacy(map);
                        return ph;
                    }

                }
                catch (IllegalArgumentException e) {
                    System.out.println("Invalid College Type");
                }
            }while(!validType);

        return null;
    }


    //------ College validations --------

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
