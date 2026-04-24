

package com.job.service;
import com.job.bean.*;
import java.util.ArrayList;

public class PortalFunctionalityImplementatiion implements PortalFunctionality{
    private RecruiterJobDatabase data;
    private CandidateMain candMain;

    public PortalFunctionalityImplementatiion(){
        data = new RecruiterJobDatabase();
        candMain = new CandidateMain();
    }

    public Candidate getCandidate(int code){
        return candMain.getCandidateById(code);
    }

    public Job getJobById(int id){
        for(Job j : data.getAllJobs()){
            if(j.getJobId() == id){
                return j;
            }
        }
        return null;
    }

    public void displayAllAvailableJobs(){

        ArrayList<Job> jobList = data.getAllJobs();

        if(jobList.isEmpty()){
            System.out.println("\n\t\tNo job available");
            return;   
        }

        System.out.println("\n\t\t=========== Available Jobs ===========\n");

        for(Job j : jobList){
            System.out.println("\tJob ID      : " + j.getJobId());
            System.out.println("\tTitle       : " + j.getJobTitle());
            System.out.println("\tCompany     : " + j.getCompanyName());
            System.out.println("\tLocation    : " + j.getLocation());
            System.out.println("\tSalary      : " + j.getSalary());
            System.out.println("\t--------------------------------------");
        }
    }

    public void searchJobsAccordingToLocation(String location){
        
        ArrayList<Job> jobsList = data.getAllJobs();
        boolean found = false;

        if(jobsList.isEmpty()){
            System.out.println("\n\t\tNo job available");
        }

        for(Job job : jobsList){
            if(job.getLocation().equalsIgnoreCase(location)){
                System.out.println("\n\tJob ID   : " + job.getJobId());
                System.out.println("\tTitle    : " + job.getJobTitle());
                System.out.println("\tCompany  : " + job.getCompanyName());
                System.out.println("\tLocation : " + job.getLocation());
                System.out.println("\tSalary   : " + job.getSalary());
                System.out.println("\t------------------------------");

                found = true;
            }
        }

        if(!found){
            System.out.println("\n\tNo jobs found for location: " + location);
        }
    }

    public void searchJobAccordingToType(JobType type){

        ArrayList<Job> jobsList = data.getAllJobs();
        boolean found = false;

        if(jobsList.isEmpty()){
            System.out.println("\n\t\tNo job available");
        }

        for(Job job : jobsList){
            if(job.getType().equals(type)){
                System.out.println("\n\tJob ID   : " + job.getJobId());
                System.out.println("\tTitle    : " + job.getJobTitle());
                System.out.println("\tCompany  : " + job.getCompanyName());
                System.out.println("\tLocation : " + job.getLocation());
                System.out.println("\tSalary   : " + job.getSalary());
                System.out.println("\t------------------------------");

                found = true;

            }
        }

        if(!found){
            System.out.println("\n\tNo jobs found for this: " + type);
        }
    }

    public void searchJobAccordingToRole(String role){

        ArrayList<Job> jobsList = data.getAllJobs();
        boolean found = false;

        if(jobsList.isEmpty()){
            System.out.println("\n\t\tNo job available");
        }

        for(Job job : jobsList){
            if(job.getJobTitle().equalsIgnoreCase(role)){
                System.out.println("\n\tJob ID : " + job.getJobId());
                System.out.println("\tTitle : " + job.getJobTitle());
                System.out.println("\tRole : " + job.getJobTitle());
                System.out.println("\tCompany : " + job.getCompanyName());
                System.out.println("\tLocation : " + job.getLocation());
                System.out.println("\tSalary : " + job.getSalary());
                System.out.println("\t------------------------------");

                found = true;

            }
        }

        if(!found){
            System.out.println("\n\tNo jobs found for this: " + role);
        }
    
    }

    public void searchJobAccodingToCandidateType(CandidateType type){

        ArrayList<Job> jobsList = data.getAllJobs();
        boolean found = false;

        if(jobsList.isEmpty()){
            System.out.println("\n\t\tNo job available");
            return;
        }

        for(Job job : jobsList){
            if(job.getType().name().equalsIgnoreCase(type.name())){

                System.out.println("\n\tJob ID   : " + job.getJobId());
                System.out.println("\tTitle    : " + job.getJobTitle());
                System.out.println("\tCompany  : " + job.getCompanyName());
                System.out.println("\tLocation : " + job.getLocation());
                System.out.println("\tSalary   : " + job.getSalary());
                System.out.println("\t------------------------------");

                found = true;
            }
        }

        if(!found){
            System.out.println("\n\tNo jobs found for candidate type: " + type);
        }
    }

    public void searchJobById(int id){

        ArrayList<Job> jobsList = data.getAllJobs();

        if(jobsList.isEmpty()){
            System.out.println("\n\t\tNo job available");
            return;
        }

        for(Job job : jobsList){
            if(job.getJobId() == id){

                System.out.println("\n\tJob ID   : " + job.getJobId());
                System.out.println("\tTitle    : " + job.getJobTitle());
                System.out.println("\tCompany  : " + job.getCompanyName());
                System.out.println("\tLocation : " + job.getLocation());
                System.out.println("\tSalary   : " + job.getSalary());
                System.out.println("\t------------------------------");

                return;
            }
        }

        System.out.println("\n\tNo job found with ID: " + id);
    }
}
