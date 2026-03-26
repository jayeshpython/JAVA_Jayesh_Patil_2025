package dto;
import Bean.*;
import java.util.*;

public class AdminRequest {

    private Scanner sc = new Scanner(System.in);
    private Admin admin = new Admin();

    public boolean ValidateAdminLogin() {

        int attempts = 0;

        while(attempts <= 3){

            System.out.print("\n\tEnter Admin Email id:");
            String adminEmailId = sc.nextLine().trim();

            while(!validateEmail(adminEmailId)){
                System.out.print("\n\tEnter Admin Email Id: ");
                adminEmailId = sc.nextLine().trim();
            }

            System.out.print("\n\tEnter password:");
            String adminPass = sc.nextLine().trim();

            ArrayList<AdminInformation> adminlist = admin.getAdminList();
            for (AdminInformation a : adminlist) {
                if ((a.getAdminEmail()).equals(adminEmailId) && a.getAdminPassword().equals(adminPass)) {
                    return true;
                }
            }
            attempts ++;
            if(attempts <= 3){
                System.out.println("\tAttempts left: " + (4 - attempts));

            }
        }
        System.out.println("\n\tYou have exceeded maximum login attempts (3). Access Denied ");
        return false;

    }

    public boolean validateEmail(String emailId) {
        if (!emailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("\tPlease entered correct Email format..!");
            System.out.println("\tPlease again enter Email id.");
            return false;
        }
        return true;
    }
}
