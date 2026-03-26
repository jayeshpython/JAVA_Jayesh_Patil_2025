package Services;
import Bean.*;
import java.util.ArrayList;

public interface ParticularTypeOfCollege {
    
    //Getters for particular type of colleges
    public void getAllIITs();
    public void getAllNITs();
    public void getAllIISERs();
    public void getAllBITs();
    public void getAllAIIMS();
    public void getAllOtherEngineeringColleges();
    public void getAllOtherMedicalColleges();

    //Display all particular type of colleges
    public void displayIITs();
    public void displayNITs();
    public void displayIISERs();
    public void displayBITs();
    public void displayAIIMS();
    public void displayAllOtherEngineeringColleges();
    public void displayAllOtherMedicalColleges();
    public void displayPharmacyColleges();

    //Adding colleges
    public void addIITCollleges(Engineering e);
    public void addNITColleges(Engineering e);
    public void addBITCollleges(Engineering e);
    public void addIISERCollleges(Engineering e);
    public void addOtherEngineeringColleges(Engineering e);
    public void addAIIMSCollleges(Medical m);
    public void addOtherMedicalColleges(Medical m);

    //Remove colleges
    public void removeIITColleges(Engineering e);
    public void removeNITColleges(Engineering e);
    public void removeBITColleges(Engineering e);
    public void removeIISERColleges(Engineering e);
    public void removeOtherEngineeringColleges(Engineering e);
    public void removeAIIMSColleges(Medical m);
    public void removeOtherMedicalColleges(Medical m);
    
    //Colleges code
    public ArrayList<Integer> getIITCode();
    public ArrayList<Integer> getNITCode();
    public ArrayList<Integer> getBITCode();
    public ArrayList<Integer> getIISERCode();
    public ArrayList<Integer> getOtherEngineeringCollegesCode();
    public ArrayList<Integer> getAIIMSCode();
    public ArrayList<Integer> getOtherMedicalCollegesCode();
    public ArrayList<Integer> getPharmacyCode();
}

