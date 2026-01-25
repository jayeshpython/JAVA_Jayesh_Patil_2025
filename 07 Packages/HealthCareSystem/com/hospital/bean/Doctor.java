
package com.hospital.bean;

public class Doctor{
    private String doctorName;
    private String specialization;
    private boolean availability;
    private double consultationFee;

    public Doctor(String doctorName, String specialization, double consultationFee){
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public void setDoctorName(String doctorName){
        this.doctorName = doctorName;
    }
    public String getDoctorName(){ return doctorName;}

    public String getSpecialization() { return specialization;}
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public boolean getAvailability(){ return availability;}
    public void setAvailability(boolean availability){
        this.availability = availability;
    }

    public double getConsultationFee(){ return consultationFee;}
    public void setConsultationFee(double consultationFee){
        this.consultationFee = consultationFee;
    }

    @Override
    public String toString(){
        return "Doctor name: " + doctorName + " | Specialization: " + specialization + " | Consultation fee: " + consultationFee + " | Availability status: " + availability;
    }
}