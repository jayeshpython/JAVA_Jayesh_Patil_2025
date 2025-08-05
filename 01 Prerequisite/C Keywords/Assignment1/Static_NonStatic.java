

public class Static_NonStatic{
    String name;
    int rollNo;
    static int totalStudentCount = 0;

    Static_NonStatic(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        totalStudentCount++;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
    }

    public static void main(String[] args) {
        Static_NonStatic stc1 = new Static_NonStatic("Raj", 57);
        stc1.displayDetails();

        Static_NonStatic stc2 = new Static_NonStatic("Yash", 24);
        stc2.displayDetails();

        Static_NonStatic stc3 = new Static_NonStatic("Sanket", 21);
        stc3.displayDetails();

        System.out.println("Total Students Count: " + Static_NonStatic.totalStudentCount);
    }
}
