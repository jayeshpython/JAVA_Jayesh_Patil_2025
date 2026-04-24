
package com.job.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidate extends User{
    
    //Candidate info for apllying job
    private String tenthMarks;
    private String twelthMarks;
    private String yearOfExperienced;
    private CandidateType type;
    private List<String> skills = new ArrayList<>();

    private List<ApplicationForm> appliedJobs = new ArrayList<>();

    private String formFilled = "Not Filled";

    public Candidate(String userName, int userID, String userEmail,String userPhoneNumber, String userPassword) {

        super(userName, userID, userEmail, userPhoneNumber, userPassword);
    }

    //Add skills
    public void addSkills(String skill){
        skills.add(skill);
    }

    //Remove skills
    public void removeSkills(String skill){
        skills.remove(skill);
    }

    //Getters
    public String getTenthMarks() {
        return tenthMarks;
    }

    public String getTwelfthMarks() {
        return twelthMarks;
    }

    public CandidateType getType() {
        return type;
    }

    public List<String> getSkills() {
        return skills;
    }

    public String getFormFilledStatus(){
        return formFilled;
    }

    //Setters
    public void setTenthMarks(String tenthMarks) {
        this.tenthMarks = tenthMarks;
    }

    public void setTwelfthMarks(String twelfthMarks) {
        this.twelthMarks = twelfthMarks;
    }

    public void setType(CandidateType type) {
        this.type = type;
    }

    public void setYearOfExperience(String year){
        this.yearOfExperienced = year;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setFormFilledStatus(){
        this.formFilled = "Filled";
    }

    public List<ApplicationForm> getAppliedJobs(){
        return appliedJobs;
    }

    public void fillApplicationForm(Scanner sc){
        System.out.print("\n\t\tEnter 10th Marks: ");
        setTenthMarks(sc.nextLine());

        System.out.print("\n\t\tEnter 12th Marks: ");
        setTenthMarks(sc.nextLine());

        System.out.print("\n\t\tEnter Years of experience: ");
        setYearOfExperience(sc.nextLine());

        System.out.print("\n\t\tSelect Candidate Type:");
        System.out.println("\t\t1. FRESHER");
        System.out.println("\t\t2. EXPERIENCED");

        int choice = Integer.parseInt(sc.nextLine());

        if(choice == 1){
            setType(CandidateType.FRESHER);
        }else{
            setType(CandidateType.EXPERIENCED);
        }

        System.out.print("\n\t\tEnter your skills: ");
        String inputSkills = sc.nextLine();

        String[] skillArray = inputSkills.split(",");

        for(String skill : skillArray){
            addSkills(skill.trim());
        }

        setFormFilledStatus();

    }

    @Override
    public String toString(){
        return super.toString() +
                " | 10th: " + tenthMarks +
                " | 12th: " + twelthMarks +
                " | Type: " + type +
                " | Skills: " + skills;
    }
}
