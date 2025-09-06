

class LoginSystem{
    String userName;
    String password;

    public LoginSystem(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    void compare(){

        String predefinedUserName = "Ram";
        String predefinedPassword = "ram#1234";

        if(userName.equals(predefinedUserName) && password.equals(predefinedPassword)) {
            System.out.println("Login Successful!");
        }
        else {
            System.out.println("Invalid Username or Password.");
        }
    }

    void displayDetails(){
        System.out.println("User name: " + userName);
        System.out.println("Password: " + password);
    }
}

public class LoginSystemClass{
    public static void main(String[] args) {
        
        LoginSystem ls = new LoginSystem("Ram", "ram@1234");
        ls.compare();
        ls.displayDetails();
    }
}