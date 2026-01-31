
package com.college.service;
import com.college.bean.*;
import java.util.HashMap;

public class CollegesDataBase{
    private static HashMap<Integer, Engineering> engineeringColleges;
    private static HashMap<Integer, Medical> medicalColleges;
    private static HashMap<Integer, Pharmacy> pharmacyColleges;

    static{
        engineeringColleges = createEngineeringCollegeDatabase();
        medicalColleges = createMedicalCollegeDatabase();
        pharmacyColleges = createPharmacyCollegeDatabase();
    }

    // 🔹 ONE METHOD → FULL DATABASE
    private static HashMap<Integer, Engineering> createEngineeringCollegeDatabase(){
        HashMap<Integer, Engineering> map = new HashMap<>();

        // ===== IITs =====
        map.put(1001, new Engineering("IIT Bombay", "info@iitb.ac.in", "02225722545", "Mumbai", CollegeType.IIT));
        map.put(1002, new Engineering("IIT Delhi", "info@iitd.ac.in", "01126591735", "Delhi", CollegeType.IIT));
        map.put(1003, new Engineering("IIT Madras", "info@iitm.ac.in", "04422578000", "Chennai", CollegeType.IIT));
        map.put(1004, new Engineering("IIT Kanpur", "info@iitk.ac.in", "05122597777", "Kanpur", CollegeType.IIT));
        map.put(1005, new Engineering("IIT Kharagpur", "info@iitkgp.ac.in", "03222255000", "Kharagpur", CollegeType.IIT));
        map.put(1006, new Engineering("IIT Roorkee", "info@iitr.ac.in", "01332285000", "Roorkee", CollegeType.IIT));
        map.put(1007, new Engineering("IIT Guwahati", "info@iitg.ac.in", "03612582200", "Guwahati", CollegeType.IIT));
        map.put(1008, new Engineering("IIT Hyderabad", "info@iith.ac.in", "04023016000", "Hyderabad", CollegeType.IIT));
        map.put(1009, new Engineering("IIT BHU", "info@iitbhu.ac.in", "05422367100", "Varanasi", CollegeType.IIT));
        map.put(1010, new Engineering("IIT Indore", "info@iiti.ac.in", "07312431000", "Indore", CollegeType.IIT));

        // ===== NITs =====
        map.put(2001, new Engineering("NIT Trichy", "info@nitt.edu", "04312503000", "Tamil Nadu", CollegeType.NIT));
        map.put(2002, new Engineering("NIT Surathkal", "info@nitk.ac.in", "08242474000", "Karnataka", CollegeType.NIT));
        map.put(2003, new Engineering("NIT Warangal", "info@nitw.ac.in", "08702450000", "Telangana", CollegeType.NIT));
        map.put(2004, new Engineering("NIT Calicut", "info@nitc.ac.in", "04952441100", "Kerala", CollegeType.NIT));
        map.put(2005, new Engineering("NIT Rourkela", "info@nitrkl.ac.in", "06612463000", "Odisha", CollegeType.NIT));
        map.put(2006, new Engineering("NIT Allahabad", "info@mnnit.ac.in", "05322540200", "Prayagraj", CollegeType.NIT));
        map.put(2007, new Engineering("NIT Jaipur", "info@mnit.ac.in", "01412523000", "Rajasthan", CollegeType.NIT));
        map.put(2008, new Engineering("NIT Bhopal", "info@manit.ac.in", "07554052000", "Madhya Pradesh", CollegeType.NIT));
        map.put(2009, new Engineering("NIT Durgapur", "info@nitdgp.ac.in", "03422549000", "West Bengal", CollegeType.NIT));
        map.put(2010, new Engineering("NIT Silchar", "info@nits.ac.in", "03842230000", "Assam", CollegeType.NIT));

        // ===== IISERs =====
        map.put(8001, new Engineering("IISER Pune", "info@iiserpune.ac.in", "02025908000", "Pune", CollegeType.IISER));
        map.put(8002, new Engineering("IISER Kolkata", "info@iiserkol.ac.in", "03366340000", "Kolkata", CollegeType.IISER));
        map.put(8003, new Engineering("IISER Mohali", "info@iisermohali.ac.in", "01725036000", "Mohali", CollegeType.IISER));
        map.put(8004, new Engineering("IISER Bhopal", "info@iiserb.ac.in", "07552691000", "Bhopal", CollegeType.IISER));
        map.put(8005, new Engineering("IISER Thiruvananthapuram", "info@iisertvm.ac.in", "04712770300", "Thiruvananthapuram", CollegeType.IISER));
        map.put(8006, new Engineering("IISER Tirupati", "info@iisertirupati.ac.in", "08772210000", "Tirupati", CollegeType.IISER));
        map.put(8007, new Engineering("IISER Berhampur", "info@iiserbpr.ac.in", "06802300000", "Berhampur", CollegeType.IISER));

        // ===== BITS =====
        map.put(3001, new Engineering("BITS Pilani", "info@pilani.bits-pilani.ac.in", "01596242000", "Rajasthan", CollegeType.BITS));
        map.put(3002, new Engineering("BITS Goa", "info@goa.bits-pilani.ac.in", "08322580000", "Goa", CollegeType.BITS));
        map.put(3003, new Engineering("BITS Hyderabad", "info@hyderabad.bits-pilani.ac.in", "04066303833", "Hyderabad", CollegeType.BITS));

        // ===== State / Private Colleges =====
        map.put(212, new Engineering("COEP Pune", "info@coep.ac.in", "02025507000", "Pune",CollegeType.OtherEngineering));
        map.put(213, new Engineering("VJTI Mumbai", "contact@vjti.ac.in", "02224198100", "Mumbai",CollegeType.OtherEngineering));
        map.put(214, new Engineering("MIT WPU", "info@mitwpu.edu.in", "02071177104", "Pune",CollegeType.OtherEngineering));
        map.put(215, new Engineering("PCCOE", "info@pccoepune.com", "02027653168", "Pune",CollegeType.OtherEngineering));
        map.put(216, new Engineering("SPIT", "info@spit.ac.in", "02226708520", "Mumbai",CollegeType.OtherEngineering));
        map.put(217, new Engineering("DY Patil COE", "info@dypcoeakurdi.ac.in", "02027655600", "Pune",CollegeType.OtherEngineering));
        map.put(218, new Engineering("Sinhgad COE", "info@sinhgad.edu", "02024357200", "Pune",CollegeType.OtherEngineering));
        map.put(219, new Engineering("KJ Somaiya", "info@somaiya.edu", "02221025252", "Mumbai",CollegeType.OtherEngineering));
        map.put(220, new Engineering("Walchand COE", "info@walchandsangli.ac.in", "02332600700", "Sangli",CollegeType.OtherEngineering));
        map.put(221, new Engineering("IIIT Pune", "info@iiitp.ac.in", "02024387000", "Pune",CollegeType.OtherEngineering));
        map.put(4003, new Engineering("ICT Mumbai", "info@ictmumbai.edu.in", "02233612000", "Mumbai",CollegeType.OtherEngineering));
        map.put(4101, new Engineering("RV College of Engineering", "info@rvce.edu.in", "08067178021", "Bengaluru",CollegeType.OtherEngineering));
        map.put(4102, new Engineering("BMS College of Engineering", "info@bmsce.ac.in", "08026614357", "Bengaluru",CollegeType.OtherEngineering));
        map.put(4201, new Engineering("Anna University CEG", "info@annauniv.edu", "04422358880", "Chennai",CollegeType.OtherEngineering));
        map.put(4202, new Engineering("SSN College of Engineering", "info@ssn.edu.in", "04427469700", "Chennai",CollegeType.OtherEngineering));
        map.put(4401, new Engineering("Delhi Technological University (DTU)", "info@dtu.ac.in", "01127871018", "Delhi",CollegeType.OtherEngineering));
        map.put(4402, new Engineering("NSUT Delhi", "info@nsut.ac.in", "01125099000", "Delhi",CollegeType.OtherEngineering));

        map.put(4501, new Engineering("Jadavpur University", "info@jadavpuruniversity.in", "03324572227", "Kolkata",CollegeType.OtherEngineering));
        map.put(4701, new Engineering("Thapar Institute of Engineering", "info@thapar.edu", "01752395000", "Punjab",CollegeType.OtherEngineering));
        map.put(7201, new Engineering("Vellore Institute of Technology (VIT)", "info@vit.ac.in", "04162202000", "Vellore",CollegeType.OtherEngineering));
        map.put(7202, new Engineering("SRM Institute of Science and Technology", "info@srmist.edu.in", "04427417000", "Chennai",CollegeType.OtherEngineering));
        map.put(7203, new Engineering("SASTRA University", "info@sastra.edu", "04362264101", "Thanjavur",CollegeType.OtherEngineering));
        map.put(7401, new Engineering("Jaypee Institute of Information Technology", "info@jiit.ac.in", "01202450000", "Noida",CollegeType.OtherEngineering));
        map.put(7402, new Engineering("Amity University Noida", "info@amity.edu", "01204390000", "Noida",CollegeType.OtherEngineering));
        map.put(7501, new Engineering("Manipal University Jaipur", "info@jaipur.manipal.edu", "01413990000", "Jaipur",CollegeType.OtherEngineering));

        return map;
    }


    // ================= MEDICAL COLLEGES =================
    private static HashMap<Integer, Medical> createMedicalCollegeDatabase() {

        HashMap<Integer, Medical> map = new HashMap<>();

        map.put(301, new Medical("BJ Medical College", "9000000001", "MBBS", "Pune", CollegeType.OtherMedical));
        map.put(302, new Medical("Grant Medical College", "9000000002", "MBBS", "Mumbai",CollegeType.OtherMedical));
        map.put(303, new Medical("AFMC", "9000000003", "MBBS", "Pune",CollegeType.OtherMedical));
        map.put(304, new Medical("KEM Hospital", "9000000004", "MBBS", "Mumbai", CollegeType.OtherMedical));
        map.put(305, new Medical("JJ Medical College", "9000000005", "MBBS", "Mumbai", CollegeType.OtherMedical));
        map.put(306, new Medical("LTMMC", "9000000006", "MBBS", "Mumbai", CollegeType.OtherMedical));
        map.put(307, new Medical("GMC Nagpur", "9000000007", "MBBS", "Nagpur", CollegeType.OtherMedical));
        map.put(308, new Medical("DY Patil Medical", "9000000008", "MBBS", "Pune", CollegeType.OtherMedical));
        map.put(309, new Medical("NKP Salve", "9000000009", "MBBS", "Nagpur", CollegeType.OtherMedical));
        map.put(310, new Medical("Seth GS Medical", "9000000010", "MBBS", "Mumbai", CollegeType.OtherMedical));

        map.put(311, new Medical("AIIMS New Delhi", "9000000011", "MBBS", "New Delhi", CollegeType.AIIMS));
        map.put(312, new Medical("AIIMS Bangalore", "9000000012", "MBBS", "Bangalore", CollegeType.AIIMS));
        map.put(313, new Medical("AIIMS Bhopal", "9000000013", "MBBS", "Bhopal", CollegeType.AIIMS));
        map.put(314, new Medical("AIIMS Bhubaneswar", "9000000014", "MBBS", "Bhubaneswar", CollegeType.AIIMS));
        map.put(315, new Medical("AIIMS Jodhpur", "9000000015", "MBBS", "Jodhpur", CollegeType.AIIMS));
        map.put(316, new Medical("AIIMS Raipur", "9000000016", "MBBS", "Raipur", CollegeType.AIIMS));
        map.put(317, new Medical("AIIMS Rishikesh", "9000000017", "MBBS", "Rishikesh", CollegeType.AIIMS));

        map.put(318, new Medical("Christian Medical College Vellore", "9000000018", "MBBS", "Vellore", CollegeType.OtherMedical));
        map.put(319, new Medical("King George's Medical University", "9000000019", "MBBS", "Lucknow", CollegeType.OtherMedical));
        map.put(320, new Medical("Banaras Hindu University – Institute of Medical Sciences", "9000000020", "MBBS", "Varanasi", CollegeType.OtherMedical));
        map.put(321, new Medical("Maulana Azad Medical College", "9000000021", "MBBS", "New Delhi", CollegeType.OtherMedical));
        map.put(322, new Medical("Lady Hardinge Medical College", "9000000022", "MBBS", "New Delhi", CollegeType.OtherMedical));
        map.put(323, new Medical("Armed Forces Medical College (AFMC) Pune", "9000000023", "MBBS", "Pune", CollegeType.OtherMedical));
        map.put(324, new Medical("St. John's Medical College", "9000000024", "MBBS", "Bangalore", CollegeType.OtherMedical));
        map.put(325, new Medical("Grant Medical College & Sir J.J. Group of Hospitals", "9000000025", "MBBS", "Mumbai", CollegeType.OtherMedical));
        map.put(326, new Medical("Amrita School of Medicine, Kochi", "9000000026", "MBBS", "Kochi", CollegeType.OtherMedical));
        map.put(327, new Medical("Manipal College of Medical Sciences", "9000000027", "MBBS", "Manipal", CollegeType.OtherMedical));
        map.put(328, new Medical("JIPMER Puducherry", "9000000028", "MBBS", "Puducherry", CollegeType.OtherMedical));
        map.put(329, new Medical("King George's Medical University – Gorakhpur Campus", "9000000029", "MBBS", "Gorakhpur", CollegeType.OtherMedical));
        map.put(330, new Medical("Institute of Medical Sciences, Banaras Hindu University", "9000000030", "MBBS", "Varanasi", CollegeType.OtherMedical));

        return map;
    }


    // ================= PHARMACY COLLEGES =================
    private static HashMap<Integer, Pharmacy> createPharmacyCollegeDatabase() {

        HashMap<Integer, Pharmacy> map = new HashMap<>();

        map.put(401, new Pharmacy("Poona College of Pharmacy", "8111111111", "BPharm", "Pune", CollegeType.OtherPharmacy));
        map.put(402, new Pharmacy("Bombay College of Pharmacy", "8222222222", "BPharm", "Mumbai", CollegeType.OtherPharmacy));
        map.put(403, new Pharmacy("DY Patil Pharmacy", "8333333333", "BPharm", "Pune", CollegeType.OtherPharmacy));
        map.put(404, new Pharmacy("Sinhgad Pharmacy", "8444444444", "BPharm", "Pune", CollegeType.OtherPharmacy));
        map.put(405, new Pharmacy("KLE Pharmacy", "8555555555", "BPharm", "Belgaum", CollegeType.OtherPharmacy));
        map.put(406, new Pharmacy("MIT Pharmacy", "8666666666", "BPharm", "Pune", CollegeType.OtherPharmacy));
        map.put(407, new Pharmacy("SVKM Pharmacy", "8777777777", "BPharm", "Mumbai", CollegeType.OtherPharmacy));
        map.put(408, new Pharmacy("Bharati Vidyapeeth Pharmacy", "8888888888", "BPharm", "Pune", CollegeType.OtherPharmacy));
        map.put(409, new Pharmacy("PES Pharmacy", "8999999999", "BPharm", "Aurangabad", CollegeType.OtherPharmacy));
        map.put(410, new Pharmacy("RCPIPER", "8111222233", "BPharm", "Shirpur", CollegeType.OtherPharmacy));

        return map;
    }

    public Engineering getEngineeringColleges(int engineeringCode) {
        return engineeringColleges.get(engineeringCode);
    }

    public Medical getMedicalColleges(int medicalCode) {
        return medicalColleges.get(medicalCode);
    }

    public Pharmacy getPharmacyColleges(int pharmacyCode) {
        return pharmacyColleges.get(pharmacyCode);
    }

    public HashMap<Integer, Engineering> getAllEngineeringColleges() {
        return engineeringColleges;
    }

    public HashMap<Integer, Medical> getAllMedicalColleges() {
        return medicalColleges;
    }

    public HashMap<Integer, Pharmacy> getAllPharmacyColleges() {
        return pharmacyColleges;
    }

}
