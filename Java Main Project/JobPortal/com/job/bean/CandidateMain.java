

package com.job.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class CandidateMain {
    private HashMap<Integer, Candidate> candidateList;
    private Candidate candidate;
    private int id = 1;

    public CandidateMain(){
        candidateList = new HashMap<>();
    }

    public void addCandidate(Candidate c){
        candidateList.put(c.getUserId(), c);
    }

    public Candidate getCandidateById(int id){
        return candidateList.get(id);
    }

    public int generateCandidateId(){
        return id++;
    }

    public ArrayList<Candidate> getCandidateList(){
        ArrayList<Candidate> can = new ArrayList<>();

        for(Candidate c: candidateList.values()){
            can.add(c);
        }
        return can;
    }
}
