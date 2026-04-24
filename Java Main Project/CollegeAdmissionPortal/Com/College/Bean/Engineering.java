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

    public void setBranchWiseCutOffsForEngineering(HashMap<String, Branch> map){
        this.branchWiseCutOffsForEngineering = map;
    }

    //display all branches
    @Override
    public void displayAllBranches() {
        System.out.println("\nBranches in " + getCollegeName() + ":");

        if (branchWiseCutOffsForEngineering.isEmpty()) {
            System.out.println("No branches available");
            return;
        }

        for (Map.Entry<String, Branch> entry : branchWiseCutOffsForEngineering.entrySet()) {
            System.out.println("Branch: " + entry.getKey());
            System.out.println("Cut Off Info: " + entry.getValue());
            System.out.println("----------------------");
        }
    }

    @Override
    public void branchesInThatParticularCollege(){
        System.out.println("\nBranches in " + getCollegeName() + ":");

        for(String branchName : branchWiseCutOffsForEngineering.keySet()){
            System.out.println(branchName);
            System.out.println("----------------------");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }


}

