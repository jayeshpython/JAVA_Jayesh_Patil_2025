package Bean;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;
    private String studentPassword;
    private double CET_Percentile;
    private double JEE_MAINS_Percentile;
    private double JEE_ADVANCE_Percentile;
    private double NEET_Percentile;
    public List<ApplicationForm> formsList = new ArrayList<>();
   

    public Student(int studentId,String studentName,String studentEmail,String studentPhoneNumber,
        String studentPassWord){

            this.studentId=studentId;
            this.studentName=studentName;
            this.studentEmail=studentEmail;
            this.studentPhoneNumber=studentPhoneNumber;
            this.studentPassword=studentPassWord;

    } 
    
    public void setStudentName(String name){
        this.studentName=name;
    }

    public void setStudentEmail(String email){
        this.studentEmail=email;
    }

    public void setStudentPhoneNumber(String number){
        this.studentPhoneNumber=number;
    }

    public void set_CET_Percentile(double percentile){
        this.CET_Percentile=percentile;
    }

    public void set_JEE_MAINS_Percentile(double percentile){
        this.JEE_MAINS_Percentile=percentile;
    }

    public void set_JEE_ADVANCE_Percetile(double percentile){
        this.JEE_ADVANCE_Percentile=percentile;
    }

    public void set_NEET_Percentile(double percentile){
        this.NEET_Percentile=percentile;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getStudentEmail(){
        return studentEmail;
    }

    public String getPhoneNumber(){
        return studentPhoneNumber;
    }

    public String getPassWord(){
        return studentPassword; 
    } 

    public double getCET(){
        return CET_Percentile;
    }

    public double getJEE_MAINS(){
        return JEE_MAINS_Percentile;
    }

    public double getJEE_ADVANCE(){
        return JEE_ADVANCE_Percentile;
    }

    public double getNEET(){
        return NEET_Percentile;
    }

    public void displayListOfAppliedColleges(){

        int i=1;
        if(formsList.isEmpty()){
            System.out.println("You Have Not Apply To Any College Yet");
            return;
        }
        for(ApplicationForm f:formsList){
            System.out.println(i+"."+f);
            i++;
        }
        System.out.println("\n");
    }
}
