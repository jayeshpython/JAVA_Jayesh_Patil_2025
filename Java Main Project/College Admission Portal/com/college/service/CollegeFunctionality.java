
package com.college.service;
import com.college.bean.*;
import java.util.HashMap;

public interface  CollegeFunctionality {

    //void addEngineeringColleges(Engineering engineering);
    //void addMedicalColleges(Medical medical);
    void addPharmacyColleges(Pharmacy pharmacy);

    // -------- ENGINEERING --------
    Engineering getEngineeringColleges(int engineeringCode);
    HashMap<Integer, Engineering> getAllEngineeringColleges();

    // -------- MEDICAL --------
    Medical getMedicalColleges(int medicalCode);
    HashMap<Integer, Medical> getAllMedicalColleges();

    // -------- PHARMACY --------
    Pharmacy getPharmacyColleges(int pharmacyCode);
    HashMap<Integer, Pharmacy> getAllPharmacyColleges();

    void getAllIITs();
    void getAllNITs();
    void getAllIISERs();
    void getAllBITs();
    void getAllAIIMS();
    void getAllOtherEngineeringColleges();
    void getAllOtherMedicalColleges();

}
