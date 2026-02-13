package Services;
import Bean.*;
//import java.util.*;


public interface  CollegeFunctionality {

    // ------- Add Colleges -------
    public void addEngineeringColleges();
    public void addMedicalColleges();
    public void addPharmacyColleges();

    // ------- Remove Colleges ------
    public Engineering removeEngineeringColleges(int code);
    public Medical removeMedicalColleges(int code);
    public Pharmacy removePharmacyColleges(int code);

    // -------- ENGINEERING --------
    public Engineering getEngineeringColleges(int engineeringCode);
    // -------- MEDICAL --------
    public Medical getMedicalColleges(int medicalCode);
    // -------- PHARMACY --------
    public Pharmacy getPharmacyColleges(int pharmacyCode);

    // ------- Displaying all Colleges -------
    public void displayAllEngineeringColleges();
    public void displayAllMedicalColleges();
    public void displayAllPharmacyColleges();

    // ------- Search College ------
    public void searchCollegeByLocation(String location);
    public College searchCollegeByName(String collegeName);
}


