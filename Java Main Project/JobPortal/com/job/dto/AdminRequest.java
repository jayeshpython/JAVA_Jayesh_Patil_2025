

package com.job.dto;

import com.job.bean.Admin;
import com.job.bean.AdminType;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminRequest {

    private Scanner sc = new Scanner(System.in);
    private AdminType admin = new AdminType();

    public boolean ValidateAdminLogin() {

        int attempts = 0;

        while(attempts < 3){

            System.out.print("\n\t\tEnter Admin Email id: ");
            String adminEmailId = sc.nextLine().trim();

            while(!validateEmail(adminEmailId)){
                System.out.print("\n\t\tEnter Admin Email Id: ");
                adminEmailId = sc.nextLine().trim();
            }

            System.out.print("\n\t\tEnter password: ");
            String adminPass = sc.nextLine().trim();

            // FIXED TYPE
            ArrayList<Admin> adminlist = admin.getAdminList();

            for (Admin a : adminlist) {
                if (a.getAdminEmail().equals(adminEmailId) &&
                    a.getAdminPassword().equals(adminPass)) {

                    System.out.println("\n\t\t*** Admin Login Successful ***");
                    return true;
                }
            }

            attempts++;
            System.out.println("\n\t\tInvalid credentials.");
            System.out.println("\n\t\tAttempts left: " + (3 - attempts));
        }

        System.out.println("\n\tYou have exceeded maximum login attempts. Access Denied ");
        return false;
    }

    public boolean validateEmail(String emailId) {
        if (!emailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("\tPlease enter correct Email format..!");
            return false;
        }
        return true;
    }
}