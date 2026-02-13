package Bean;

public class ApplicationForm {

    private Student student;
    private College college;
    private Branch branch;
    private String status = "Pending";

    public ApplicationForm(Student student,College college,Branch branch) {
        this.student = student;
        this.college = college;
        this.branch=branch;
        this.status = "Submitted";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


    @Override
    public String toString(){
        return  "  College: " + college.getCollegeName() + " | Branch: "+branch.getBranchName() + " | Status: " + status;
    }
}
