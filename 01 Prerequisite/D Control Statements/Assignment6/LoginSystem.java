

import java.util.Scanner;

class Password{
    String phoneNumber;
    String name;
    String password;

    void acceptDetails(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Phone number: ");
        phoneNumber = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        for (int i = 0; i < 3; i++){

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            System.out.print("Confirm Password: ");
            String confirmPass = sc.nextLine();

            if(pass.equals(confirmPass)){
                password = pass;
                System.out.println("Password set successfully");
                login();
                return;
            } 
            else{
                System.out.println("Passwords do not match");
            }
        }

        System.out.println("Failed to set password in 3 attempts.");
    }

    void login(){

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.print("Enter password to login: ");
            String input = sc.nextLine();

            if(input.equals(password)){
                System.out.println("Login successful!");
                return;
            } 
            else{
                System.out.println("Incorrect password");
            }
        }

        System.out.println("Login failed after 3 attempts.");
    }
}

public class LoginSystem{
    public static void main(String[] args) {
        Password p = new Password();
        p.acceptDetails();
    }
}
