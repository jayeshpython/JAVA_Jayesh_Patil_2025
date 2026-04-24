

package com.job.bean;
import java.util.HashMap;

public class Recruiter extends User{
    private String companyName;

    //Stores job id and job class
    private HashMap<Integer, Job> postJobs = new HashMap<>();

    public Recruiter(String userName, int userID, String userEmail,String userPhoneNumber, String userPassword, 
        String companyName){

        super(userName, userID, userEmail, userPhoneNumber, userPassword);
        this.companyName = companyName;
        
    }

    //Add job
    public void postJobs(Job job){
        job.setRecruiter(this);   // ✅ IMPORTANT
        postJobs.put(job.getJobId(), job); 
    }

    public void removeJob(int jobId){
        postJobs.remove(jobId);
    }

    //Getters
    public String getCompanyName(){
        return companyName;
    }

    public HashMap<Integer,Job> getPostedJob(){
        return postJobs;
    }

    //Setter
    public void setCompanyName(String company){
        companyName = company;
    }

    public void setPostedJobs(HashMap<Integer, Job> job){
        postJobs = job;
    }

    @Override
    public String toString(){
        return super.toString() +
                " | Company: " + companyName;
    }

}
