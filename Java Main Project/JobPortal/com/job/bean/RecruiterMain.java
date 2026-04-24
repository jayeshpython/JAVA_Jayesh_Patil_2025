

package com.job.bean;
import java.util.ArrayList;
import java.util.HashMap;


public class RecruiterMain {
    private HashMap<Integer, Recruiter> recruiterList;
    private Recruiter recruiter;
    private int id;

    public RecruiterMain(){
        recruiterList = new HashMap<>();
    }

    public void addRecruiter(Recruiter r){
        recruiterList.put(r.getUserId(), r);
    }

    public int generateRecruiterById(){
        return id++;
    }

    public Recruiter getRecruiterById(int id){
        return recruiterList.get(id);
    }

    public ArrayList<Recruiter> getRecruiterList(){

        ArrayList<Recruiter> rec = new ArrayList<>();

        for(Recruiter r: recruiterList.values()){
            rec.add(r);
        }
        return rec;
    }
}
