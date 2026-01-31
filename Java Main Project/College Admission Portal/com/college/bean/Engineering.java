
package com.college.bean;

import java.util.HashMap;
import java.util.Map;

public class Engineering extends College{
    private HashMap<String, Branch> branchWiseCutOffsForEngineering = new HashMap<>();
    Branch branch;

    //Enginnering class constructor
    public Engineering(String collegeName,String collegeEmailId,String collegeContactNumber,String collegeLocation, CollegeType type) {
        super(collegeName, collegeEmailId, collegeContactNumber, collegeLocation, type);
    }

    //adding branches to college and their cutoffs
    public void addBranchDetails(String branchname, Branch branch){
        branchWiseCutOffsForEngineering.put(branchname, branch);
    }

    //get all branch
    public HashMap<String, Branch> getAllBranch(){
        return branchWiseCutOffsForEngineering;
    }

    //display all branches
    public void displayAllBranches(){
        System.out.println("Displaying all branches in " + getCollegeName());
        for (Map.Entry<String, Branch> entry : branchWiseCutOffsForEngineering.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    @Override
    public String toString() {
        return super.toString() + "\nBranches: " + branchWiseCutOffsForEngineering;
    }
    
}
