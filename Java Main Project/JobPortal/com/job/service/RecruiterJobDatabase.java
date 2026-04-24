
package com.job.service;

import com.job.bean.*;
import java.util.ArrayList;
import java.util.HashMap;

public class RecruiterJobDatabase {
   
    private static HashMap<Integer, Recruiter> recruiterDatabase;
    private static ArrayList<Job> jobList;

    static{
        recruiterDatabase = new HashMap<>();
        jobList = new ArrayList<>();
        createRecruiterDatabase();
    }

    private static void createRecruiterDatabase(){

        Recruiter r1 = new Recruiter(
                "Amit Sharma",
                1,
                "amit@tcs.com",
                "9876543210",
                "123",
                "TCS"
        );

        Job j1 = new Job(101,"Java Developer",800000,2,"Pune",JobType.EXPERIENCED);
        j1.addSkills("Java");
        j1.addSkills("Spring");
        j1.addSkills("MySQL");
        jobList.add(j1);

        Job j2 = new Job(102,"Frontend Developer",600000,1,"Mumbai",JobType.FRESHER);
        j2.addSkills("HTML");
        j2.addSkills("CSS");
        j2.addSkills("JavaScript");

        r1.postJobs(j1);
        r1.postJobs(j2);
        jobList.add(j2);

    
        Recruiter r2 = new Recruiter(
                "Neha Patil",
                2,
                "neha@infosys.com",
                "9123456780",
                "123",
                "Infosys"
        );

        Job j3 = new Job(103,"Python Developer",750000,2,"Bangalore",JobType.EXPERIENCED);
        j3.addSkills("Python");
        j3.addSkills("Django");

        r2.postJobs(j3);
        jobList.add(j3);

        
        Recruiter r3 = new Recruiter(
                "Rahul Mehta",
                3,
                "rahul@wipro.com",
                "9988776655",
                "123",
                "Wipro"
        );

        Job j4 = new Job(104,"Java Intern",20000,0,"Remote",JobType.INTERN);
        j4.addSkills("Java");
        j4.addSkills("OOP");

        r3.postJobs(j4);
        jobList.add(j4);

        
        recruiterDatabase.put(1, r1);
        recruiterDatabase.put(2, r2);
        recruiterDatabase.put(3, r3);
    }

    public HashMap<Integer, Recruiter> getAllRecruiters(){
        return recruiterDatabase;
    }

    public Recruiter getRecruiter(int code){
        return recruiterDatabase.get(code);
    }

    public void addRecruiter(int code, Recruiter r){
        recruiterDatabase.put(code, r);
    }

    public ArrayList<Job> getAllJobs(){
        return jobList; 
    }
}