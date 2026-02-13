package Bean;
import java.util.*;
public class Engineering extends College{
    private HashMap<String, Branch> branchWiseCutOffsForEngineering = new HashMap<>();
    

    //Enginnering class constructor
    public Engineering(String collegeName,String collegeEmailId,String collegeContactNumber,String collegeLocation, CollegeType type) {
        super(collegeName, collegeEmailId, collegeContactNumber, collegeLocation, type);
    }

    //adding branches to college and their cutoffs
    public void addBranchDetails(String branchname, Branch branch){
        branch.setBranchName(branchname);
        branchWiseCutOffsForEngineering.put(branchname, branch);
    }


    //get all branch
    public HashMap<String, Branch> getAllBranch(){
        return branchWiseCutOffsForEngineering;
    }

    public Branch getBranch(String branchName){
        return branchWiseCutOffsForEngineering.get(branchName);
    }

    //display all branches
    public void displayAllBranches() {
        System.out.println("\nBranches in " + getCollegeName() + ":");

        if (branchWiseCutOffsForEngineering.isEmpty()) {
            System.out.println("No branches available");
            return;
        }

        for (Map.Entry<String, Branch> entry : branchWiseCutOffsForEngineering.entrySet()) {
            System.out.println("Branch: " + entry.getKey());
            System.out.println("Details: " + entry.getValue());
            System.out.println("----------------------");
        }
    }


    @Override
    public String toString() {
        return super.toString() + "\nBranches: " + branchWiseCutOffsForEngineering;
    }


}

