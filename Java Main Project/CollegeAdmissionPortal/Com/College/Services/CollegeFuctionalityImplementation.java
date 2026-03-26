package Services;
import Bean.*;
import dto.*;
import java.util.*;

public class CollegeFuctionalityImplementation implements CollegeFunctionality {

    public static class ColorConsole {
        public static final String RESET = "\u001B[0m";
        public static final String RED = "\u001B[31m";
        public static final String YELLOW = "\u001B[33m";
        public static final String GREEN = "\u001B[32m";
    }

    private CollegesDataBase db;
    private GetParticularCollegesDatabase getParticular;
    private CollegeRequest collegeRequest = new CollegeRequest();
    Scanner sc = new Scanner(System.in);

    //HashMap for removed colleges
    HashMap<Integer, College> removedColleges = new HashMap<>();

    //HashMap for new added colleged
    HashMap<Integer, College> newAddedColleges = new HashMap<>();

    //Constructor
    public CollegeFuctionalityImplementation() {
        db = new CollegesDataBase();
        getParticular = new GetParticularCollegesDatabase();
    }

    //Get a single college from database
    public Engineering getEngineeringColleges(int engineeringCode) {
        return db.getAllEngineeringColleges().get(engineeringCode);
    }

    public Medical getMedicalColleges(int medicalCode) {
        return db.getAllMedicalColleges().get(medicalCode);
    }

    public Pharmacy getPharmacyColleges(int pharmacyCode) {
        return db.getAllPharmacyColleges().get(pharmacyCode);
    }

    //Display complete database
    public void displayAllEngineeringColleges() {

        if (db.getAllEngineeringColleges().isEmpty()) {
            System.out.println(ColorConsole.RED + "No Engineering Colleges Found!" 
                    + ColorConsole.RESET);
            return;
        }

        System.out.println(ColorConsole.RED 
                + "\n===== Engineering Colleges Database =====");

        for (var entry : db.getAllEngineeringColleges().entrySet()) {

            System.out.println(ColorConsole.YELLOW + "\nCode: " + entry.getKey()
                    + " | College Name : " + entry.getValue().getCollegeName()
                    + " | Location : " + entry.getValue().getCollegeLocation());
        }

        System.out.println(ColorConsole.RESET);
    }

    //Display all Medical Colleges
    public void displayAllMedicalColleges() {

        if (db.getAllMedicalColleges().isEmpty()) {
            System.out.println(ColorConsole.RED 
                    + "No Medical Colleges Found!" 
                    + ColorConsole.RESET);
            return;
        }

        System.out.println(ColorConsole.RED
                + "\n===== Medical Colleges Database =====");

        for (var entry : db.getAllMedicalColleges().entrySet()) {
    
            System.out.println(ColorConsole.YELLOW + "\nCode: " + entry.getKey()
                    + " | College Name: " + entry.getValue().getCollegeName()
                    + " | Location: " + entry.getValue().getCollegeLocation());
        }

        System.out.println(ColorConsole.RESET);
    }

    //Display all Pharmacy Colleges
    public void displayAllPharmacyColleges() {

        if (db.getAllPharmacyColleges().isEmpty()) {
            System.out.println(ColorConsole.RED
                    + "No Pharmacy Colleges Found!"
                    + ColorConsole.RESET);
            return;
        }

        System.out.println(ColorConsole.RED
                + "\n===== Pharmacy Colleges Database =====");

        for (var entry : db.getAllPharmacyColleges().entrySet()) {

            System.out.println(ColorConsole.YELLOW + "\nCode: " + entry.getKey()
                    + " | College Name: " + entry.getValue().getCollegeName()
                    + " | Location: " + entry.getValue().getCollegeLocation());
        }

        System.out.println(ColorConsole.RESET);
    }

    // -------- Add Colleges --------
    public void addEngineeringColleges() {
        College c = collegeRequest.AcceptCollegeDetails(); //BASE CLASS -> CHILD CLASS REFERENCES
        if (c == null) {
            System.out.print("Invalid Information..!");
            return;
        }
        Engineering e = (Engineering) c;
        db.addEngineeringColleges(collegeRequest.getCollegeCode(), e);

        newAddedColleges.put(collegeRequest.getCollegeCode(), c);

        if (e.getType() == CollegeType.IIT) {
            getParticular.addIITCollleges(e);
        } else if (e.getType() == CollegeType.NIT) {
            getParticular.addNITColleges(e);
        } else if (e.getType() == CollegeType.IISER) {
            getParticular.addIISERCollleges(e);
        } else if (e.getType() == CollegeType.BITS) {
            getParticular.addBITCollleges(e);
        } else {
            getParticular.addOtherEngineeringColleges(e);
        }

        //return map;
    }

    //Add Medical Colleges
    public void addMedicalColleges() {

       College c = collegeRequest.AcceptCollegeDetails(); //BASE CLASS -> CHILD CLASS REFERENCES
        if (c == null) {
            System.out.print("Invalid Information");
            return;
        }
        Medical m = (Medical) c;
        db.addMedicalColleges(collegeRequest.getCollegeCode(), m);

        newAddedColleges.put(collegeRequest.getCollegeCode(), c);

        if (m.getType() == CollegeType.AIIMS) {
            getParticular.addAIIMSCollleges(m);
        } else {
            getParticular.addOtherMedicalColleges(m);
        }
    }

    //Add Pharmacy Colleges
    public void addPharmacyColleges() {

         College c = collegeRequest.AcceptCollegeDetails();  //BASE CLASS -> CHILD CLASS REFERENCES
        if (c == null) {
            System.out.println("Invalid Information");
            return;
        }
        Pharmacy ph = (Pharmacy) c;
        db.addPharmacyColleges(collegeRequest.getCollegeCode(), ph);

        newAddedColleges.put(collegeRequest.getCollegeCode(), c);
    }

    //Display list of new added colleges
    public void displayListOfAddedColleges(){
        if(newAddedColleges.isEmpty()){
            System.out.println("No new College added to databse");
            return;
        }

        for(Map.Entry<Integer, College> entry : newAddedColleges.entrySet()){
            System.out.println(ColorConsole.YELLOW + "\nCode: " + entry.getKey()
                + " | College Name: " + entry.getValue().getCollegeName()
                + " | Location: " + entry.getValue().getCollegeLocation());
        }
        System.out.println(ColorConsole.RESET);
    }

    // ------- Remove Colleges --------
    public Engineering removeEngineeringColleges(int code) {

        Engineering e = db.removeEngineeringColleges(code);
        removedColleges.put(code, e);

        if (e == null) {
            System.out.println("Engineering college not found");
            return null;
        }

        if (e.getType() == CollegeType.IIT) {
            getParticular.removeIITColleges(e);
        } else if (e.getType() == CollegeType.NIT) {
            getParticular.removeNITColleges(e);
        } else if (e.getType() == CollegeType.IISER) {
            getParticular.removeIISERColleges(e);
        } else if (e.getType() == CollegeType.BITS) {
            getParticular.removeBITColleges(e);
        } else {
            getParticular.removeOtherEngineeringColleges(e);
        }
        return e;
    }

    //display list of removed colleges
    public void displayListOfRemovedColleges(){

         if (removedColleges.isEmpty()) {
            System.out.println("No college removed from database.");
            return;
        }

        for(Map.Entry<Integer, College> entry: removedColleges.entrySet()){
            System.out.println(ColorConsole.YELLOW + "\nCode: " + entry.getKey()
                + " | College Name: " + entry.getValue().getCollegeName()
                + " | Location: " + entry.getValue().getCollegeLocation());
        }
         System.out.println(ColorConsole.RESET);
    }
    

    //Remove Medical Colleges
    public Medical removeMedicalColleges(int code) {

        Medical m = db.removeMedicalColleges(code);
        removedColleges.put(code, m);

        if (m == null) {
            System.out.println("Medical college not found");
            return null;
        }

        if (m.getType() == CollegeType.AIIMS) {
            getParticular.removeAIIMSColleges(m);
        } else {
            getParticular.removeOtherMedicalColleges(m);
        }
        return m;
    }

    //Remove Medical Colleges
    public Pharmacy removePharmacyColleges(int code) {

        Pharmacy ph = db.removePharmacyColleges(code);
        removedColleges.put(code, ph);
        return ph;
    }

    //Search by location
    public void searchCollegeByLocation(String location) {

        boolean found = false;

        System.out.println(ColorConsole.RED
            + "\n===== Engineering Colleges in " + location + " =====");
        for (var entry : db.getAllEngineeringColleges().entrySet()) {
            Integer code = entry.getKey();
            Engineering e = entry.getValue();

            if (e.getCollegeLocation().equalsIgnoreCase(location)) {
                System.out.println(ColorConsole.YELLOW + "\nCode: " + code + " | College Name:" + e.getCollegeName());
                found = true;
            }
        }

        System.out.println(ColorConsole.RED
            + "\n===== Medical Colleges in " + location + " =====");
        for (var entry : db.getAllMedicalColleges().entrySet()) {
            Integer code = entry.getKey();
            Medical m = entry.getValue();

            if (m.getCollegeLocation().equalsIgnoreCase(location)) {
                System.out.println(ColorConsole.YELLOW + "\nCode: " + code + " | College Name:" + m.getCollegeName());
                found = true;
            }
        }

        System.out.println(ColorConsole.RED
            + "\n===== Pharmacy Colleges in " + location + " =====");
        for (var entry : db.getAllPharmacyColleges().entrySet()) {
            Integer code = entry.getKey();
            Pharmacy ph = entry.getValue();

            if (ph.getCollegeLocation().equalsIgnoreCase(location)) {
                System.out.println(ColorConsole.YELLOW + "\nCode: " + code + " | College Name:" + ph.getCollegeName());
                found = true;
            }
        }
         if (!found) {
            System.out.println(ColorConsole.RED + "\nNo colleges found in this location." + ColorConsole.RESET);
        }
    }

    //Search by name
    public College searchCollegeByName(String name) {

        for (var entry : db.getAllEngineeringColleges().entrySet()) {
            Integer code = entry.getKey();
            Engineering e = entry.getValue();

            if (e.getCollegeName().equalsIgnoreCase(name)) {
                System.out.println(ColorConsole.GREEN + "ENG | Code: " + code
                        + " | College Name: " + e.getCollegeName());
                return e;
            }
        }
        for (var entry : db.getAllMedicalColleges().entrySet()) {
            Integer code = entry.getKey();
            Medical m = entry.getValue();

            if (m.getCollegeName().equalsIgnoreCase(name)) {
                System.out.println(ColorConsole.GREEN + "MED | Code: " + code
                        + " | College Name: " + m.getCollegeName());
                return m;
            }
        }
        for (var entry : db.getAllPharmacyColleges().entrySet()) {
            Integer code = entry.getKey();
            Pharmacy ph = entry.getValue();

            if (ph.getCollegeName().equalsIgnoreCase(name)) {
                System.out.println(ColorConsole.GREEN + "PHARMA | Code: " + code
                        + " | College Name: " + ph.getCollegeName());
                return ph;
            }
        }
        return null;
    }

}
