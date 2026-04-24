package com.job.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MatchingEngine {
    
    //List of application which candidate applied for
    public List<ApplicationForm> form = new ArrayList<>();

    HashMap<Job, Double> score = new HashMap<>();

    public MatchingEngine(){}

    public boolean eligibleForJob(Candidate cand, Job job){
        CandidateType c = cand.getType();
        JobType j = job.getType();

        if(j.name().equalsIgnoreCase(c.name())){
            return true;
        }

        if(job.getType() == JobType.REMOTE){
            return true;
        }

        return false;

    }

    public void applyToJob(Candidate cand, Job job){

        if(eligibleForJob(cand, job)){
            System.out.println("\n\tApplication Successful!");
            System.out.println("\tYou applied for: " + job.getJobTitle());

            ApplicationForm f = new ApplicationForm(cand, job);
            cand.getAppliedJobs().add(f);
            
            System.out.println("\n\t\tApplication Submitted Successfully..! ");
        }
        else{
            System.out.println("\n\tYou are NOT eligible for this job.");
        }
    }

    public void displayAppliedJobs(){

        if(form.isEmpty()){
            System.out.println("\n\t\tYou not appliend for any job.");
            return;
        }else{
            for(ApplicationForm f : form){
                System.out.println(f + " ");
            }
        }
    }

    public void candidateScoreMatch(Candidate cand){

        score.clear();

        for(ApplicationForm form : cand.getAppliedJobs()){

            Job job = form.getJob();
            int matchCount = 0;

            for(String cSkill : cand.getSkills()){

                for(String jSkill : job.getSkills()){

                    if(cSkill.equalsIgnoreCase(jSkill)){
                        matchCount++;
                    }
                }
            }

            double matchScore = 0.0;

            if(!job.getSkills().isEmpty()){
                matchScore = ((double)matchCount / job.getSkills().size()) * 100;
            }

            score.put(job, matchScore);
        }

        for(Job j : score.keySet()){
            System.out.println("\n\t\tJob: " + j.getJobTitle());
            System.out.println("\t\tMatch Score: " + score.get(j) + "%");
        }
    }

    public void companiesInWhichYouGotSelected(Candidate cand){

        if(score.isEmpty()){
            System.out.println("\n\t\tNo matching score available. Please run matching first.");
            return;
        }

        boolean found = false;

        for(Job j : score.keySet()){

            if(score.get(j) >= 70){

                System.out.println("\n\t\tCongratulations! You are shortlisted 🎉");
                System.out.println("\t\tCompany : " + j.getCompanyName());
                System.out.println("\t\tRole    : " + j.getJobTitle());
                System.out.println("\t\tScore   : " + score.get(j) + "%");
                System.out.println("\t\t----------------------------------");

                found = true;
            }
        }

        if(!found){
            System.out.println("\n\t\tNo companies shortlisted (Score < 70%)");
        }

    }
    
}
