
package App;

import Bean.*;
import Services.CollegeFuctionalityImplementation;
import Services.CollegeFuctionalityImplementation.ColorConsole;
import Services.GetParticularCollegesDatabase;
import Services.SignInAndlogInSystem;
import java.io.*;
import java.util.*;

//import utils.ColorConsole;

public class ExamPortalApplication {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELlOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String BLUE = "\u001B[34m";
    
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("projectData.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(ANSI_GREEN + "" + line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(ANSI_RESET);

        boolean resultDeclared = false;

        Scanner sc = new Scanner(System.in);
        SignInAndlogInSystem user = new SignInAndlogInSystem();
        StudentMain studentMain = new StudentMain();
        Admin adm = new Admin();
        CollegeFuctionalityImplementation CFI = new CollegeFuctionalityImplementation();
        GetParticularCollegesDatabase particular = new GetParticularCollegesDatabase();
        int choice;
        String choiceForAplly;

        do {
            System.out.println("\n\t  ----------========== Exam Portal Application ==========--------- \t\n");
            System.out.println("\t1.SIGN-IN FOR STUDENT\t");
            System.out.println("\t2.LOG-IN FOR STUDENT\t");
            System.out.println("\t3.LOG-IN FOR ADMIN\t");
            System.out.println("\t4.LOG-OUT FOR STUDENT/ADMIN\t");

            System.out.print(ANSI_YELlOW + "\n\tEnter the your choice : ");
            choice = Integer.parseInt(sc.nextLine());
            Student s2;

            switch (choice) {

                case 1:
                    System.out.println(ANSI_RESET);
                    Student s1 = user.SignInForStudent();
                    System.out.println("\tstudent going for checking");

                    if (s1 == null) {
                        System.out.println(ANSI_RED + "\n\t\t**** Sign-In Unsuccessful ****" + ANSI_RESET);
                    } else {
                        ArrayList<Student> students = studentMain.getStudentList();
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
                            oos.writeObject(students);
                            System.out.println(ANSI_GREEN+"\n\t\t*** Student Successfully Sign-In ***" + ANSI_RESET);
                            System.out.println("\tList of students written successfully!");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 2:
                    int ch2;
                    s2 = user.LogInForStudent();
                    if (s2 == null) {
                        System.out.println(ANSI_RED + "\n\t\t**** Invalid username or password ****");
                        System.out.println(ANSI_RESET);
                        break;
                    }

                    do {

                        System.out.println(BLUE +
                                "\n----------------------------------------------------");
                        System.out.println("\t\tSTUDENT DASHBOARD");
                        System.out.println("----------------------------------------------------" +
                                ColorConsole.RESET);

                        System.out.println(ANSI_CYAN+"\n\t1.Search College By Name.");
                        System.out.println("\t2.Search College By Location.");
                        System.out.println("\t3.Display all Engineering Colleges.");
                        System.out.println("\t4.Display all Medical Colleges.");
                        System.out.println("\t5.Display all Pharmacy Colleges.");
                        System.out.println("\t6.Apply To College.");
                        System.out.println("\t7.Display All Applied Colleges.");
                        System.out.println("\t8. View Cap Round Results");  //Here will declare result of every individual student who got college
                        System.out.println("\t9.Go Back ." + ANSI_RESET);

                        System.out.print(ANSI_YELlOW + "\n\tEnter your choice: " + ANSI_RESET);
                        ch2 = Integer.parseInt(sc.nextLine());
                        //sc.nextLine();
                        // int ch2 = Integer.parseInt(sc.nextLine());

                        switch (ch2) {
                            case 1:
                                System.out.print("\n\tEnter College Name:");
                                String collegeName = sc.nextLine();
                                College c = CFI.searchCollegeByName(collegeName);                                
                        
                                if(c != null){
                                    
                                    System.out.print("\n\tDo you want to see college branch details (true/false)? : ");
                                    boolean condition = sc.nextBoolean();
                                    sc.nextLine();
                        
                                    if(condition){
                                        System.out.println("\n----- Branch Details -----");
                                        c.displayAllBranches();
                                    }
                                }
                                else {
                                    System.out.println(ColorConsole.RED + "\n\tCollege not found by " + collegeName);
                                }
                                
                                break;

                            case 2:
                                System.out.print("\tEnter Location:");
                                String collegeLocation = sc.nextLine();
                                CFI.searchCollegeByLocation(collegeLocation);
                                break;

                            case 3:
                                CFI.displayAllEngineeringColleges();
                                System.out.print("\n\tDo you want to see the list of different types of Engineering colleges ? (true/false) : ");
                                boolean conditionForEngg = sc.nextBoolean();
                                sc.nextLine();

                                if(conditionForEngg){
                                    int choiceForTypes;
                                    do{
                                        System.out.println("\n\tTypes of colleges");
                                        System.out.println("\t1. IITs");
                                        System.out.println("\t2. NITs");
                                        System.out.println("\t3. BITs");
                                        System.out.println("\t4. IISERs");
                                        System.out.println("\t5. Other Engineering Colleges");
                                        System.out.println("\t6. Exit");
                                        System.out.print("\n\tEnter your choice: ");
                                        choiceForTypes = Integer.parseInt(sc.nextLine());

                                        switch(choiceForTypes){
                                            case 1:
                                                particular.displayIITs();
                                                break;
                                            
                                            case 2:
                                                particular.displayNITs();
                                                break;

                                            case 3:
                                                particular.displayBITs();
                                                break;

                                            case 4:
                                                particular.displayIISERs();
                                                break;

                                            case 5:
                                                particular.displayAllOtherEngineeringColleges();
                                                break;

                                            case 6:
                                                System.out.println("Exiting..");
                                                break;

                                            default:
                                                System.out.println("\tInvalid chooice. Please try again");
                                        }
                                    }while(choiceForTypes != 6);
                                }
                            break;

                            case 4:
                                CFI.displayAllMedicalColleges();
                                System.out.print("\n\tDo you want to see the list of different types of Medical colleges ? (true/false) : ");
                                boolean conditionForMed = sc.nextBoolean();
                                sc.nextLine();

                                if(conditionForMed){
                                    int choiceForMed;

                                    do { 
                                        System.out.println("\n\t1. AIIMS");
                                        System.out.println("\t2. Other Medical Colleges.");
                                        System.out.println("\t3. Exit");
                                        System.out.print("\n\tEnter your choice: ");
                                        choiceForMed = Integer.parseInt(sc.nextLine());

                                        switch (choiceForMed) {
                                            case 1:
                                                particular.displayAIIMS();
                                                break;

                                            case 2:
                                                particular.displayAllOtherMedicalColleges();
                                                break;

                                            case 3:
                                                System.out.println("Exiting...");

                                            default:
                                                System.out.println("\tInvalid choice. Please try again.");
                                                break;
                                        }
                                    } while (choiceForMed != 3);
                                }

                                break;

                            case 5:
                                CFI.displayAllPharmacyColleges();
                                break;

                            case 6:
                                int code=0;
                                College college=null;
                                System.out.print("\tSelect Your Stream:");
                                String stream=sc.nextLine();

                                if(stream.equalsIgnoreCase("Engineering")){

                    
                                    do{
                                        
                                        if(s2.get_Engg_Form_Status().equalsIgnoreCase("Not Filled")){
                                            s2.fillApplicationFormForEngineering(sc);
                                        }
                                        System.out.print("\tEnter the Engineering College Code Which you want to Apply : ");
                                        code = Integer.parseInt(sc.nextLine());
                                        //sc.nextLine();
                                        college = CFI.getEngineeringColleges(code);

                                        if (college == null) {
                                            System.out.println(ANSI_RED +
                                                    "\tInvalid College Code." +
                                                    ANSI_RESET);
                                            break;
                                        }

                                        if(s2.eligibleForCollegeEng((Engineering)college)){
                                            s2.applytoCollege(sc, college);
                                        }

                                        System.out.print("\n\tDo you want to apply another college (Y/N) : ");
                                        choiceForAplly = sc.nextLine();
                                      

                                    }while(!choiceForAplly.equalsIgnoreCase("n"));
                                    
                                    
                                }else if(stream.equalsIgnoreCase("Medical")){

                                    do{
                                        if(s2.get_Med_Form_Status().equalsIgnoreCase("Not Filled")){
                                            s2.fillApplicationFormForMedical(sc);
                                        }
                                        System.out.print("\tEnter the Medical College Code Which you want to Apply : ");
                                        code = Integer.parseInt(sc.nextLine());
                                        sc.nextLine();
                                        college = CFI.getMedicalColleges(code);

                                        if (college == null) {
                                            System.out.println(ANSI_RED +
                                                    "\tInvalid College Code." +
                                                    ANSI_RESET);
                                            break;
                                        }

                                        if(s2.eligibleForCollegeMed((Medical)college)){
                                            s2.applytoCollege(sc, college);
                                        }

                                        System.out.print("\n\tDo you want to apply another college (Y/N) : ");
                                        choiceForAplly = sc.nextLine();

                                    }while(!choiceForAplly.equalsIgnoreCase("n"));

                                }else if(stream.equalsIgnoreCase("Pharmacy")){

                                    do{
                                        if(s2.get_Pharma_Form_Status().equalsIgnoreCase("Not Filled")){
                                            s2.fillApplicationFormForPharmacy(sc);
                                        }
                                        System.out.print("\tEnter the Pharmacy College Code Which you want to Apply : ");
                                        code = Integer.parseInt(sc.nextLine());
                                        college = CFI.getPharmacyColleges(code);

                                        if (college == null) {
                                            System.out.println(ANSI_RED +
                                                    "\tInvalid College Code." +
                                                    ANSI_RESET);
                                            break;
                                        }

                                        if(s2.eligibleForCollegePhar((Pharmacy)college)){
                                            s2.applytoCollege(sc, college);
                                        }

                                        System.out.print("\n\tDo you want to apply another college (Y/N) : ");
                                        choiceForAplly = sc.nextLine();

                                    }while(!choiceForAplly.equalsIgnoreCase("n"));   

                                }else{
                                    System.out.println(ANSI_RED + "\tInvalid Stream" + ANSI_RESET);
                                }

                                break;


                            case 7:
                                System.out.println(ANSI_GREEN + "\tList Of Colleges Applied: " + ANSI_RESET);
                                s2.displayListOfAppliedColleges();
                                break;

                            case 8:
                                if (!resultDeclared) {
                                    System.out.println(ANSI_RED +
                                            "\n\tResult Not Declared Yet." +
                                            ANSI_RESET);
                                } else {
                                    System.out.println(ANSI_GREEN +
                                            "\n\tCAP ROUND RESULT\n" +
                                            ANSI_RESET);

                                    if (s2.get_Engg_Form_Status().equalsIgnoreCase("filled")) {
                                        System.out.println(ANSI_CYAN +"\tEngineering Result: " + ANSI_RESET);
                                        s2.collegeAllocatedForEngg();
                                    }
                                    if (s2.get_Med_Form_Status().equalsIgnoreCase("filled")) {
                                        System.out.println(ANSI_CYAN + "\n\tMedical Result: " + ANSI_RESET);
                                        s2.collegeAllocatedForMedical();
                                    }
                                    if (s2.get_Pharma_Form_Status().equalsIgnoreCase("filled")) {
                                        System.out.println(ANSI_CYAN + "\n\tPharmacy Result: " + ANSI_RESET);
                                        s2.collegeAllocatedForPharmacy();
                                    }
                                }
                                break;

                            case 9:
                                break;

                            default:
                                System.out.println("\tInvalid Choice . try again!");
                                break;
                        }
                    } while (ch2 != 8);

                    break;

                case 3:
                    boolean a2 = user.LogInForAdmin();
                    if(a2 == true){
                        System.out.println(ANSI_GREEN+"\n\t\t*** Admin Successfully Log-In ***");
                        System.out.println(ANSI_RESET);
                    }else{
                        System.out.println(ANSI_RED + "\n\t\t**** Invalid Admin Credential ****");
                        System.out.println(ANSI_RESET);
                        a2 = user.LogInForAdmin();
                    }
                    int choiceForAdmin;
                
                    do {
                        System.out.println(ColorConsole.YELLOW +
                                "\n----------------------------------------------------");
                        System.out.println("\t\tADMIN PANEL");
                        System.out.println("----------------------------------------------------" +
                                ColorConsole.RESET);

                        System.out.println(ColorConsole.RED + "\t1. Add Engineering College");
                        System.out.println("\t2. Add Medical College");
                        System.out.println("\t3. Add Pharmacy College");
                        System.out.println("\t4. Remove Engineering College");
                        System.out.println("\t5. Remove Medical College");
                        System.out.println("\t6. Remove Pharmacy College");
                        System.out.println("\t7. Display list of newly Added colleges");
                        System.out.println("\t8. Display list of removed colleges");
                        System.out.println("\t9. Declare Result");
                        System.out.println("\t7. Go Back" + ColorConsole.RESET);

                        System.out.print(ColorConsole.YELLOW +
                                "\n\tEnter your choice: " +
                                ColorConsole.RESET);

                        choiceForAdmin = sc.nextInt();
                        sc.nextLine();

                        switch (choiceForAdmin) {

                            case 1:
                                CFI.addEngineeringColleges();
                                break;
                            case 2:
                                CFI.addMedicalColleges();
                                break;
                            case 3:
                                CFI.addPharmacyColleges();
                                break;
                            case 4:
                                System.out.print("\tEnter Code: ");
                                int collegeCode1 = sc.nextInt();
                                CFI.removeEngineeringColleges(collegeCode1);
                                break;
                            case 5:
                                System.out.print("\tEnter Code: ");
                                int collegeCode2 = sc.nextInt();
                                CFI.removeMedicalColleges(collegeCode2);
                                break;
                            case 6:
                                System.out.print("\tEnter Code: ");
                                int collegeCode3 = sc.nextInt();
                                CFI.removePharmacyColleges(collegeCode3);
                                break;

                            case 7:
                                CFI.displayListOfAddedColleges();
                                break;

                            case 8:
                                CFI.displayListOfRemovedColleges();
                                break;

                            case 9:
                                //Declare result of every student who has apllied to colleges
                                resultDeclared = true;
                                System.out.println(ColorConsole.GREEN +
                                        "\n\tResult Declared Successfully." +
                                        ColorConsole.RESET);
                                break;
                                
                            case 10:
                                break;
                            default:
                                System.out.println(ColorConsole.RED +
                                        "\tInvalid Choice!" +
                                        ColorConsole.RESET);
                                break;
                        
                        

                        }
                    } while (choiceForAdmin != 9);

                    break;

                case 4:
                    System.out.println(ANSI_RED +
                            "\n\tLogout Successful." +
                            ANSI_RESET);
                    System.exit(0);

                default:
                    System.out.println(ANSI_RED +
                            "\tInvalid Choice. Please Try Again." +
                            ANSI_RESET);
                    break;
            }

        } while (choice != 4);
        System.out.println(ANSI_RESET);

        sc.close();
    }

}