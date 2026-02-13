package Bean;
import java.util.*;

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

    public Branch getBranch(String branchName){
        return branchWiseCutOffsForMedical.get(branchName);
    }

    //display all medical branches
    public void displayAllBranches() {
        System.out.println("\nBranches in " + getCollegeName() + ":");

        if (branchWiseCutOffsForMedical.isEmpty()) {
            System.out.println("No branches available");
            return;
        }

        for (Map.Entry<String, Branch> entry : branchWiseCutOffsForMedical.entrySet()) {
            System.out.println("Branch: " + entry.getKey());
            System.out.println("Details: " + entry.getValue());
            System.out.println("----------------------");
        }
}


    @Override
    public String toString() {
        return super.toString() + "\nMedical Branches: " + branchWiseCutOffsForMedical;
    }
}
