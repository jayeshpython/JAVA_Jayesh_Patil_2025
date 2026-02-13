package Services;

import Bean.*;
import java.util.HashMap;



public class CollegesDataBase{
    private static HashMap<Integer, Engineering> engineeringColleges;
    private static HashMap<Integer, Medical> medicalColleges;
    private static HashMap<Integer, Pharmacy> pharmacyColleges;

    public CollegesDataBase(){}

    static{
        engineeringColleges = createEngineeringCollegeDatabase();
        medicalColleges = createMedicalCollegeDatabase();
        pharmacyColleges = createPharmacyCollegeDatabase();
    }

    // 🔹 ONE METHOD → FULL DATABASE
    private static HashMap<Integer, Engineering> createEngineeringCollegeDatabase(){
        HashMap<Integer, Engineering> map = new HashMap<>();

        // ===== IITs =====
        //Engineering iitB=new Engineering("IIT Bombay", "info@iitb.ac.in", "02225722545", "Mumbai", CollegeType.IIT);
        //map.put(1001, iitB);
        //iitB.addBranchDetails("Mechanical", new Branch(99,89,15));
        
            // ================= IITs =================
        Engineering iitB = new Engineering("IIT Bombay","info@iitb.ac.in","02225722545","Mumbai",CollegeType.IIT);
        iitB.addBranchDetails("CSE Engineering", new Branch(99.67, 99.72,120));
        iitB.addBranchDetails("Electrical Engineering", new Branch(99.32, 99.38,100));
        iitB.addBranchDetails("Mechanical Engineering", new Branch(99.40, 99.33,150));
        iitB.addBranchDetails("Electonics Engineering", new Branch(99.51, 99.57, 90));
        iitB.addBranchDetails("Civil Engineering", new Branch(98.78, 98.60, 60));
        iitB.addBranchDetails("Aerospace Engineering", new Branch(99.78, 99.82, 180));
        map.put(1001, iitB);

        Engineering iitD = new Engineering("IIT Delhi","info@iitd.ac.in","01126591735","Delhi",CollegeType.IIT);
        iitD.addBranchDetails("CSE Engineering", new Branch(99.64, 99.70,110));
        iitD.addBranchDetails("Electrical Engineering", new Branch(99.22, 99.31,120));
        iitD.addBranchDetails("Mechanical Engineering", new Branch(99.30, 99.34,150));
        iitD.addBranchDetails("Electronics Engineering", new Branch(99.412, 99.483, 180));
        iitD.addBranchDetails("Civil Engineering", new Branch(98.50, 98.42, 240));
        map.put(1002, iitD);

        Engineering iitM = new Engineering("IIT Madras","info@iitm.ac.in","04422578000","Chennai",CollegeType.IIT);
        iitM.addBranchDetails("CSE Engineering", new Branch(99.70, 99.75,120));
        iitM.addBranchDetails("Electrical Engineering", new Branch(99.34, 99.39, 180));
        iitM.addBranchDetails("Mechanical Enginerring", new Branch(99.23, 99.26,150));
        iitM.addBranchDetails("Electonics Engineering", new Branch(99.53, 99.62, 60));
        iitM.addBranchDetails("Civil Engineering", new Branch(98.12, 98.04, 180));
        map.put(1003, iitM);

        Engineering iitK = new Engineering("IIT Kanpur","info@iitk.ac.in","05122597777","Kanpur",CollegeType.IIT);
        iitK.addBranchDetails("CSE Engineering", new Branch(99.62, 99.69,110));
        iitK.addBranchDetails("Electrical Engineering", new Branch(99.34, 99.35,120));
        iitK.addBranchDetails("Mechanical Engineering", new Branch(99.23, 99.25,150));
        iitK.addBranchDetails("Electonics Engineering", new Branch(99.51, 99.59, 60));
        iitK.addBranchDetails("Civil Engineering", new Branch(98.12, 98.04, 180));
        map.put(1004, iitK);

        Engineering iitKgp = new Engineering("IIT Kharagpur","info@iitkgp.ac.in","03222255000","Kharagpur",CollegeType.IIT);
        iitKgp.addBranchDetails("CSE Engineering", new Branch(99.55, 99.61,120));
        iitKgp.addBranchDetails("Electrical Engineering", new Branch(99.34, 99.37,120));
        iitKgp.addBranchDetails("Mechanical Engineering", new Branch(98.97, 98.99,150));
        iitKgp.addBranchDetails("Electonics Engineering", new Branch(99.48, 99.52, 60));
        iitKgp.addBranchDetails("Civil Engineering", new Branch(98.03, 98.04, 180));
        iitKgp.addBranchDetails("Mining Engineering", new Branch(97.89, 97.66, 80));
        map.put(1005, iitKgp);

        Engineering iitR = new Engineering("IIT Roorkee","info@iitr.ac.in","01332285000","Roorkee",CollegeType.IIT);
        iitR.addBranchDetails("CSE Engineering", new Branch(99.62, 99.75,120));
        iitR.addBranchDetails("Electrical Engineering", new Branch(99.21, 99.25,140));
        iitR.addBranchDetails("Mechanical Engineering", new Branch(99.14, 99.19,150));
        iitR.addBranchDetails("Electonics Engineering", new Branch(99.42, 99.51, 180));
        iitR.addBranchDetails("Civil Engineering", new Branch(98.06, 98.04, 210));
        map.put(1006, iitR);

        Engineering iitG = new Engineering("IIT Guwahati","info@iitg.ac.in","03612582200","Guwahati",CollegeType.IIT);
        iitG.addBranchDetails("CSE Engineering", new Branch(99.44, 99.55,120));
        iitG.addBranchDetails("Electrical Engineering", new Branch(99.21, 99.29,120));
        iitG.addBranchDetails("Mechanical Engineering", new Branch(99.09, 99.15,150));
        iitG.addBranchDetails("Electonics Engineering", new Branch(99.39, 99.47, 60));
        iitG.addBranchDetails("Civil Engineering", new Branch(98.12, 98.04, 180));
        map.put(1007, iitG);

        Engineering iitH = new Engineering("IIT Hyderabad","info@iith.ac.in","04023016000","Hyderabad",CollegeType.IIT);
        iitH.addBranchDetails("CSE", new Branch(99.53, 99.56,120));
        iitH.addBranchDetails("Electrical", new Branch(199.12, 99.20,120));
        iitH.addBranchDetails("Mechanical", new Branch(99.12, 99.15,150));
        iitH.addBranchDetails("Electonics Engineering", new Branch(99.35, 99.42, 60));
        iitH.addBranchDetails("Civil Engineering", new Branch(98.11, 98.04, 180));
        map.put(1008, iitH);

        Engineering iitBHU = new Engineering("IIT BHU","info@iitbhu.ac.in","05422367100","Varanasi",CollegeType.IIT);
        iitBHU.addBranchDetails("CSE Engineering", new Branch(98.72, 98.75,110));
        iitBHU.addBranchDetails("Electrical Engineering", new Branch(98.56, 98.62,120));
        iitBHU.addBranchDetails("Mechanical Engineering", new Branch(98.26, 98.21, 150));
        iitBHU.addBranchDetails("Electonics Engineering", new Branch(98.53, 99.62, 60));
        iitBHU.addBranchDetails("Civil Engineering", new Branch(96.12, 96.04, 180));
        map.put(1009, iitBHU);

        Engineering iitI = new Engineering("IIT Indore","info@iiti.ac.in","07312431000","Indore",CollegeType.IIT);
        iitI.addBranchDetails("CSE Engineering", new Branch(99.22, 99.26,110));
        iitI.addBranchDetails("Electrical Engineering", new Branch(99.03, 99.09,120));
        iitI.addBranchDetails("Mechanical Engineering", new Branch(98.92, 98.88,150));
        iitM.addBranchDetails("Electonics Engineering", new Branch(99.13, 99.22, 60));
        iitM.addBranchDetails("Civil Engineering", new Branch(98.12, 98.04, 180));
        map.put(1010, iitI);

        // ================= NITs =================

        Engineering nitT = new Engineering("NIT Trichy","info@nitt.edu","04312503000","Tamil Nadu",CollegeType.NIT);
        nitT.addBranchDetails("CSE Engineering", new Branch(98.95, 99.10,120));
        nitT.addBranchDetails("Electrical Engineering", new Branch(98.45, 98.60,120));
        nitT.addBranchDetails("Mechanical Engineering", new Branch(97.85, 98.00,150));
        nitT.addBranchDetails("Electronics Engineering", new Branch(98.70, 98.85,120));
        nitT.addBranchDetails("Civil Engineering", new Branch(96.80, 97.00,180));
        map.put(2001, nitT);

        Engineering nitS = new Engineering("NIT Surathkal","info@nitk.ac.in","08242474000","Karnataka",CollegeType.NIT);
        nitS.addBranchDetails("CSE Engineering", new Branch(98.75, 98.90,120));
        nitS.addBranchDetails("Electrical Engineering", new Branch(98.20, 98.35,120));
        nitS.addBranchDetails("Mechanical Engineering", new Branch(97.60, 97.80,150));
        nitS.addBranchDetails("Electronics Engineering", new Branch(98.40, 98.55,120));
        nitS.addBranchDetails("Civil Engineering", new Branch(96.50, 96.70,180));
        map.put(2002, nitS);

        Engineering nitW = new Engineering("NIT Warangal","info@nitw.ac.in","08702450000","Telangana",CollegeType.NIT);
        nitW.addBranchDetails("CSE Engineering", new Branch(98.65, 98.80,120));
        nitW.addBranchDetails("Electrical Engineering", new Branch(98.10, 98.25,120));
        nitW.addBranchDetails("Mechanical Engineering", new Branch(97.50, 97.70,150));
        nitW.addBranchDetails("Electronics Engineering", new Branch(98.30, 98.45,120));
        nitW.addBranchDetails("Civil Engineering", new Branch(96.40, 96.60,180));
        map.put(2003, nitW);

        Engineering nitC = new Engineering("NIT Calicut","info@nitc.ac.in","04952441100","Kerala",CollegeType.NIT);
        nitC.addBranchDetails("CSE Engineering", new Branch(98.40, 98.55,120));
        nitC.addBranchDetails("Electrical Engineering", new Branch(97.95, 98.10,120));
        nitC.addBranchDetails("Mechanical Engineering", new Branch(97.30, 97.50,150));
        nitC.addBranchDetails("Electronics Engineering", new Branch(98.10, 98.25,120));
        nitC.addBranchDetails("Civil Engineering", new Branch(96.20, 96.40,180));
        map.put(2004, nitC);

        Engineering nitR = new Engineering("NIT Rourkela","info@nitrkl.ac.in","06612463000","Odisha",CollegeType.NIT);
        nitR.addBranchDetails("CSE Engineering", new Branch(98.35, 98.50,120));
        nitR.addBranchDetails("Electrical Engineering", new Branch(97.90, 98.05,120));
        nitR.addBranchDetails("Mechanical Engineering", new Branch(97.25, 97.45,150));
        nitR.addBranchDetails("Electronics Engineering", new Branch(98.00, 98.15,120));
        nitR.addBranchDetails("Civil Engineering", new Branch(96.10, 96.30,180));
        map.put(2005, nitR);

        Engineering nitA = new Engineering("NIT Allahabad","info@mnnit.ac.in","05322540200","Prayagraj",CollegeType.NIT);
        nitA.addBranchDetails("CSE Engineering", new Branch(98.20, 98.35,120));
        nitA.addBranchDetails("Electrical Engineering", new Branch(97.75, 97.90,120));
        nitA.addBranchDetails("Mechanical Engineering", new Branch(97.10, 97.30,150));
        nitA.addBranchDetails("Electronics Engineering", new Branch(97.90, 98.05,120));
        nitA.addBranchDetails("Civil Engineering", new Branch(95.90, 96.10,180));
        map.put(2006, nitA);

        Engineering nitJ = new Engineering("NIT Jaipur","info@mnit.ac.in","01412523000","Rajasthan",CollegeType.NIT);
        nitJ.addBranchDetails("CSE Engineering", new Branch(98.00, 98.15,120));
        nitJ.addBranchDetails("Electrical Engineering", new Branch(97.55, 97.70,120));
        nitJ.addBranchDetails("Mechanical Engineering", new Branch(96.90, 97.10,150));
        nitJ.addBranchDetails("Electronics Engineering", new Branch(97.70, 97.85,120));
        nitJ.addBranchDetails("Civil Engineering", new Branch(95.70, 95.90,180));
        map.put(2007, nitJ);

        Engineering nitB = new Engineering("NIT Bhopal","info@manit.ac.in","07554052000","Madhya Pradesh",CollegeType.NIT);
        nitB.addBranchDetails("CSE Engineering", new Branch(97.85, 98.00,120));
        nitB.addBranchDetails("Electrical Engineering", new Branch(97.40, 97.55,120));
        nitB.addBranchDetails("Mechanical Engineering", new Branch(96.80, 97.00,150));
        nitB.addBranchDetails("Electronics Engineering", new Branch(97.55, 97.70,120));
        nitB.addBranchDetails("Civil Engineering", new Branch(95.60, 95.80,180));
        map.put(2008, nitB);

        Engineering nitD = new Engineering("NIT Durgapur","info@nitdgp.ac.in","03422549000","West Bengal",CollegeType.NIT);
        nitD.addBranchDetails("CSE Engineering", new Branch(97.70, 97.85,120));
        nitD.addBranchDetails("Electrical Engineering", new Branch(97.25, 97.40,120));
        nitD.addBranchDetails("Mechanical Engineering", new Branch(96.65, 96.85,150));
        nitD.addBranchDetails("Electronics Engineering", new Branch(97.45, 97.60,120));
        nitD.addBranchDetails("Civil Engineering", new Branch(95.40, 95.60,180));
        map.put(2009, nitD);

        Engineering nitSi = new Engineering("NIT Silchar","info@nits.ac.in","03842230000","Assam",CollegeType.NIT);
        nitSi.addBranchDetails("CSE Engineering", new Branch(97.30, 97.45,120));
        nitSi.addBranchDetails("Electrical Engineering", new Branch(96.90, 97.05,120));
        nitSi.addBranchDetails("Mechanical Engineering", new Branch(96.30, 96.50,150));
        nitSi.addBranchDetails("Electronics Engineering", new Branch(97.05, 97.20,120));
        nitSi.addBranchDetails("Civil Engineering", new Branch(95.10, 95.30,180));
        map.put(2010, nitSi);

                // ================= IISER Pune =================
        Engineering iiserP = new Engineering(
                "IISER Pune","info@iiserpune.ac.in","02025908000","Pune",CollegeType.IISER
        );
        iiserP.addBranchDetails("Physics", new Branch(98.50, 98.60,60));
        iiserP.addBranchDetails("Chemistry", new Branch(98.20, 98.30,60));
        iiserP.addBranchDetails("Biology", new Branch(97.80, 97.90,60));
        iiserP.addBranchDetails("Mathematics", new Branch(98.40, 98.50,60));
        iiserP.addBranchDetails("Earth & Environmental Science", new Branch(97.20, 97.30,40));
        map.put(8001, iiserP);

        // ================= IISER Kolkata =================
        Engineering iiserK = new Engineering(
                "IISER Kolkata","info@iiserkol.ac.in","03366340000","Kolkata",CollegeType.IISER
        );
        iiserK.addBranchDetails("Physics", new Branch(98.30, 98.40,60));
        iiserK.addBranchDetails("Chemistry", new Branch(98.00, 98.10,60));
        iiserK.addBranchDetails("Biology", new Branch(97.60, 97.70,60));
        iiserK.addBranchDetails("Mathematics", new Branch(98.10, 98.20,60));
        iiserK.addBranchDetails("Earth & Environmental Science", new Branch(97.00, 97.10,40));
        map.put(8002, iiserK);

        // ================= IISER Mohali =================
        Engineering iiserM = new Engineering(
                "IISER Mohali","info@iisermohali.ac.in","01725036000","Mohali",CollegeType.IISER
        );
        iiserM.addBranchDetails("Physics", new Branch(97.80, 97.90,60));
        iiserM.addBranchDetails("Chemistry", new Branch(97.50, 97.60,60));
        iiserM.addBranchDetails("Biology", new Branch(97.10, 97.20,60));
        iiserM.addBranchDetails("Mathematics", new Branch(97.60, 97.70,60));
        iiserM.addBranchDetails("Earth & Environmental Science", new Branch(96.80, 96.90,40));
        map.put(8003, iiserM);

        // ================= IISER Bhopal (SPECIAL CASE) =================
        Engineering iiserB = new Engineering(
                "IISER Bhopal","info@iiserb.ac.in","07552691000","Bhopal",CollegeType.IISER
        );
        iiserB.addBranchDetails("Physics", new Branch(97.70, 97.80,60));
        iiserB.addBranchDetails("Chemistry", new Branch(97.40, 97.50,60));
        iiserB.addBranchDetails("Biology", new Branch(97.00, 97.10,60));
        iiserB.addBranchDetails("Mathematics", new Branch(97.60, 97.70,60));
        iiserB.addBranchDetails("Earth & Environmental Science", new Branch(96.80, 96.90,40));

        // 🔹 Unique IISER Bhopal branches
        iiserB.addBranchDetails("Economic Sciences", new Branch(98.00, 98.10,40));
        iiserB.addBranchDetails("EECS (Electrical & Computer Sciences)", new Branch(98.40, 98.50,60));
        iiserB.addBranchDetails("Data Science Engineering", new Branch(98.60, 98.70,60));
        map.put(8004, iiserB);

        // ================= IISER Thiruvananthapuram =================
        Engineering iiserTvm = new Engineering(
                "IISER Thiruvananthapuram","info@iisertvm.ac.in","04712770300",
                "Thiruvananthapuram",CollegeType.IISER
        );
        iiserTvm.addBranchDetails("Physics", new Branch(97.60, 97.70,60));
        iiserTvm.addBranchDetails("Chemistry", new Branch(97.30, 97.40,60));
        iiserTvm.addBranchDetails("Biology", new Branch(96.90, 97.00,60));
        iiserTvm.addBranchDetails("Mathematics", new Branch(97.40, 97.50,60));
        iiserTvm.addBranchDetails("Earth & Environmental Science", new Branch(96.60, 96.70,40));
        map.put(8005, iiserTvm);

        // ================= IISER Tirupati =================
        Engineering iiserT = new Engineering(
                "IISER Tirupati","info@iisertirupati.ac.in","08772210000",
                "Tirupati",CollegeType.IISER
        );
        iiserT.addBranchDetails("Physics", new Branch(97.20, 97.30,60));
        iiserT.addBranchDetails("Chemistry", new Branch(96.90, 97.00,60));
        iiserT.addBranchDetails("Biology", new Branch(96.50, 96.60,60));
        iiserT.addBranchDetails("Mathematics", new Branch(97.00, 97.10,60));
        iiserT.addBranchDetails("Earth & Environmental Science", new Branch(96.20, 96.30,40));
        map.put(8006, iiserT);

        // ================= IISER Berhampur =================
        Engineering iiserBr = new Engineering(
                "IISER Berhampur","info@iiserbpr.ac.in","06802300000",
                "Berhampur",CollegeType.IISER
        );
        iiserBr.addBranchDetails("Physics", new Branch(96.80, 96.90,60));
        iiserBr.addBranchDetails("Chemistry", new Branch(96.50, 96.60,60));
        iiserBr.addBranchDetails("Biology", new Branch(96.10, 96.20,60));
        iiserBr.addBranchDetails("Mathematics", new Branch(96.60, 96.70,60));
        iiserBr.addBranchDetails("Earth & Environmental Science", new Branch(95.80, 95.90,40));
        map.put(8007, iiserBr);

                // ================= BITS =================
        Engineering bitsP = new Engineering("BITS Pilani","info@pilani.bits-pilani.ac.in","01596242000","Rajasthan",CollegeType.BITS);
        bitsP.addBranchDetails("CSE", new Branch(98.50,98.60,150));
        bitsP.addBranchDetails("Electrical", new Branch(97.90,98.00,150));
        bitsP.addBranchDetails("Mechanical", new Branch(97.10,97.20,180));
        map.put(3001, bitsP);

        Engineering bitsG = new Engineering("BITS Goa","info@goa.bits-pilani.ac.in","08322580000","Goa",CollegeType.BITS);
        bitsG.addBranchDetails("CSE", new Branch(97.80,97.90,120));
        bitsG.addBranchDetails("Electrical", new Branch(97.10,97.20,120));
        bitsG.addBranchDetails("Mechanical", new Branch(96.40,96.50,150));
        map.put(3002, bitsG);

        Engineering bitsH = new Engineering("BITS Hyderabad","info@hyderabad.bits-pilani.ac.in","04066303833","Hyderabad",CollegeType.BITS);
        bitsH.addBranchDetails("CSE", new Branch(97.50,97.60,120));
        bitsH.addBranchDetails("Electrical", new Branch(96.80,96.90,120));
        bitsH.addBranchDetails("Mechanical", new Branch(96.10,96.20,150));
        map.put(3003, bitsH);

                // ================= COEP Pune =================
        Engineering coep = new Engineering(
                "COEP Pune","info@coep.ac.in","02025507000","Pune",CollegeType.OtherEngineering
        );
        coep.addBranchDetails("CSE Engineering", new Branch(99.10, 99.20,120));
        coep.addBranchDetails("IT Engineering", new Branch(98.80, 98.90,60));
        coep.addBranchDetails("Electrical Engineering", new Branch(98.40, 98.50,120));
        coep.addBranchDetails("Mechanical Engineering", new Branch(97.90, 98.00,180));
        coep.addBranchDetails("Civil Engineering", new Branch(97.20, 97.30,120));
        map.put(212, coep);

        // ================= VJTI Mumbai =================
        Engineering vjti = new Engineering(
                "VJTI Mumbai","contact@vjti.ac.in","02224198100","Mumbai",CollegeType.OtherEngineering
        );
        vjti.addBranchDetails("CSE Engineering", new Branch(99.05, 99.15,90));
        vjti.addBranchDetails("IT Engineering", new Branch(98.75, 98.85,60));
        vjti.addBranchDetails("Electronics Engineering", new Branch(98.60, 98.70,120));
        vjti.addBranchDetails("Electrical Engineering", new Branch(98.30, 98.40,120));
        vjti.addBranchDetails("Mechanical Engineering", new Branch(97.80, 97.90,180));
        map.put(213, vjti);

        // ================= MIT WPU Pune =================
        Engineering mitwpu = new Engineering(
                "MIT WPU","info@mitwpu.edu.in","02071177104","Pune",CollegeType.OtherEngineering
        );
        mitwpu.addBranchDetails("CSE Engineering", new Branch(96.20, 96.30,240));
        mitwpu.addBranchDetails("IT Engineering", new Branch(95.70, 95.80,120));
        mitwpu.addBranchDetails("Electronics Engineering", new Branch(95.10, 95.20,180));
        mitwpu.addBranchDetails("Mechanical Engineering", new Branch(94.50, 94.60,240));
        map.put(214, mitwpu);

        // ================= PCCOE Pune =================
        Engineering pccoe = new Engineering(
                "PCCOE","info@pccoepune.com","02027653168","Pune",CollegeType.OtherEngineering
        );
        pccoe.addBranchDetails("CSE Engineering", new Branch(97.40, 97.50,180));
        pccoe.addBranchDetails("IT Engineering", new Branch(97.00, 97.10,120));
        pccoe.addBranchDetails("Electronics Engineering", new Branch(96.30, 96.40,180));
        pccoe.addBranchDetails("Mechanical Engineering", new Branch(95.60, 95.70,240));
        map.put(215, pccoe);

        // ================= SPIT Mumbai =================
        Engineering spit = new Engineering(
                "SPIT","info@spit.ac.in","02226708520","Mumbai",CollegeType.OtherEngineering
        );
        spit.addBranchDetails("CSE Engineering", new Branch(99.00, 99.10,120));
        spit.addBranchDetails("IT Engineering", new Branch(98.70, 98.80,60));
        spit.addBranchDetails("Electronics Engineering", new Branch(98.50, 98.60,120));
        spit.addBranchDetails("Mechanical Engineering", new Branch(97.40, 97.50,60));
        map.put(216, spit);

        // ================= DY Patil COE =================
        Engineering dyp = new Engineering(
                "DY Patil COE","info@dypcoeakurdi.ac.in","02027655600","Pune",CollegeType.OtherEngineering
        );
        dyp.addBranchDetails("CSE Engineering", new Branch(96.10, 96.20,180));
        dyp.addBranchDetails("IT Engineering", new Branch(95.60, 95.70,120));
        dyp.addBranchDetails("Electronics Engineering", new Branch(95.00, 95.10,180));
        dyp.addBranchDetails("Mechanical Engineering", new Branch(94.20, 94.30,240));
        map.put(217, dyp);

        // ================= Sinhgad COE =================
        Engineering scoe = new Engineering(
                "Sinhgad COE","info@sinhgad.edu","02024357200","Pune",CollegeType.OtherEngineering
        );
        scoe.addBranchDetails("CSE Engineering", new Branch(95.80, 95.90,180));
        scoe.addBranchDetails("IT Engineering", new Branch(95.30, 95.40,120));
        scoe.addBranchDetails("Electronics Engineering", new Branch(94.70, 94.80,180));
        scoe.addBranchDetails("Mechanical Engineering", new Branch(94.00, 94.10,240));
        map.put(218, scoe);

        // ================= KJ Somaiya =================
        Engineering somaiya = new Engineering(
                "KJ Somaiya","info@somaiya.edu","02221025252","Mumbai",CollegeType.OtherEngineering
        );
        somaiya.addBranchDetails("CSE Engineering", new Branch(97.80, 97.90,180));
        somaiya.addBranchDetails("IT Engineering", new Branch(97.30, 97.40,120));
        somaiya.addBranchDetails("Electronics Engineering", new Branch(96.60, 96.70,180));
        somaiya.addBranchDetails("Mechanical Engineering", new Branch(95.80, 95.90,180));
        map.put(219, somaiya);

        // ================= Walchand COE =================
        Engineering walchand = new Engineering(
                "Walchand COE","info@walchandsangli.ac.in","02332600700","Sangli",CollegeType.OtherEngineering
        );
        walchand.addBranchDetails("CSE Engineering", new Branch(96.90, 97.00,120));
        walchand.addBranchDetails("IT Engineering", new Branch(96.40, 96.50,60));
        walchand.addBranchDetails("Electrical Engineering", new Branch(95.90, 96.00,120));
        walchand.addBranchDetails("Mechanical Engineering", new Branch(95.20, 95.30,180));
        map.put(220, walchand);

        // ================= IIIT Pune =================
        Engineering iiitp = new Engineering(
                "IIIT Pune","info@iiitp.ac.in","02024387000","Pune",CollegeType.OtherEngineering
        );
        iiitp.addBranchDetails("CSE Engineering", new Branch(98.60, 98.70,120));
        iiitp.addBranchDetails("Electronics Engineering", new Branch(97.90, 98.00,60));
        map.put(221, iiitp);

        // ================= ICT Mumbai =================
        Engineering ict = new Engineering(
                "ICT Mumbai","info@ictmumbai.edu.in","02233612000","Mumbai",CollegeType.OtherEngineering
        );
        ict.addBranchDetails("Chemical Engineering", new Branch(98.90, 99.00,120));
        ict.addBranchDetails("Food Engineering", new Branch(97.80, 97.90,60));
        ict.addBranchDetails("Pharmaceutical Engineering", new Branch(97.60, 97.70,60));
        map.put(4003, ict);

        // ================= RV College =================
        Engineering rvce = new Engineering(
                "RV College of Engineering","info@rvce.edu.in","08067178021","Bengaluru",CollegeType.OtherEngineering
        );
        rvce.addBranchDetails("CSE Engineering", new Branch(98.90, 99.00,180));
        rvce.addBranchDetails("IT Engineering", new Branch(98.50, 98.60,120));
        rvce.addBranchDetails("Electronics Engineering", new Branch(98.00, 98.10,180));
        rvce.addBranchDetails("Mechanical Engineering", new Branch(97.20, 97.30,180));
        map.put(4101, rvce);

        // ================= BMS College =================
        Engineering bms = new Engineering(
                "BMS College of Engineering","info@bmsce.ac.in","08026614357","Bengaluru",CollegeType.OtherEngineering
        );
        bms.addBranchDetails("CSE Engineering", new Branch(98.30, 98.40,180));
        bms.addBranchDetails("IT Engineering", new Branch(97.90, 98.00,120));
        bms.addBranchDetails("Electronics Engineering", new Branch(97.30, 97.40,180));
        bms.addBranchDetails("Mechanical Engineering", new Branch(96.60, 96.70,180));
        map.put(4102, bms);

        // ================= Anna University CEG =================
        Engineering ceg = new Engineering(
                "Anna University CEG","info@annauniv.edu","04422358880","Chennai",CollegeType.OtherEngineering
        );
        ceg.addBranchDetails("CSE Engineering", new Branch(99.20, 99.30,120));
        ceg.addBranchDetails("IT Engineering", new Branch(98.90, 99.00,60));
        ceg.addBranchDetails("Electrical Engineering", new Branch(98.40, 98.50,120));
        ceg.addBranchDetails("Mechanical Engineering", new Branch(97.80, 97.90,180));
        map.put(4201, ceg);

        // ================= SSN College =================
        Engineering ssn = new Engineering(
                "SSN College of Engineering","info@ssn.edu.in","04427469700","Chennai",CollegeType.OtherEngineering
        );
        ssn.addBranchDetails("CSE Engineering", new Branch(98.40, 98.50,180));
        ssn.addBranchDetails("IT Engineering", new Branch(98.00, 98.10,120));
        ssn.addBranchDetails("Electronics Engineering", new Branch(97.50, 97.60,180));
        map.put(4202, ssn);

        // ================= DTU =================
        Engineering dtu = new Engineering(
                "Delhi Technological University","info@dtu.ac.in","01127871018","Delhi",CollegeType.OtherEngineering
        );
        dtu.addBranchDetails("CSE Engineering", new Branch(99.25, 99.35,180));
        dtu.addBranchDetails("IT Engineering", new Branch(98.95, 99.05,120));
        dtu.addBranchDetails("Electronics Engineering", new Branch(98.60, 98.70,180));
        dtu.addBranchDetails("Mechanical Engineering", new Branch(97.90, 98.00,240));
        map.put(4401, dtu);

        // ================= NSUT =================
        Engineering nsut = new Engineering(
                "NSUT Delhi","info@nsut.ac.in","01125099000","Delhi",CollegeType.OtherEngineering
        );
        nsut.addBranchDetails("CSE Engineering", new Branch(99.10, 99.20,180));
        nsut.addBranchDetails("IT Engineering", new Branch(98.80, 98.90,120));
        nsut.addBranchDetails("Electronics Engineering", new Branch(98.50, 98.60,180));
        map.put(4402, nsut);

        // ================= Jadavpur University =================
        Engineering ju = new Engineering("Jadavpur University","info@jadavpuruniversity.in","03324572227","Kolkata",CollegeType.OtherEngineering);
        ju.addBranchDetails("CSE Engineering", new Branch(99.10, 99.15,120));
        ju.addBranchDetails("IT Engineering", new Branch(98.85, 98.90,120));
        ju.addBranchDetails("Electrical Engineering", new Branch(98.30, 98.35,120));
        ju.addBranchDetails("Mechanical Engineering", new Branch(97.90, 98.00,180));
        ju.addBranchDetails("Civil Engineering", new Branch(97.10, 97.20,120));
        map.put(4501, ju);

        // ================= Thapar Institute =================
        Engineering thapar = new Engineering("Thapar Institute of Engineering","info@thapar.edu","01752395000","Punjab",CollegeType.OtherEngineering);
        thapar.addBranchDetails("CSE Engineering", new Branch(98.40, 98.50,180));
        thapar.addBranchDetails("IT Engineering", new Branch(97.90, 98.00,120));
        thapar.addBranchDetails("Electrical Engineering", new Branch(97.20, 97.30,120));
        thapar.addBranchDetails("Mechanical Engineering", new Branch(96.50, 96.60,240));
        thapar.addBranchDetails("Civil Engineering", new Branch(95.80, 95.90,180));
        map.put(4701, thapar);

        // ================= VIT Vellore =================
        Engineering vit = new Engineering("Vellore Institute of Technology (VIT)","info@vit.ac.in","04162202000","Vellore",CollegeType.OtherEngineering);
        vit.addBranchDetails("CSE Engineering", new Branch(98.60, 98.70,600));
        vit.addBranchDetails("IT Engineering", new Branch(98.20, 98.30,300));
        vit.addBranchDetails("Electronics Engineering", new Branch(97.50, 97.60,360));
        vit.addBranchDetails("Electrical Engineering", new Branch(97.00, 97.10,240));
        vit.addBranchDetails("Mechanical Engineering", new Branch(96.20, 96.30,420));
        map.put(7201, vit);

        // ================= SRM Chennai =================
        Engineering srm = new Engineering("SRM Institute of Science and Technology","info@srmist.edu.in","04427417000","Chennai",CollegeType.OtherEngineering);
        srm.addBranchDetails("CSE Engineering", new Branch(97.30, 97.40,600));
        srm.addBranchDetails("IT Engineering", new Branch(96.90, 97.00,300));
        srm.addBranchDetails("Electronics Engineering", new Branch(96.30, 96.40,300));
        srm.addBranchDetails("Electrical Engineering", new Branch(95.80, 95.90,240));
        srm.addBranchDetails("Mechanical Engineering", new Branch(95.00, 95.10,360));
        map.put(7202, srm);

        // ================= SASTRA University =================
        Engineering sastra = new Engineering("SASTRA University","info@sastra.edu","04362264101","Thanjavur",CollegeType.OtherEngineering);
        sastra.addBranchDetails("CSE Engineering", new Branch(97.80, 97.90,180));
        sastra.addBranchDetails("IT Engineering", new Branch(97.30, 97.40,120));
        sastra.addBranchDetails("Electronics Engineering", new Branch(96.60, 96.70,180));
        sastra.addBranchDetails("Mechanical Engineering", new Branch(95.90, 96.00,240));
        sastra.addBranchDetails("Civil Engineering", new Branch(95.20, 95.30,180));
        map.put(7203, sastra);

        // ================= JIIT Noida =================
        Engineering jiit = new Engineering("Jaypee Institute of Information Technology","info@jiit.ac.in","01202450000","Noida",CollegeType.OtherEngineering);
        jiit.addBranchDetails("CSE Engineering", new Branch(96.90, 97.00,180));
        jiit.addBranchDetails("IT Engineering", new Branch(96.30, 96.40,120));
        jiit.addBranchDetails("Electronics Engineering", new Branch(95.70, 95.80,120));
        jiit.addBranchDetails("Mechanical Engineering", new Branch(94.80, 94.90,180));
        map.put(7401, jiit);

        // ================= Amity University Noida =================
        Engineering amity = new Engineering("Amity University Noida","info@amity.edu","01204390000","Noida",CollegeType.OtherEngineering);
        amity.addBranchDetails("CSE Engineering", new Branch(95.80, 95.90,300));
        amity.addBranchDetails("IT Engineering", new Branch(95.20, 95.30,180));
        amity.addBranchDetails("Electronics Engineering", new Branch(94.60, 94.70,180));
        amity.addBranchDetails("Mechanical Engineering", new Branch(93.90, 94.00,240));
        map.put(7402, amity);

        // ================= Manipal University Jaipur =================
        Engineering muj = new Engineering("Manipal University Jaipur","info@jaipur.manipal.edu","01413990000","Jaipur",CollegeType.OtherEngineering);
        muj.addBranchDetails("CSE Engineering", new Branch(95.50, 95.60,240));
        muj.addBranchDetails("IT Engineering", new Branch(94.90, 95.00,180));
        muj.addBranchDetails("Electronics Engineering", new Branch(94.30, 94.40,180));
        muj.addBranchDetails("Mechanical Engineering", new Branch(93.60, 93.70,240));
        map.put(7501, muj);

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

    //********** Getters to access databse **********
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

    //******** Adding new Colleges to database *********
    public void addEngineeringColleges(int code, Engineering e){
        engineeringColleges.put(code, e);
    }

    public void addMedicalColleges(int code, Medical m){
        medicalColleges.put(code, m);
    }

    public void addPharmacyColleges(int code, Pharmacy ph){
        pharmacyColleges.put(code, ph);
    }

    public Engineering removeEngineeringColleges(int code){
        return engineeringColleges.remove(code);
    }

    public Medical removeMedicalColleges(int code){
        return medicalColleges.remove(code);
    }

    public Pharmacy removePharmacyColleges(int code){
        return pharmacyColleges.remove(code);
    }
}
