package Bean;

public abstract class College{
    private final  String collegeName;
    private  String collegeEmailId;
    private String collegeContactNumber;
    private final String collegeLocation;
    private CollegeType type;

    //Colege class Constructor
    public College(String collegeName, String collegeEmailId, String collegeContactNumber, String collegeLocation, CollegeType type){
        this.collegeName = collegeName;
        this.collegeEmailId = collegeEmailId;
        this.collegeContactNumber = collegeContactNumber;
        this.collegeLocation = collegeLocation;
        this.type = type;
    }

    //getters and setters
    public String getCollegeName(){ return collegeName;}

    public String getCollegeEmailId(){ return collegeEmailId;}
    public void setCollegeEmailId(String collegeEmailId){
        this.collegeEmailId = collegeEmailId;
    }

    public String getCollegeContactNumber(){ return collegeContactNumber;}
    public void setCollegeContactNumber(String collegeContactNumber){
        this.collegeContactNumber = collegeContactNumber;
    }

    public String getCollegeLocation(){ return collegeLocation;}

    public CollegeType getType() {
        return type;
    }

    @Override
    public String toString(){
        return "College Name: " + collegeName + "\t| College Location: " + collegeLocation + "\t| College Email id: " + collegeEmailId + "\t| College contact number: " + collegeContactNumber;
    }

    abstract public void displayAllBranches();

    abstract public Branch getBranch(String branchName);

    

}