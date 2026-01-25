
package com.hospital.bean;

import java.util.HashMap;

public class Patient{
    private String name;
    private int age;
    private int patientId;
    private String gender;
    private String healthDetails;   //To store health details
    private HashMap<String, String> appointmentHistory = new HashMap<>();

    //Constructor
    public Patient(String name, int age ,int patientId, String gender, String healthDetails){
        this.name = name;
        this.age = age;
        this.patientId = patientId;
        this.gender = gender;
        this.healthDetails = healthDetails;
    }

    //getter() and setters()
    public String getName(){ return name;}
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){ return age;}
    public void setAge(int age){
        this.age = age;
    }

    public int getPatientId(){ return patientId;}
    public void setPatientId(int patientId){
        this.patientId = patientId;
    }

    public String getGender(){ return gender;}
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getHealthDetails(){ return healthDetails;}
    public void setHealthDetails(String healthDetails){
        this.healthDetails = healthDetails;
    }

    public HashMap<String, String> getAppointmentHistory(){
        return appointmentHistory;
    }

    public void setAppointmentHistory(HashMap<String, String> appointmentHistory){
        this.appointmentHistory = appointmentHistory;
    }

    public String toString(){
        return "Patient name: " + name + " | Age: " + age + " | Gender: " + gender + " ID: "  +patientId + " | Health detalis: " + healthDetails;
    }
}