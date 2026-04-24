
package com.job.bean;

public abstract class User {
    private String userName;
    private int userID;
    private String userEmail;
    private String userPhoneNumber;
    private String userPassword;

    public User(String userName, int userID, String userEmail, String userPhoneNumber, String userPassword){
        this.userName = userName;
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.userPassword = userPassword;
    }

    //Getters for candidate info
    public String getUserName(){
        return userName;
    }

    public int getUserId(){
        return userID;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public String getUserPhoneNumber(){
        return userPhoneNumber;
    }

    public String getUserPassword(){
        return userPassword;
    }

    //Setters for candidate
    public void setCandidateName(String name){
        userName = name;
    }

    public void setCandidateID(int id){
        userID = id;
    }

    public void setUserEmail(String email){
        userEmail = email;
    }

    public void setUserPhoneNumber(String number){
        userPhoneNumber = number;
    }

    public void setUserPassword(String pass){
        userPassword = pass;
    }

    @Override
    public String toString(){
        return "Name: " + userName + " | ID: " + userID + " | Email: " + userEmail + " | Phone Number: " + userPhoneNumber;
    }

}
