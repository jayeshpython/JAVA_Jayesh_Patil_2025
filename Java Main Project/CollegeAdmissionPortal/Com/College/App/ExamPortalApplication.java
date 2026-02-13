package App;

import Bean.College;
import Bean.Student;
import Bean.StudentMain;
import Services.CollegeFuctionalityImplementation;
import Services.SignInAndlogInSystem;
import java.util.*;



public class ExamPortalApplication{
    public static final String ANSI_YELLOW = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        
        System.out.println(ANSI_YELLOW);
        Scanner sc = new Scanner(System.in);
        SignInAndlogInSystem user = new SignInAndlogInSystem();
        StudentMain student = new StudentMain();
        CollegeFuctionalityImplementation CFI = new CollegeFuctionalityImplementation();
        int choice;

        do {
            System.out.println("\n\t  ----------========== Exam Portal Application ==========--------- \t\n");
            System.out.println("\t1.SIGN-IN FOR STUDENT\t");
            System.out.println("\t2.LOG-IN FOR STUDENT\t");
            System.out.println("\t3.LOG-IN FOR ADMIN\t");
            System.out.println("\t4.LOG-OUT FOR STUDENT/ADMIN\t");

            System.out.println("\n\tEnter the your choice : \n\t");
            choice = sc.nextInt();

            Student s2;

            switch (choice) {

                case 1:
                    Student s1 = user.SignInForStudent();
                    if (s1 == null) {
                        System.out.println("Sign In Unsuccessfull");
                    }
                    break;

                case 2:
                    int ch2;
                    s2 = user.LogInForStudent();
                    if (s2 == null) {
                        System.out.println("Invalid username or password");
                        break;
                    }

                    do {
                        System.out.println("\n1.Search College By Name.");
                        System.out.println("2.Search College By Location.");
                        System.out.println("3.Display all Engineering Colleges.");
                        System.out.println("4.Display all Medical Colleges.");
                        System.out.println("5.Display all Pharmacy Colleges.");
                        System.out.println("6.Apply To College.");
                        System.out.println("7.display All Applied Colleges.");
                        System.out.println("8.Go Back .");

                        System.out.print("Enter your choice: ");
                        ch2 = sc.nextInt();
                        sc.nextLine();
                        // int ch2 = Integer.parseInt(sc.nextLine());

                        switch (ch2) {
                            case 1:
                                System.out.println("Enter College Name:");
                                String collegeName = sc.nextLine();
                                College c = CFI.searchCollegeByName(collegeName);
                                break;

                            case 2:
                                System.out.println("Enter Location:");
                                String collegeLocation = sc.nextLine();
                                CFI.searchCollegeByLocation(collegeLocation);
                                break;

                            case 3:
                                CFI.displayAllEngineeringColleges();
                                break;

                            case 4:
                                CFI.displayAllMedicalColleges();
                                break;

                            case 5:
                                CFI.displayAllPharmacyColleges();
                                break;

                            case 6:
                                int code=0;
                                College college=null;
                                System.out.println("Select Your Stream:");
                                String stream=sc.nextLine();

                                if(stream.equalsIgnoreCase("Engineering")){
                                    System.out.println("Enter the Engineering College Code Which you want to Apply : ");
                                    code = sc.nextInt();
                                    college = CFI.getEngineeringColleges(code);

                                }else if(stream.equalsIgnoreCase("Medical")){
                                    System.out.println("Enter the Medical College Code Which you want to Apply : ");
                                    code = sc.nextInt();
                                    college = CFI.getMedicalColleges(code);

                                }else if(stream.equalsIgnoreCase("Pharmacy")){
                                    System.out.println("Enter the Pharmacy College Code Which you want to Apply : ");
                                    code = sc.nextInt();
                                    college = CFI.getPharmacyColleges(code);

                                }else{
                                    System.out.println("Invalid Stream");
                                }

                                switch (college.getType()) {
                                    case IIT:
                                        System.out.println("Enter Your JEE Advanced Percentile: ");
                                        double per1=sc.nextDouble();
                                        sc.nextLine();
                                        s2.set_JEE_ADVANCE_Percetile(per1);
                                        break;

                                    case NIT:
                                        System.out.println("Enter Your JEE MAINS Percentile:");
                                        double per2=sc.nextDouble();
                                        sc.nextLine();
                                        s2.set_JEE_MAINS_Percentile(per2);
                                        break;

                                    case OtherEngineering:
                                        System.out.println("Enter Your CET Percentile:");
                                        double per3=sc.nextDouble();
                                        sc.nextLine();
                                        s2.set_CET_Percentile(per3);
                                        break;

                                    case AIIMS:
                                        System.out.println("ENter Your NEET Score:");
                                        double per4=sc.nextDouble();
                                        sc.nextLine();
                                        s2.set_NEET_Percentile(per4);
                                        break;
                                        
                                    case OtherMedical:
                                        System.out.println("Enter Your NEET Score:");
                                        double per5=sc.nextDouble();
                                        sc.nextLine();
                                        s2.set_NEET_Percentile(per5);
                                        break;
                                        
                                    case OtherPharmacy:
                                        System.out.println("Enter Your CET Score:");
                                        double per6=sc.nextDouble();
                                        sc.nextLine();
                                        s2.set_CET_Percentile(per6);
                                        break;   

                                    default:
                                        break;
                                }
                                
                                student.applytoCollege(sc,s2,college);
                                break;

                            case 7:
                                System.out.println("List Of Colleges Applied: ");
                                s2.displayListOfAppliedColleges();
                                break;

                            case 8:
                                break;

                            default:
                                System.out.println("Invalid Choice . try again!");
                                break;
                        }
                    } while (ch2 != 8);

                    break;

                case 3:
                    int ch3;
                    if (user.LogInForStudent() == null) {
                        break;
                    }
                    do {

                        System.out.println("\n1.Add Engineering College");
                        System.out.println("2.Add Medical College");
                        System.out.println("3.Add Pharmacy College");
                        System.out.println("4.Remove Engineering College");
                        System.out.println("5.Remove Medical College");
                        System.out.println("6.Remove Pharmacy College");
                        System.out.println("7.Go Back");

                        System.out.println("Enter your choice");
                        ch3 = sc.nextInt();
                        sc.nextLine();

                        switch (ch3) {
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
                                System.out.println("Enter Code Of Engineering College You Want To Remove: ");
                                int collegeCode1 = sc.nextInt();
                                CFI.removeEngineeringColleges(collegeCode1);
                                break;

                            case 5:
                                System.out.println("Enter Code Of Medical College You Want To Remove: ");
                                int collegeCode2 = sc.nextInt();
                                CFI.removeMedicalColleges(collegeCode2);
                                break;

                            case 6:
                                System.out.println("Enter Code Of Pharmacy College You Want To Remove: ");
                                int collegeCode3 = sc.nextInt();
                                CFI.removePharmacyColleges(collegeCode3);
                                break;

                            case 7:
                                break;

                            default:
                                System.out.println("Invalid Choice ! try again");
                                break;
                        }
                    } while (ch3 != 7);

                    break;

                case 4:
                    System.out.println("LogOut");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice , Please Try Again...!");
                    break;
            }

        } while (choice != 4);
        sc.close();
        System.out.println(ANSI_RESET);
    }

}

