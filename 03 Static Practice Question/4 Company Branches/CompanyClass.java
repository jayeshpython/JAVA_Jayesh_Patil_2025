
import java.util.Scanner;

class Company{
    private static String companyName;
    private static String branchName;
    private static int totalBranches = 0;
    
    Company(String branchName){
        this.branchName = branchName;
        totalBranches++;
    }

    public static void setCompanyName(String name){
        companyName = name;
    }

    public String getCompanyName(){
        return companyName;
    }

    public static void totalBranches(){
        System.out.println("Total Branches: " + totalBranches);
    }

    public void dispaly(){
        System.out.println("Company Name: " + getCompanyName());
        System.out.println("Branch Name: " + branchName);
    }
}

public class CompanyClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name: " );
        String company = sc.nextLine();

        Company.setCompanyName(company);
        Company c1 = new Company("MumBai");
        Company c2 = new Company("Banglore");
        Company c3 = new Company("Hydrebad");

        c1.dispaly();
        System.out.println();
        c2.dispaly();
        System.out.println();
        c3.dispaly();
        System.out.println();
        Company.totalBranches();
    }
}