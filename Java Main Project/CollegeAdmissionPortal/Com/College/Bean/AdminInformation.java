package Bean;

public class AdminInformation {
    private String adminName;
    private String adminPhoneNumber;
    private String adminEmail;
    private String adminPassword;

    AdminInformation(String adminName,String adminPhoneNumber,String adminEmail,String adminPassword){
        this.adminName=adminName;
        this.adminPhoneNumber=adminPhoneNumber;
        this.adminEmail=adminEmail;
        this.adminPassword=adminPassword;
    }

    public void setAdminName(String name){
        this.adminName=name;
    }

    public void setAdminPhoneNumber(String number){
        this.adminPhoneNumber=number;
    }

    public void setAdminEmail(String email){
        this.adminEmail=email;
    }

    public void setAdminPassword(String password){
        this.adminPassword=password;
    }

    public String getAdminName(){
        return this.adminName;
    }

    public String getAdminPhoneNumber(){
        return this.adminPhoneNumber;
    }

    public String getAdminEmail(){
        return this.adminEmail;
    }

    public String getAdminPassword(){
        return this.adminPassword;
    }




}
