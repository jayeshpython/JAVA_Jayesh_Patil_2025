
package com.college.bean;
import java.util.HashMap;
import java.util.Map;

public class Pharmacy extends College{
    private HashMap<String, Branch> branchWiseCutOffsForPharmacy = new HashMap<>();
    
    public Pharmacy(String collegeName,String collegeEmailId,String collegeContactNumber,String collegeLocation, CollegeType type) {

        super(collegeName, collegeEmailId, collegeContactNumber, collegeLocation, type);
    }

    //adding field to college and their cutoffs
    public void addBranch(String BranchName, Branch branch){
        branchWiseCutOffsForPharmacy.put(BranchName, branch);
    }

    //get all branches in Pharmacy
    public HashMap<String, Branch> getAllBranches() {
        return branchWiseCutOffsForPharmacy;
    }

    //display all medical branches
    public void displayAllBranches() {
        System.out.println("Displaying medical branches in " + getCollegeName());
        for (Map.Entry<String, Branch> entry : branchWiseCutOffsForPharmacy.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMedical Branches: " + branchWiseCutOffsForPharmacy;
    }
}
