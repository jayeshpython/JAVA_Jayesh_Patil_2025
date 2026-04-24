
package com.job.bean;

public class ApplicationForm {
    private Candidate candidate;
    private Job job;
    private String applicationFormStatus = "Pending";

    public ApplicationForm(Candidate candidate, Job job){
        this.candidate = candidate;
        this.job = job;
        this.applicationFormStatus = "Submitted";
    }

    public void setStatus(String status){
        applicationFormStatus = status;
    }

    public String getApplicationFormStatus(){
        return applicationFormStatus;
    }

    public Candidate getCandidate(){
        return candidate;
    }

    public Job getJob(){
        return job;
    }

    @Override
    public String toString(){
        return "Candidate Name: " + candidate.getUserName() + " | Job Name: " + job.getJobTitle() + " | Status: " + applicationFormStatus;
    }

}
