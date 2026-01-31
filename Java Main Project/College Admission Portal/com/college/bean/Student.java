
package com.college.bean;

public class Student {
    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;
    private String studentPassword;
    private String studentConfirmPassword;

    public Student(String studentName,String studentEmail,String studentPhoneNumber,
        String studentPassWord,String studentConfirmPassword){

            this.studentName=studentName;
            this.studentEmail=studentEmail;
            this.studentPhoneNumber=studentPhoneNumber;
            this.studentPassword=studentPassWord;

            if(studentConfirmPassword.equals(studentPassWord)){
                this.studentConfirmPassword=studentConfirmPassword;
            }else{
                System.out.println("Password does not match! retry");
            }
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

    public String getStudentName(){
        return studentName;
    }

    public String getStudentEmail(){
        return studentEmail;
    }

    public String getPhoneNumber(){
        return studentPhoneNumber;
    }
    
}