package dto;
import Bean.*;
import java.util.*;

public class AdminRequest {

    private Scanner sc = new Scanner(System.in);
    private Admin admin = new Admin();

    public boolean ValidateAdminLogin() {
        System.out.print("Enter admin name:");
        String adminName = sc.nextLine().trim();

        if(!validateName(adminName)){
            return false;
        }

        System.out.print("Enter password:");
        String adminPass = sc.nextLine().trim();

        ArrayList<AdminInformation> adminlist = admin.getAdminList();
        for (AdminInformation a : adminlist) {
            if ((a.getAdminName()).equals(adminName) && a.getAdminPassword().equals(adminPass)) {
                System.out.println("Admin Login Successfull");
                return true;
            }
        }
        return false;

    }

    public boolean validateName(String studentName) {
        if (!studentName.matches("[a-zA-Z ]+")) {
            System.out.println("Name cannot contain symbols");
            return false;
        }
        return true;
    }

    


}
