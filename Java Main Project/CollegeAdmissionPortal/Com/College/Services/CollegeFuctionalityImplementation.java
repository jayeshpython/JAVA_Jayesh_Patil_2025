package Services;
import Bean.*;
import dto.*;
import java.util.*;

public class CollegeFuctionalityImplementation implements CollegeFunctionality {

    private CollegesDataBase db;
    private GetParticularCollegesDatabase getParticular;
    private CollegeRequest collegeRequest = new CollegeRequest();
    Scanner sc = new Scanner(System.in);

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

        for (var entry : db.getAllEngineeringColleges().entrySet()) {
            Integer code = entry.getKey();
            Engineering e = entry.getValue();

            System.out.println("Code: " + code + " | " + e.getCollegeName()
                    + " | College Location: " + e.getCollegeLocation());
        }
    }

    public void displayAllMedicalColleges() {

        for (var entry : db.getAllMedicalColleges().entrySet()) {
            Integer code = entry.getKey();
            Medical m = entry.getValue();

            System.out.println("Code: " + code + " | College Name: " + m.getCollegeName()
                    + " | College Location: " + m.getCollegeLocation());
        }
    }

    public void displayAllPharmacyColleges() {

        for (var entry : db.getAllPharmacyColleges().entrySet()) {
            Integer code = entry.getKey();
            Pharmacy ph = entry.getValue();

            System.out.println("Code: " + code + " | " + ph.getCollegeName()
                    + " | College Location: " + ph.getCollegeLocation());
        }
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

    public void addMedicalColleges() {

       College c = collegeRequest.AcceptCollegeDetails(); //BASE CLASS -> CHILD CLASS REFERENCES
        if (c == null) {
            System.out.print("Invalid Information");
            return;
        }
        Medical m = (Medical) c;
        db.addMedicalColleges(collegeRequest.getCollegeCode(), m);

        if (m.getType() == CollegeType.AIIMS) {
            getParticular.addAIIMSCollleges(m);
        } else {
            getParticular.addOtherMedicalColleges(m);
        }
    }

    public void addPharmacyColleges() {

         College c = collegeRequest.AcceptCollegeDetails();  //BASE CLASS -> CHILD CLASS REFERENCES
        if (c == null) {
            System.out.println("Invalid Information");
            return;
        }
        Pharmacy ph = (Pharmacy) c;
        db.addPharmacyColleges(collegeRequest.getCollegeCode(), ph);
    }

    // ------- Remove Colleges --------
    public Engineering removeEngineeringColleges(int code) {

        Engineering e = db.removeEngineeringColleges(code);

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

    public Medical removeMedicalColleges(int code) {

        Medical m = db.removeMedicalColleges(code);

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

    public Pharmacy removePharmacyColleges(int code) {

        Pharmacy ph = db.removePharmacyColleges(code);
        return ph;
    }

    public void searchCollegeByLocation(String location) {

        boolean found = false;

        for (var entry : db.getAllEngineeringColleges().entrySet()) {
            Integer code = entry.getKey();
            Engineering e = entry.getValue();

            if (e.getCollegeLocation().equalsIgnoreCase(location)) {
                System.out.println("Code: " + code + " | College Name:" + e.getCollegeName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No engineering colleges found in " + location);
        }
    }

    public College searchCollegeByName(String name) {

        for (var entry : db.getAllEngineeringColleges().entrySet()) {
            Integer code = entry.getKey();
            Engineering e = entry.getValue();

            if (e.getCollegeName().equalsIgnoreCase(name)) {
                System.out.println("ENG | Code: " + code
                        + " | College Name: " + e.getCollegeName());
                return e;
            }
        }
        for (var entry : db.getAllMedicalColleges().entrySet()) {
            Integer code = entry.getKey();
            Medical m = entry.getValue();

            if (m.getCollegeName().equalsIgnoreCase(name)) {
                System.out.println("MED | Code: " + code
                        + " | College Name: " + m.getCollegeName());
                return m;
            }
        }
        for (var entry : db.getAllPharmacyColleges().entrySet()) {
            Integer code = entry.getKey();
            Pharmacy ph = entry.getValue();

            if (ph.getCollegeName().equalsIgnoreCase(name)) {
                System.out.println("PHARMA | Code: " + code
                        + " | College Name: " + ph.getCollegeName());
                return ph;
            }
        }
        System.out.println("College not found by " + name);
        return null;
    }

}
