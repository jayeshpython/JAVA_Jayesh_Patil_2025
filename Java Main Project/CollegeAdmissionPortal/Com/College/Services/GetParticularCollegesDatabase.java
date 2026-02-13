package Services;

import Bean.*;
import java.util.ArrayList;
import java.util.List;

public class GetParticularCollegesDatabase implements ParticularTypeOfCollege{
    private CollegesDataBase db;   
    
    private List<Engineering> IITCollegesList = new ArrayList<>();
    private List<Engineering> NITCollegesList = new ArrayList<>();
    private List<Engineering> IISERCollegesList = new ArrayList<>();
    private List<Engineering> BITsCollegesList = new ArrayList<>();
    private List<Engineering> otherEngineeringCollegesList = new ArrayList<>();

    private List<Medical> AIIMSCollegesList = new ArrayList<>();
    private List<Medical> otherMedicalCollegesList = new ArrayList<>();
    
    public GetParticularCollegesDatabase() {
       db = new CollegesDataBase();
    }

    public void getAllIITs(){   
        for(Engineering e : db.getAllEngineeringColleges().values()){
            if(e.getType() == CollegeType.IIT){
                IITCollegesList.add(e);
            }
        }
    }

    public void getAllNITs(){
        for(Engineering e : db.getAllEngineeringColleges().values()){
            if(e.getType() == CollegeType.NIT){
                NITCollegesList.add(e);
            }
        }
    }

    public void getAllIISERs(){
        for(Engineering e: db.getAllEngineeringColleges().values()){
            if(e.getType() == CollegeType.IISER){
                IISERCollegesList.add(e);
            }
        }
    }

    public void getAllBITs(){
        for(Engineering e: db.getAllEngineeringColleges().values()){
            if(e.getType() == CollegeType.BITS){
                BITsCollegesList.add(e);
            }
        }
    }

    public void getAllOtherEngineeringColleges(){
        for(Engineering e: db.getAllEngineeringColleges().values()){
            if(e.getType() == CollegeType.OtherEngineering){
                otherEngineeringCollegesList.add(e);
            }
        }
    }

    public void getAllAIIMS(){
        for(Medical m: db.getAllMedicalColleges().values()){
            if(m.getType() == CollegeType.AIIMS){
                AIIMSCollegesList.add(m);
            }
        }
    }

    public void getAllOtherMedicalColleges(){
        for(Medical m: db.getAllMedicalColleges().values()){
            if(m.getType() == CollegeType.OtherMedical){
                otherMedicalCollegesList.add(m);
            }
        }
    }

    //Displaying particular type of colleges
    public void displayIITs(){

        System.out.println("\n ********* IIT Colleges *********");
        for(Engineering e: IITCollegesList){
            System.out.println(e.toString());
        }
    }

    public void displayNITs(){

        System.out.println("\n********* NIT Colleges *********");
        for(Engineering e : NITCollegesList){
            System.out.println(e.toString());
        }
    }

    public void displayIISERs(){

        System.out.println("\n********* IISER Colleges *********");
        for(Engineering e : IISERCollegesList){
            System.out.println(e.toString());
        }
    }

    public void displayBITs(){

        System.out.println("\n********* BIT Colleges *********");
        for(Engineering e : BITsCollegesList){
            System.out.println(e.toString());
        }
    }

    public void displayAIIMS(){

        System.out.println("\n********* AIIMS Colleges *********");
        for(Medical m : AIIMSCollegesList){
            System.out.println(m.toString());
        }
    }

    public void displayAllOtherEngineeringColleges(){

        System.out.println("\n********* Other Engineering Colleges *********");
        for(Engineering e : otherEngineeringCollegesList){
            System.out.println(e.toString());
        }
    }

    public void displayAllOtherMedicalColleges(){

        System.out.println("\n********* Other Medical Colleges *********");
        for(Medical m : otherMedicalCollegesList){
            System.out.println(m.toString());
        }
    }

    public void displayPharmacyColleges(){
        
        System.out.println("\n******** Pharmacy Colleges ******");
        db.getAllPharmacyColleges().values().forEach(System.out::println);
    }

    // -------- Adding Colleges --------
    public void addIITCollleges(Engineering e){
        IITCollegesList.add(e);
    }

    public void addNITColleges(Engineering e){
        NITCollegesList.add(e);
    }

    public void addIISERCollleges(Engineering e){
        IISERCollegesList.add(e);
    }

    public void addBITCollleges(Engineering e){
        BITsCollegesList.add(e);
    }

    public void addAIIMSCollleges(Medical m){
        AIIMSCollegesList.add(m);
    }

    public void addOtherEngineeringColleges(Engineering e){
        otherEngineeringCollegesList.add(e);
    }

    public void addOtherMedicalColleges(Medical m){
        otherMedicalCollegesList.add(m);
    }

    // --------- Removing Colleges ----------
    public void removeIITColleges(Engineering e){
        IITCollegesList.remove(e);
    }

    public void removeNITColleges(Engineering e){
        NITCollegesList.remove(e);
    }

    public void removeBITColleges(Engineering e){
        BITsCollegesList.remove(e);
    }

    public void removeIISERColleges(Engineering e){
        IISERCollegesList.remove(e);
    }

    public void removeOtherEngineeringColleges(Engineering e){
        otherEngineeringCollegesList.remove(e);
    }

    public void removeAIIMSColleges(Medical m){
        AIIMSCollegesList.remove(m);
    }

    public void removeOtherMedicalColleges(Medical m){
        otherMedicalCollegesList.remove(m);
    }
}

