package Bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Student {

    //Student information attributes
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;
    private String studentPassword;

    //Student exams marks
    private String CET_Percentile;
    private String Pharma_CET;
    private String JEE_MAINS_Percentile;
    private String JEE_ADVANCE_Marks;   //JEE_ADVANCE_Percentile change to JEE_ADVANCE_Marks
    private String NEET_Marks;     //NEET_Percentile change to NEET_Marks
    private String BITSAT_Marks;
    private String AIT_Marks;

    //Form filled status
    private String formFilledForEngineering = "Not Filled";
    private String formFilledForMedical = "Not filled";
    private String formFilledForPharmacy = "Not filled";

    //Application form list
    public List<ApplicationForm> formsList = new ArrayList<>();

    //Result hasmap (student allocated college and name)
    public HashMap<String, College> resultForEngg = new HashMap<>();
    public HashMap<String, College> resultForMed = new HashMap<>();
    public HashMap<String, College> resultForPharma = new HashMap<>();
   
    public Student(int studentId,String studentName,String studentEmail,String studentPhoneNumber,
        String studentPassWord){

            this.studentId = studentId;
            this.studentName = studentName;
            this.studentEmail = studentEmail;
            this.studentPhoneNumber = studentPhoneNumber;
            this.studentPassword = studentPassWord;

    } 

    //Getter method for application form
    public List<ApplicationForm> getApplicationFormsList(){
        return formsList;
    }
    
    public void setStudentName(String name){
        this.studentName=name;
    }

    public void setStudentEmail(String email){
        this.studentEmail=email;
    }

    public void setStudentPhoneNumber(String number){
        this.studentPhoneNumber=number;
    }

    public void set_CET_Percentile(String percentile){
        this.CET_Percentile=percentile;
    }

    public void set_Pharma_CET_Percetile(String percentile){
        this.Pharma_CET = percentile;
    }

    public void set_JEE_MAINS_Percentile(String percentile){
        this.JEE_MAINS_Percentile=percentile;
    }

    public void set_JEE_ADVANCE_Marks(String marks){  // percentile replaced with marks
        this.JEE_ADVANCE_Marks = marks;
    }

    public void set_NEET_Marks(String marks){         // percentile replaced with marks
        this.NEET_Marks = marks;
    }

    public void set_BITSAT_Marks(String marks){
        this.BITSAT_Marks = marks;
    }

    public void set_AIT_Marks(String marks){
        this.AIT_Marks = marks;
    }

    public void set_Engg_Form_Status(){
        this.formFilledForEngineering = "Filled";
    }

    public void set_Med_Form_Status(){
        this.formFilledForMedical = "Filled";
    }

    public void set_Pharma_Form_Status(){
        this.formFilledForPharmacy = "Filled";
    }

    public String get_Engg_Form_Status(){
        return formFilledForEngineering;
    }

    public String get_Med_Form_Status(){
        return formFilledForMedical;
    }

    public String get_Pharma_Form_Status(){
        return formFilledForPharmacy;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getStudentEmail(){
        return studentEmail;
    }

    public String getPhoneNumber(){
        return studentPhoneNumber;
    }

    public String getPassWord(){
        return studentPassword; 
    } 

    public String getCET(){
        return CET_Percentile;
    }

    public String getPharmaCET(){
        return Pharma_CET;
    }

    public String getJEE_MAINS(){
        return JEE_MAINS_Percentile;
    }

    public String getJEE_ADVANCE(){
        return JEE_ADVANCE_Marks;    // percentile replaced with marks
    }

    public String getNEET(){
        return NEET_Marks;           // percentile replaced with marks
    }

    public String getBITSAT(){
        return BITSAT_Marks;
    }

    public String getAIT(){
        return AIT_Marks;
    }

    public void displayListOfAppliedColleges(){

        int i=1;
        if(formsList.isEmpty()){
            System.out.println("You Have Not Apply To Any College Yet");
            return;
        }
        for(ApplicationForm f:formsList){
            System.out.println(i+"."+f);
            i++;
        }
        System.out.println("\n");
    }

    // ====== Apply to College ======
    public void applytoCollege(Scanner sc,College college) {

         sc.nextLine();
        System.out.print("\tDo You want to see all available branches,in this college(Y/N):");
        char ch=sc.nextLine().charAt(0);
        if(ch=='y'||ch=='Y'){
            college.branchesInThatParticularCollege();
        }else if(ch!='n' && ch!='N'){
            System.out.println("\tInvalid choice");
        }
        System.out.print("\n\tChoose branch for which you want to apply for (from above mention branches): ");
        String branchName=sc.nextLine();
        Branch branch=college.getBranch(branchName);
        if(branch==null){
            System.out.println("\tInvalid Branch Name");
            return;
        }
        ApplicationForm form = new ApplicationForm(this,college,branch);
        int seats=branch.getAvailableSeats()-1;
        branch.setAvailableSeats(seats);
        this.formsList.add(form);
        System.out.println("\n\tApplication Submitted Successfully..! ");

    }
    
    public void fillApplicationFormForEngineering(Scanner sc){

        System.out.print("\n\tEnter CET Percentile: ");
        set_CET_Percentile(sc.nextLine());
        System.out.print("\n\tEnter JEE Main Percetile: ");
        set_JEE_MAINS_Percentile(sc.nextLine());
        System.out.print("\n\tEnter JEE Advanced marks: ");
        set_JEE_ADVANCE_Marks(sc.nextLine());
        System.out.print("\n\tEnter BITSAT marks: ");
        set_BITSAT_Marks(sc.nextLine());
        System.out.print("\n\tEnter AIT marks: ");
        set_AIT_Marks(sc.nextLine());

        set_Engg_Form_Status();
    }

    public void fillApplicationFormForMedical(Scanner sc){
        System.out.print("\n\tEnter NEET marks: ");
        set_NEET_Marks(sc.nextLine());

        set_Med_Form_Status();
    }

    public void fillApplicationFormForPharmacy(Scanner sc){
        System.out.print("\n\tEnter CET marks for pharmacy: ");
        set_Pharma_CET_Percetile(sc.nextLine());

        set_Pharma_Form_Status();
    }


     public boolean eligibleForCollegeEng(Engineering e){
        
        CollegeType t=e.getType();

        switch (t) {
            case IIT:
                if(JEE_ADVANCE_Marks.equalsIgnoreCase("NA")){
                    System.out.println("\tYou are not eligible to apply for IIT colleges . Try to apply to another colleges");
                    return false;

                }
            case NIT:
                if(JEE_MAINS_Percentile.equalsIgnoreCase("NA")){
                    System.out.println("\tYou are not eligible to apply for NIT colleges. Try to apply to another colleges");
                    return false;
                }
               
            case IISER:
                if(JEE_ADVANCE_Marks.equalsIgnoreCase("NA")){
                    System.out.println("\tYou are not eligible to apply for IISER colleges .Try to apply to another colleges");
                    return false;
                }
            
            case BITS:
                if(BITSAT_Marks.equalsIgnoreCase("NA")){
                    System.out.println("\tYou are not eligible to apply for BITS colleges .Try to apply to another colleges");
                    return false;
                }  
             
            case OtherEngineering:
                if(JEE_MAINS_Percentile.equalsIgnoreCase("NA") || CET_Percentile.equalsIgnoreCase("NA")){
                    System.out.println("\tYou are not eligible to apply for Colleges");
                }   
        
            default:
                break;
        }

        return true;
        
    }

    public boolean eligibleForCollegeMed(Medical e){
        
        if(this.NEET_Marks.equalsIgnoreCase("NA")){
            System.out.println("\tYou are not eligible for Medical   college");
            return false;
        }

        return true;
        
    }

    public boolean eligibleForCollegePhar(Pharmacy e){
        
        if(this.Pharma_CET.equalsIgnoreCase("NA")){
            System.out.println("\tYou are not eligible for pharmacy college");
            return false;
        }
        return true; 
    }

    public void collegeAllocatedForEngg(){

        if(formsList.isEmpty()){
            System.out.println("\n\tYou have not applied to any colleges.");
            return;
        }
        boolean allocated = false;

        for(ApplicationForm form : formsList){

            College college = form.getCollege();
            Branch branch = form.getBranch();

            Engineering engg = (Engineering) college;

            //marks conversion
            double jeeMain = Double.parseDouble(this.JEE_MAINS_Percentile);
            double jeeAdv = Double.parseDouble(this.JEE_ADVANCE_Marks);
            double bitSat = Double.parseDouble(this.BITSAT_Marks);
            double cet = Double.parseDouble(CET_Percentile);

            double lastYear = branch.getLastYearCutOff();
            double thisYear = branch.getThisYearCutOff();

            CollegeType type = engg.getType();

            boolean eligible = false;

            switch(type){

                case IIT:
                    if(jeeAdv >= thisYear){
                        eligible = true;
                    }
                    break;

                case NIT:
                    if(jeeMain >= thisYear){
                        eligible = true;
                    }
                    break;

                case BITS:
                    if(bitSat >= thisYear){
                        eligible = true;
                    }
                    break;

                case OtherEngineering:
                    if(jeeMain >= thisYear || cet >= thisYear){
                        eligible = true;
                    }
                    break;

                default:
                    break;
            }
            if(eligible && branch.getAvailableSeats() > 0){
                System.out.println("\n\tCongratulations " + this.studentName + " got selected");
                System.out.println("\n\tCollege Allocated: " + college.getCollegeName());
                System.out.println("\n\tBranch Allocated: " + branch.getBranchName());

                allocated = true;

                //Storing student details in result HashMap
                resultForEngg.put(this.studentName, college);
                break;
            }
        }

        if(!allocated){
            System.out.println("Sorry no college allocated to you based on your marks and preferences.");
        }
    }

    public void collegeAllocatedForMedical(){

        if(formsList.isEmpty()){
            System.out.println("\n\tYou have not applied to any colleges.");
            return;
        }

        boolean allocated = false;

        for(ApplicationForm form: formsList){

            College college = form.getCollege();
            Branch branch = form.getBranch();

            Medical med = (Medical) college;

            double neet = Double.parseDouble(NEET_Marks);

            double lastYear = branch.getLastYearCutOff();
            double thisYear = branch.getThisYearCutOff();

            CollegeType type = college.getType();

            boolean eligible = false;

            switch(type){
                case AIIMS:
                    if(neet >= thisYear){
                        eligible = true;
                    }
                    break;

                case OtherMedical:
                    if(neet >= thisYear){
                        eligible = true;
                    }
                    break;

                default:
                    break;
            }
            if(eligible && branch.getAvailableSeats() >0){
                System.out.println("\n\tCongratulations " + this.studentName + " got selected");
                System.out.println("\n\tCollege Allocated: " + college.getCollegeName());
                System.out.println("\n\tBranch Allocated: " + branch.getBranchName());

                allocated = true;

                //Storing student details in result HashMap
                resultForMed.put(this.studentName, college);
                break;
            }
        }
        if(!allocated){
            System.out.println("Sorry no college allocated to you based on your marks and preferences.");
        }
    }

    public void collegeAllocatedForPharmacy(){

        if(formsList.isEmpty()){
            System.out.println("\n\tYou have not applied to any colleges.");
            return;
        }

        boolean allocated = false;

        for(ApplicationForm form : formsList){

            College college = form.getCollege();
            Branch branch = form.getBranch();

            Pharmacy pharma = (Pharmacy) college;

            double  pharmaCet = Double.parseDouble(Pharma_CET);

            double thisYear = branch.getThisYearCutOff();

            CollegeType type = college.getType();

            boolean eligible = false;

            if(pharmaCet >= thisYear){
                eligible = true;
                break;
            }

            if(eligible && branch.getAvailableSeats() >0){
                System.out.println("\n\tCongratulations " + this.studentName + " got selected");
                System.out.println("\n\tCollege Allocated: " + college.getCollegeName());
                System.out.println("\n\tBranch Allocated: " + branch.getBranchName());

                allocated = true;

                //Storing student details in result HashMap
                resultForPharma.put(this.studentName, college);
                break;
            }
        }
        if(!allocated){
            System.out.println("Sorry no college allocated to you based on your marks and preferences.");
        
        }
    }
}




