
package com.job.bean;
import java.util.ArrayList;
import java.util.List;

public class Job {
    private int jobID;
    private String role;
    private double salary;
    private int requiredExperience;
    private List<String> requiredSkills;
    private String location;
    private JobType type;

    //Recruiter object;
    private Recruiter recruiter;

    //Application from list
    private List<ApplicationForm> form;

    public Job(int jobID, String role, double salary, int requiredExperience, String location, JobType type){
        this.jobID = jobID;
        this.role = role;
        this.salary = salary;
        this.requiredExperience = requiredExperience;
        this.location = location;

        this.type = type;

        this.requiredSkills = new ArrayList<>();
        this.form = new ArrayList<>();
    }

    //Add skills
    public void addSkills(String skills){
        requiredSkills.add(skills);
    }

    //Add Application form;
    public void addApplicationForm(ApplicationForm app){
        form.add(app);
    }

    // Getters
    public int getJobId(){
        return jobID;
    }

    public String getJobTitle(){
        return role;
    }

    public List<String> getSkills() {
        return requiredSkills;
    }

    public double getSalary(){
        return salary;
    }

    public int getRequiredExperience(){
        return requiredExperience;
    }

    public List<String> getRequiredSkills(){
        return requiredSkills;
    }

    public String getLocation(){
        return location;
    }

    public JobType getType(){
        return type;
    }

    public Recruiter getRecruiter(){
        return recruiter;
    }

    public List<ApplicationForm> getApplications(){
        return form;
    }

    //Setters
    public void setJobTitle(String jobTitle){
        this.role = jobTitle;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setRequiredExperience(int exp){
        this.requiredExperience = exp;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setType(JobType type){
        this.type = type;
    }

    public String getCompanyName(){
        return recruiter.getCompanyName();
    }

    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }

    @Override
    public String toString(){
        return "Job ID: " + jobID +
                " | Role: " + role +
                " | Salary: " + salary +
                " | Experience: " + requiredExperience +
                " | Skills: " + requiredSkills +
                " | Location: " + location +
                " | Type: " + type;
    }
}
