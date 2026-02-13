package Bean;
import java.util.*;

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

    public Branch getBranch(String branchName){
        return branchWiseCutOffsForPharmacy.get(branchName);
    }

    //display all medical branches
   public void displayAllBranches() {
        System.out.println("\nBranches in " + getCollegeName() + ":");

        if (branchWiseCutOffsForPharmacy.isEmpty()) {
            System.out.println("No branches available");
            return;
        }

        for (Map.Entry<String, Branch> entry : branchWiseCutOffsForPharmacy.entrySet()) {
            System.out.println("Branch: " + entry.getKey());
            System.out.println("Details: " + entry.getValue());
            System.out.println("----------------------");
        }
}


    @Override
    public String toString() {
        return super.toString() + "\nMedical Branches: " + branchWiseCutOffsForPharmacy;
    }
}
