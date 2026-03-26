package Bean;

import java.util.ArrayList;


public class Admin {
    private ArrayList<AdminInformation> arr;
    private boolean declareResult = false;

    //Student object creation
    private Student stud;
    
    public Admin(){
        arr=new ArrayList<>(3);
        loadAdmins();
    }

    public boolean getResultStatus(){
        return declareResult;
    }

    public void setResultStatus(){
        declareResult = false;
    }

    public void loadAdmins(){
        arr.add(new AdminInformation("Sanket", "8080887488", "sanketmusale324@gmail.com", "123"));
        arr.add(new AdminInformation("Jayesh", "8591471877", "jayeshdpatil2021@gmail.com", "456"));
        arr.add(new AdminInformation("Rupesh", "8830712453", "dighe.rupesh9999@gmail.com", "789"));
    }

    public ArrayList<AdminInformation> getAdminList(){
        return arr;
    }

    //Declaring result
    public College declareStudentResult(Student stud){

    }

}
