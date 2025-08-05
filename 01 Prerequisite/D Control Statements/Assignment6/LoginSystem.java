
import java.util.Scanner;

class Password{
    String phoneNumber;
    String name;
    String password;
    String confirmPassword;

    void acceptDetails(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number: ");
        phoneNumber = sc.nextLine();

        System.out.println("Enter Phone number: ");
        name = sc.nextLine();

        System.out.println("Enter Phone number: ");
        password = sc.nextLine();

        System.out.println("Enter Phone number: ");
        confirmPassword = sc.nextLine();

        if(checkPassword(password, confirmPassword))
            System.out.println("Password match successfully");
        else
            System.out.println("Password not match");
    }
    void checkPassword(String password, String confirmPassword){

        do{ 
            if(password == confirmPassword){

            }
        } 
}







