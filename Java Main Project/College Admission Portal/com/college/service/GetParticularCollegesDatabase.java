
package com.college.service;
import com.college.bean.*;
import java.util.ArrayList;
import java.util.List;

public class GetParticularCollegesDatabase implements CollegeFunctionality{
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

    public void getAllITTs(){   
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

    public void addIITColleges(CollegeType type){

    }

    public void addNITColleges(CollegeType type){

    }

    public void addIISERColleges(CollegeType type){

    }

    public void addBITColleges(CollegeType type){

    }

    public void addOtherEngineeringColleges(CollegeType type){

    }

    public void addAIIMSColleges(CollegeType type){

    }

    public void addOtherMedicalColleges(CollegeType type){

    }

    public void addPharmacyColleges(Pharmacy pharmacy){
        
    }
}
