
package com.job.app;
import com.job.bean.*;
import com.job.service.*;
import java.util.*;

public class JobPortalSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        LoginAndRegisterSystem user = new LoginAndRegisterSystem();
        CandidateMain candMain = new CandidateMain();
        RecruiterMain recMain = new RecruiterMain();
        AdminType adminType = new AdminType();
        Candidate cand;
        MatchingEngine engine = new MatchingEngine();

        PortalFunctionalityImplementatiion portal = new PortalFunctionalityImplementatiion();

        int choice;

        do { 
            System.out.println("\n\t  ----------========== Job Portal Application ==========--------- \t\n");
            System.out.println("\t\t1. REGISTER FOR CANDIDATE\t");
            System.out.println("\t\t2. LOG-IN FOR CANDIDATE\t");
            System.out.println("\t\t3. REGISTER FOR RECRUITER");
            System.out.println("\t\t4. LOG-IN FOR RECRUITER");
            System.out.println("\t\t5. LOG-IN FOR ADMIN\t");
            System.out.println("\t\t6. LOG-OUT FOR CANDIDATE / RECRUITER / ADMIN\t");

            System.out.print("\n\t\tEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            Candidate c1;
            Recruiter rec;

            switch (choice) {
                case 1:
                    c1 = user.RegisterForCandidate();
                    if(c1 == null){
                        System.out.println("**** Registration Unsuccessful ****\" ");
                    }else{
                        System.out.println("**** Registration Successful ****\" ");
                        
                    }
                    break;

                case 2:
                    cand = user.CandidateLogin();
                    if(cand != null){
                        System.out.println("**** Candidate Login Successful ****");

                        int ch;
                        do { 
                            System.out.println(
                                "\n----------------------------------------------------");
                        System.out.println("\t\tCANDIDATE DASHBOARD");
                        System.out.println("----------------------------------------------------" );

                        System.out.println("\n\t\t1. Search All Available Jobs");
                        System.out.println("\t\t2. Search Jobs According To Role");
                        System.out.println("\t\t3. Search Jobs According To Job Type(FRESHER, EXPERIENCED, INTERN, REMOTE");                                                        
                        System.out.println("\t\t4. Search Job According To Loation");
                        System.out.println("\t\t5. Search Job By ID");
                        System.out.println("\t\t6. Apply For Job");
                        System.out.println("\t\t7. Display List Of Applied Jobs");
                        System.out.println("\t\t8. Display The Match Score Of Applied Jobs");
                        System.out.println("\t\t9. Display List Of ShortList Comapies");
                        System.out.println("\t\t10. Go Back");

                        System.out.print("\n\t\tEnter your choice: ");
                        ch = sc.nextInt();
                        sc.nextLine();

                        switch (ch) {
                            case 1:
                                portal.displayAllAvailableJobs();
                                break;

                            case 2:
                                System.out.println("\n\t\tEnter the Job Role: ");
                                String role = sc.nextLine();

                                portal.searchJobAccordingToRole(role);
                                break;

                            case 3:
                                System.out.println("\n\t\tEnter The Job type: ");
                                String type = sc.nextLine();

                                JobType ty = JobType.valueOf(type.toUpperCase());

                                portal.searchJobAccordingToType(ty);
                                break;

                            case 4:
                                System.out.println("\n\t\tEnter location: ");
                                String location = sc.nextLine();

                                portal.searchJobsAccordingToLocation(location);
                                break;

                            case 5:
                                System.out.println("\n\t\tEnter Job ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();

                                portal.searchJobById(id);
                                break;

                            case 6:
                                int code;
                                Job j;
                                String chApply;

                                do { 
                                    if(cand.getFormFilledStatus().equalsIgnoreCase("Not Filled")){
                                        cand.fillApplicationForm(sc);
                                    }

                                    System.out.println("\n\t\tEnter the Job code which you want to apply: ");
                                    code = sc.nextInt();
                                    sc.nextLine();

                                    j = portal.getJobById(code);

                                    if(j != null){
                                        engine.applyToJob(cand, j);
                                    }else{
                                        System.out.println("\n\tInvalid Job ID");
                                    }

                                    System.out.print("\n\t\tDo you want to apply another for another Job (Y/N) : ");
                                    chApply = sc.nextLine();
                                    
                                } while(!chApply.equalsIgnoreCase("n"));
                                break;

                            case 7:
                                engine.displayAppliedJobs();
                                break;

                            case 8:
                                engine.candidateScoreMatch(cand);
                                break;

                            case 9:
                                engine.companiesInWhichYouGotSelected(cand);
                        }

                        } while (ch != 10);
                    }
                    else{
                        System.out.println("**** Candidate Registration Failed ****");
                    }
                    break;

                case 3:
                    rec = user.RegisterFoRecruiter();
                    if(rec == null){
                        System.out.println("\n\t\t**** Recruiter Registration Unsuccessful **** ");
                    }else{
                        System.out.println("\n\t\t**** Recruiter Registration Successful **** ");
                        System.out.println("\n\t\tPlease Login Now...");
                        rec = user.RecruiterLogin();
                    }
                    break;

                case 4:
                    rec = user.RecruiterLogin();
                    if(rec != null){
                        System.out.println("\n\t\t**** Recruiter Login Successful ****");

                        do { 
                            
                        } while (false);
                    }
                    else{
                        System.out.println("\n\t\t**** Recruiter Registration Failed ****");
                    }
                    break;

                    case 5:
                        boolean a2 = user.AdminLogin();
                    if(a2 == true){
                        System.out.println("\n\t\t*** Admin Successfully Log-In ***");
                        
                    }else{
                        System.out.println("\n\t\t**** Invalid Admin Credential ****");
                        a2 = user.AdminLogin();
                    }
                    int choiceForAdmin;
                
                   break;

                case 6:
                    break;

                default:
                    throw new AssertionError();
            }
        } while (choice != 6);

    }
}