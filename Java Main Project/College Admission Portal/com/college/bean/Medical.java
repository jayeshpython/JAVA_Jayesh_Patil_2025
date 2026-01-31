
package com.college.bean;
import java.util.HashMap;
import java.util.Map;

public class Medical extends College{
    private HashMap<String, Branch> branchWiseCutOffsForMedical = new HashMap<>();

    //Medical college constructor
    public Medical(String collegeName,String collegeEmailId,String collegeContactNumber,String collegeLocation, CollegeType type) {

        super(collegeName, collegeEmailId, collegeContactNumber, collegeLocation, type);
    }

    //adding field to college and their cutoffs
    public void addBranch(String BranchName, Branch branch){
        branchWiseCutOffsForMedical.put(BranchName, branch);
    }

    //get all branches in Pharmacy
    public HashMap<String, Branch> getAllBranches() {
        return branchWiseCutOffsForMedical;
    }

    //display all medical branches
    public void displayAllBranches() {
        System.out.println("Displaying medical branches in " + getCollegeName());
        for (Map.Entry<String, Branch> entry : branchWiseCutOffsForMedical.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMedical Branches: " + branchWiseCutOffsForMedical;
    }
}
