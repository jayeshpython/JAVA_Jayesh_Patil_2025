

final class College{
    final static String collegeName;

    static{
        collegeName = "D.Y. Patil Institutte of Technology";
    }

    public final void displayCollegeName(){
        System.out.println("College Name: " + collegeName);
    }
}

class Department{
    final int deptID;
    String deptName;

    Department(int deptID, String deptName){
        this.deptID = deptID;
        this.deptName = deptName;
    }

    void displayDepartment(){
        System.out.println("Department name: " + deptName);
        System.out.println("Department id: " + deptID);
    }
}

class Professor extends Department{
    String profName;

    Professor(int deptID, String deptName, String profName){
        super(deptID, deptName);
        this.profName = profName;
    }

    void displayDepartment(){
        super.displayDepartment();
        System.out.println("Professor name: " + profName);
    }
}

public class FinalClass{
    public static void main(String[] args) {
        
        College c = new College();
        c.displayCollegeName();

        Department d = new Professor(123, "Computer", "Deshmukh");
        d.displayDepartment();
    }
}