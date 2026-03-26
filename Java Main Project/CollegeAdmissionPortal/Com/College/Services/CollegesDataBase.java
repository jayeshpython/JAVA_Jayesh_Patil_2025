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
        
        // ================= IITs (Marks Based Cutoff) =================

        // IIT Bombay
        Engineering iitB = new Engineering("IIT Bombay","info@iitb.ac.in","02225722545","Mumbai",CollegeType.IIT);
        iitB.addBranchDetails("CSE Engineering", new Branch(280, 300,120));
        iitB.addBranchDetails("Electrical Engineering", new Branch(250, 265,100));
        iitB.addBranchDetails("Mechanical Engineering", new Branch(220, 240,150));
        iitB.addBranchDetails("Civil Engineering", new Branch(160, 180,60));
        iitB.addBranchDetails("Aerospace Engineering", new Branch(200, 220,120));
        map.put(1001, iitB);


        // IIT Delhi
        Engineering iitD = new Engineering("IIT Delhi","info@iitd.ac.in","01126591735","Delhi",CollegeType.IIT);
        iitD.addBranchDetails("CSE Engineering", new Branch(270, 285,110));
        iitD.addBranchDetails("Electrical Engineering", new Branch(245, 260,120));
        iitD.addBranchDetails("Mechanical Engineering", new Branch(215, 235,150));
        iitD.addBranchDetails("Civil Engineering", new Branch(155, 175,200));
        map.put(1002, iitD);


        // IIT Madras
        Engineering iitM = new Engineering("IIT Madras","info@iitm.ac.in","04422578000","Chennai",CollegeType.IIT);
        iitM.addBranchDetails("CSE Engineering", new Branch(275, 290,120));
        iitM.addBranchDetails("Electrical Engineering", new Branch(250, 265,150));
        iitM.addBranchDetails("Mechanical Engineering", new Branch(220, 235,150));
        iitM.addBranchDetails("Civil Engineering", new Branch(150, 170,180));
        map.put(1003, iitM);


        // IIT Kanpur
        Engineering iitK = new Engineering("IIT Kanpur","info@iitk.ac.in","05122597777","Kanpur",CollegeType.IIT);
        iitK.addBranchDetails("CSE Engineering", new Branch(260, 275,110));
        iitK.addBranchDetails("Electrical Engineering", new Branch(240, 255,120));
        iitK.addBranchDetails("Mechanical Engineering", new Branch(210, 230,150));
        iitK.addBranchDetails("Civil Engineering", new Branch(145, 165,180));
        map.put(1004, iitK);


        // IIT Kharagpur
        Engineering iitKgp = new Engineering("IIT Kharagpur","info@iitkgp.ac.in","03222255000","Kharagpur",CollegeType.IIT);
        iitKgp.addBranchDetails("CSE Engineering", new Branch(245, 260,120));
        iitKgp.addBranchDetails("Electrical Engineering", new Branch(230, 245,120));
        iitKgp.addBranchDetails("Mechanical Engineering", new Branch(200, 220,150));
        iitKgp.addBranchDetails("Civil Engineering", new Branch(140, 160,180));
        map.put(1005, iitKgp);


        // IIT Roorkee
        Engineering iitR = new Engineering("IIT Roorkee","info@iitr.ac.in","01332285000","Roorkee",CollegeType.IIT);
        iitR.addBranchDetails("CSE Engineering", new Branch(240, 255,120));
        iitR.addBranchDetails("Electrical Engineering", new Branch(225, 240,140));
        iitR.addBranchDetails("Mechanical Engineering", new Branch(195, 215,150));
        iitR.addBranchDetails("Civil Engineering", new Branch(135, 155,210));
        map.put(1006, iitR);


        // IIT Guwahati
        Engineering iitG = new Engineering("IIT Guwahati","info@iitg.ac.in","03612582200","Guwahati",CollegeType.IIT);
        iitG.addBranchDetails("CSE Engineering", new Branch(235, 250,120));
        iitG.addBranchDetails("Electrical Engineering", new Branch(220, 235,120));
        iitG.addBranchDetails("Mechanical Engineering", new Branch(190, 210,150));
        iitG.addBranchDetails("Civil Engineering", new Branch(130, 150,180));
        map.put(1007, iitG);


        // IIT Hyderabad
        Engineering iitH = new Engineering("IIT Hyderabad","info@iith.ac.in","04023016000","Hyderabad",CollegeType.IIT);
        iitH.addBranchDetails("CSE Engineering", new Branch(230, 245,120));
        iitH.addBranchDetails("Electrical Engineering", new Branch(215, 230,120));
        iitH.addBranchDetails("Mechanical Engineering", new Branch(185, 205,150));
        iitH.addBranchDetails("Civil Engineering", new Branch(125, 145,180));
        map.put(1008, iitH);


        // IIT BHU
        Engineering iitBHU = new Engineering("IIT BHU","info@iitbhu.ac.in","05422367100","Varanasi",CollegeType.IIT);
        iitBHU.addBranchDetails("CSE Engineering", new Branch(210, 225,110));
        iitBHU.addBranchDetails("Electrical Engineering", new Branch(195, 210,120));
        iitBHU.addBranchDetails("Mechanical Engineering", new Branch(175, 195,150));
        iitBHU.addBranchDetails("Civil Engineering", new Branch(120, 140,180));
        map.put(1009, iitBHU);


        // IIT Indore
        Engineering iitI = new Engineering("IIT Indore","info@iiti.ac.in","07312431000","Indore",CollegeType.IIT);
        iitI.addBranchDetails("CSE Engineering", new Branch(205, 220,110));
        iitI.addBranchDetails("Electrical Engineering", new Branch(190, 205,120));
        iitI.addBranchDetails("Mechanical Engineering", new Branch(170, 190,150));
        iitI.addBranchDetails("Civil Engineering", new Branch(115, 135,180));
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

        // ================= IISER Kolkata =================
        Engineering iiserK = new Engineering(
                "IISER Kolkata","info@iiserkol.ac.in","03366340000","Kolkata",CollegeType.IISER
        );
        iiserK.addBranchDetails("Physics", new Branch(180, 200,60));
        iiserK.addBranchDetails("Chemistry", new Branch(170, 185,60));
        iiserK.addBranchDetails("Biology", new Branch(165, 175,60));
        iiserK.addBranchDetails("Mathematics", new Branch(175, 190,60));
        iiserK.addBranchDetails("Earth & Environmental Science", new Branch(160, 170,40));
        map.put(8002, iiserK);


        // ================= IISER Mohali =================
        Engineering iiserM = new Engineering(
                "IISER Mohali","info@iisermohali.ac.in","01725036000","Mohali",CollegeType.IISER
        );
        iiserM.addBranchDetails("Physics", new Branch(165, 180,60));
        iiserM.addBranchDetails("Chemistry", new Branch(155, 170,60));
        iiserM.addBranchDetails("Biology", new Branch(150, 160,60));
        iiserM.addBranchDetails("Mathematics", new Branch(160, 175,60));
        iiserM.addBranchDetails("Earth & Environmental Science", new Branch(145, 155,40));
        map.put(8003, iiserM);


        // ================= IISER Bhopal =================
        Engineering iiserB = new Engineering(
                "IISER Bhopal","info@iiserb.ac.in","07552691000","Bhopal",CollegeType.IISER
        );
        iiserB.addBranchDetails("Physics", new Branch(160, 175,60));
        iiserB.addBranchDetails("Chemistry", new Branch(150, 165,60));
        iiserB.addBranchDetails("Biology", new Branch(145, 155,60));
        iiserB.addBranchDetails("Mathematics", new Branch(155, 170,60));
        iiserB.addBranchDetails("Earth & Environmental Science", new Branch(140, 150,40));

        // 🔹 Special branches
        iiserB.addBranchDetails("Economic Sciences", new Branch(175, 190,40));
        iiserB.addBranchDetails("EECS (Electrical & Computer Sciences)", new Branch(185, 200,60));
        iiserB.addBranchDetails("Data Science Engineering", new Branch(190, 210,60));
        map.put(8004, iiserB);


        // ================= IISER Thiruvananthapuram =================
        Engineering iiserTvm = new Engineering(
                "IISER Thiruvananthapuram","info@iisertvm.ac.in","04712770300",
                "Thiruvananthapuram",CollegeType.IISER
        );
        iiserTvm.addBranchDetails("Physics", new Branch(155, 170,60));
        iiserTvm.addBranchDetails("Chemistry", new Branch(145, 160,60));
        iiserTvm.addBranchDetails("Biology", new Branch(140, 150,60));
        iiserTvm.addBranchDetails("Mathematics", new Branch(150, 165,60));
        iiserTvm.addBranchDetails("Earth & Environmental Science", new Branch(135, 145,40));
        map.put(8005, iiserTvm);


        // ================= IISER Tirupati =================
        Engineering iiserT = new Engineering(
                "IISER Tirupati","info@iisertirupati.ac.in","08772210000",
                "Tirupati",CollegeType.IISER
        );
        iiserT.addBranchDetails("Physics", new Branch(140, 155,60));
        iiserT.addBranchDetails("Chemistry", new Branch(130, 145,60));
        iiserT.addBranchDetails("Biology", new Branch(125, 135,60));
        iiserT.addBranchDetails("Mathematics", new Branch(135, 150,60));
        iiserT.addBranchDetails("Earth & Environmental Science", new Branch(120, 130,40));
        map.put(8006, iiserT);


        // ================= IISER Berhampur =================
        Engineering iiserBr = new Engineering(
                "IISER Berhampur","info@iiserbpr.ac.in","06802300000",
                "Berhampur",CollegeType.IISER
        );
        iiserBr.addBranchDetails("Physics", new Branch(125, 140,60));
        iiserBr.addBranchDetails("Chemistry", new Branch(120, 135,60));
        iiserBr.addBranchDetails("Biology", new Branch(115, 125,60));
        iiserBr.addBranchDetails("Mathematics", new Branch(120, 135,60));
        iiserBr.addBranchDetails("Earth & Environmental Science", new Branch(110, 120,40));
        map.put(8007, iiserBr);

        
        // ================= BITS Pilani =================
        Engineering bitsP = new Engineering("BITS Pilani","info@pilani.bits-pilani.ac.in","01596242000","Pilani",CollegeType.BITS);

        bitsP.addBranchDetails("Computer Science Engineering", new Branch(330, 345,150));
        bitsP.addBranchDetails("Electronics and Communication Engineering", new Branch(315, 330,120));
        bitsP.addBranchDetails("Electrical and Electronics Engineering", new Branch(305, 320,150));
        bitsP.addBranchDetails("Electronics and Instrumentation Engineering", new Branch(300, 315,120));

        bitsP.addBranchDetails("Mechanical Engineering", new Branch(260, 280,180));
        bitsP.addBranchDetails("Chemical Engineering", new Branch(250, 270,120));
        bitsP.addBranchDetails("Civil Engineering", new Branch(235, 255,120));
        bitsP.addBranchDetails("Manufacturing Engineering", new Branch(225, 240,100));

        map.put(3001, bitsP);


        // ================= BITS Goa =================
        Engineering bitsG = new Engineering("BITS Goa","info@goa.bits-pilani.ac.in","08322580000","Goa",CollegeType.BITS);

        bitsG.addBranchDetails("Computer Science Engineering", new Branch(300, 315,120));
        bitsG.addBranchDetails("Electronics and Communication Engineering", new Branch(290, 305,120));
        bitsG.addBranchDetails("Electrical and Electronics Engineering", new Branch(280, 295,120));
        bitsG.addBranchDetails("Electronics and Instrumentation Engineering", new Branch(275, 290,120));

        bitsG.addBranchDetails("Mechanical Engineering", new Branch(240, 255,150));
        bitsG.addBranchDetails("Chemical Engineering", new Branch(235, 250,120));

        map.put(3002, bitsG);


        // ================= BITS Hyderabad =================
        Engineering bitsH = new Engineering("BITS Hyderabad","info@hyderabad.bits-pilani.ac.in","04066303833","Hyderabad",CollegeType.BITS);

        bitsH.addBranchDetails("Computer Science Engineering", new Branch(285, 300,120));
        bitsH.addBranchDetails("Electronics and Communication Engineering", new Branch(275, 290,120));
        bitsH.addBranchDetails("Electrical and Electronics Engineering", new Branch(265, 280,120));
        bitsH.addBranchDetails("Electronics and Instrumentation Engineering", new Branch(260, 275,120));

        bitsH.addBranchDetails("Mechanical Engineering", new Branch(225, 240,150));
        bitsH.addBranchDetails("Chemical Engineering", new Branch(220, 235,120));
        bitsH.addBranchDetails("Civil Engineering", new Branch(210, 225,120));

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

        // ========= OTHER TOP MEDICAL COLLEGES =========

        // 301 BJ Medical College - Pune
        Medical bj = new Medical("BJ Medical College", "9000000001", "MBBS", "Pune", CollegeType.OtherMedical);
        bj.addBranch("MBBS", new Branch(650, 665, 200));
        bj.addBranch("BAMS", new Branch(450, 470, 100));
        bj.addBranch("BHMS", new Branch(400, 420, 100));
        map.put(301, bj);

        // 302 Grant Medical College - Mumbai
        Medical grant = new Medical("Grant Medical College", "9000000002", "MBBS", "Mumbai", CollegeType.OtherMedical);
        grant.addBranch("MBBS", new Branch(645, 660, 180));
        grant.addBranch("BAMS", new Branch(445, 465, 90));
        grant.addBranch("BHMS", new Branch(395, 415, 90));
        map.put(302, grant);

        // 303 AFMC - Pune
        Medical afmc = new Medical("AFMC", "9000000003", "MBBS", "Pune", CollegeType.OtherMedical);
        afmc.addBranch("MBBS", new Branch(660, 675, 150));
        afmc.addBranch("BAMS", new Branch(460, 480, 80));
        afmc.addBranch("BHMS", new Branch(410, 430, 80));
        map.put(303, afmc);

        // 304 KEM Hospital - Mumbai
        Medical kem = new Medical("KEM Hospital", "9000000004", "MBBS", "Mumbai", CollegeType.OtherMedical);
        kem.addBranch("MBBS", new Branch(648, 662, 180));
        kem.addBranch("BAMS", new Branch(448, 468, 90));
        kem.addBranch("BHMS", new Branch(398, 418, 90));
        map.put(304, kem);

        // 305 JJ Medical College - Mumbai
        Medical jj = new Medical("JJ Medical College", "9000000005", "MBBS", "Mumbai", CollegeType.OtherMedical);
        jj.addBranch("MBBS", new Branch(640, 655, 170));
        jj.addBranch("BAMS", new Branch(440, 460, 90));
        jj.addBranch("BHMS", new Branch(390, 410, 90));
        map.put(305, jj);

        // 306 LTMMC - Mumbai
        Medical ltm = new Medical("LTMMC", "9000000006", "MBBS", "Mumbai", CollegeType.OtherMedical);
        ltm.addBranch("MBBS", new Branch(635, 650, 150));
        ltm.addBranch("BAMS", new Branch(435, 455, 85));
        ltm.addBranch("BHMS", new Branch(385, 405, 85));
        map.put(306, ltm);

        // 307 GMC Nagpur
        Medical gmcNag = new Medical("GMC Nagpur", "9000000007", "MBBS", "Nagpur", CollegeType.OtherMedical);
        gmcNag.addBranch("MBBS", new Branch(630, 645, 150));
        gmcNag.addBranch("BAMS", new Branch(430, 450, 80));
        gmcNag.addBranch("BHMS", new Branch(380, 400, 80));
        map.put(307, gmcNag);

        // 308 DY Patil Medical - Pune
        Medical dyp = new Medical("DY Patil Medical", "9000000008", "MBBS", "Pune", CollegeType.OtherMedical);
        dyp.addBranch("MBBS", new Branch(600, 630, 250));
        dyp.addBranch("BAMS", new Branch(420, 440, 100));
        dyp.addBranch("BHMS", new Branch(370, 390, 100));
        map.put(308, dyp);

        // 309 NKP Salve - Nagpur
        Medical nkp = new Medical("NKP Salve", "9000000009", "MBBS", "Nagpur", CollegeType.OtherMedical);
        nkp.addBranch("MBBS", new Branch(590, 620, 200));
        nkp.addBranch("BAMS", new Branch(410, 430, 100));
        nkp.addBranch("BHMS", new Branch(360, 380, 100));
        map.put(309, nkp);

        // 310 Seth GS Medical College - Mumbai
        Medical gs = new Medical("Seth GS Medical", "9000000010", "MBBS", "Mumbai", CollegeType.OtherMedical);
        gs.addBranch("MBBS", new Branch(645, 660, 180));
        gs.addBranch("BAMS", new Branch(445, 465, 90));
        gs.addBranch("BHMS", new Branch(395, 415, 90));
        map.put(310, gs);

        // =========  AIIMS COLLEGES =========

        // AIIMS New Delhi
        Medical delhi = new Medical("AIIMS New Delhi", "9000000011", "MBBS", "New Delhi", CollegeType.AIIMS);
        delhi.addBranch("MBBS", new Branch(700, 705, 132));
        delhi.addBranch("BAMS", new Branch(500, 510, 120));
        delhi.addBranch("BHMS", new Branch(450, 456, 120));
        map.put(311, delhi);

        // AIIMS Jodhpur
        Medical jodhpur = new Medical("AIIMS Jodhpur", "9000000012", "MBBS", "Rajasthan", CollegeType.AIIMS);
        jodhpur.addBranch("MBBS", new Branch(690, 700, 125));
        jodhpur.addBranch("BAMS", new Branch(490, 500, 110));
        jodhpur.addBranch("BHMS", new Branch(440, 450, 110));
        map.put(312, jodhpur);

        // AIIMS Bhubaneswar
        Medical bbsr = new Medical("AIIMS Bhubaneswar", "9000000013", "MBBS", "Odisha", CollegeType.AIIMS);
        bbsr.addBranch("MBBS", new Branch(688, 695, 125));
        bbsr.addBranch("BAMS", new Branch(485, 495, 110));
        bbsr.addBranch("BHMS", new Branch(435, 445, 110));
        map.put(313, bbsr);

        // AIIMS Bhopal
        Medical bhopal = new Medical("AIIMS Bhopal", "9000000014", "MBBS", "Madhya Pradesh", CollegeType.AIIMS);
        bhopal.addBranch("MBBS", new Branch(685, 693, 125));
        bhopal.addBranch("BAMS", new Branch(480, 490, 110));
        bhopal.addBranch("BHMS", new Branch(430, 440, 110));
        map.put(314, bhopal);

        // AIIMS Rishikesh
        Medical rishikesh = new Medical("AIIMS Rishikesh", "9000000015", "MBBS", "Uttarakhand", CollegeType.AIIMS);
        rishikesh.addBranch("MBBS", new Branch(682, 690, 125));
        rishikesh.addBranch("BAMS", new Branch(475, 485, 110));
        rishikesh.addBranch("BHMS", new Branch(425, 435, 110));
        map.put(315, rishikesh);

        // AIIMS Patna
        Medical patna = new Medical("AIIMS Patna", "9000000016", "MBBS", "Bihar", CollegeType.AIIMS);
        patna.addBranch("MBBS", new Branch(678, 685, 125));
        patna.addBranch("BAMS", new Branch(470, 480, 110));
        patna.addBranch("BHMS", new Branch(420, 430, 110));
        map.put(316, patna);

        // AIIMS Raipur
        Medical raipur = new Medical("AIIMS Raipur", "9000000017", "MBBS", "Chhattisgarh", CollegeType.AIIMS);
        raipur.addBranch("MBBS", new Branch(675, 682, 125));
        raipur.addBranch("BAMS", new Branch(465, 475, 110));
        raipur.addBranch("BHMS", new Branch(415, 425, 110));
        map.put(317, raipur);

        // AIIMS Nagpur
        Medical nagpur = new Medical("AIIMS Nagpur", "9000000018", "MBBS", "Maharashtra", CollegeType.AIIMS);
        nagpur.addBranch("MBBS", new Branch(670, 678, 120));
        nagpur.addBranch("BAMS", new Branch(460, 470, 105));
        nagpur.addBranch("BHMS", new Branch(410, 420, 105));
        map.put(318, nagpur);

        // AIIMS Bathinda
        Medical bathinda = new Medical("AIIMS Bathinda", "9000000019", "MBBS", "Punjab", CollegeType.AIIMS);
        bathinda.addBranch("MBBS", new Branch(665, 672, 120));
        bathinda.addBranch("BAMS", new Branch(455, 465, 100));
        bathinda.addBranch("BHMS", new Branch(405, 415, 100));
        map.put(319, bathinda);

        // AIIMS Kalyani
        Medical kalyani = new Medical("AIIMS Kalyani", "9000000020", "MBBS", "West Bengal", CollegeType.AIIMS);
        kalyani.addBranch("MBBS", new Branch(660, 668, 120));
        kalyani.addBranch("BAMS", new Branch(450, 460, 100));
        kalyani.addBranch("BHMS", new Branch(400, 410, 100));
        map.put(320, kalyani);

        // ========= NATIONAL TOP MEDICAL COLLEGES =========

        // 318 CMC Vellore
        Medical cmc = new Medical("Christian Medical College Vellore", "9000000018", "MBBS", "Vellore", CollegeType.OtherMedical);
        cmc.addBranch("MBBS", new Branch(670, 685, 150));
        cmc.addBranch("BAMS", new Branch(470, 490, 80));
        cmc.addBranch("BHMS", new Branch(420, 440, 80));
        map.put(318, cmc);

        // 319 KGMU Lucknow
        Medical kgmu = new Medical("King George's Medical University", "9000000019", "MBBS", "Lucknow", CollegeType.OtherMedical);
        kgmu.addBranch("MBBS", new Branch(660, 675, 200));
        kgmu.addBranch("BAMS", new Branch(460, 480, 100));
        kgmu.addBranch("BHMS", new Branch(410, 430, 100));
        map.put(319, kgmu);

        // 320 BHU – IMS Varanasi
        Medical bhu = new Medical("Banaras Hindu University – Institute of Medical Sciences", "9000000020", "MBBS", "Varanasi", CollegeType.OtherMedical);
        bhu.addBranch("MBBS", new Branch(665, 680, 150));
        bhu.addBranch("BAMS", new Branch(465, 485, 90));
        bhu.addBranch("BHMS", new Branch(415, 435, 90));
        map.put(320, bhu);

        // 321 Maulana Azad Medical College
        Medical mamc = new Medical("Maulana Azad Medical College", "9000000021", "MBBS", "New Delhi", CollegeType.OtherMedical);
        mamc.addBranch("MBBS", new Branch(675, 690, 250));
        mamc.addBranch("BAMS", new Branch(475, 495, 100));
        mamc.addBranch("BHMS", new Branch(425, 445, 100));
        map.put(321, mamc);

        // 322 Lady Hardinge Medical College
        Medical lhm = new Medical("Lady Hardinge Medical College", "9000000022", "MBBS", "New Delhi", CollegeType.OtherMedical);
        lhm.addBranch("MBBS", new Branch(660, 675, 200));
        lhm.addBranch("BAMS", new Branch(460, 480, 100));
        lhm.addBranch("BHMS", new Branch(410, 430, 100));
        map.put(322, lhm);

        // 323 AFMC Pune
        Medical afmc2 = new Medical("Armed Forces Medical College (AFMC) Pune", "9000000023", "MBBS", "Pune", CollegeType.OtherMedical);
        afmc2.addBranch("MBBS", new Branch(680, 695, 150));
        afmc2.addBranch("BAMS", new Branch(480, 500, 80));
        afmc2.addBranch("BHMS", new Branch(430, 450, 80));
        map.put(323, afmc2);

        // 324 St. John's Medical College
        Medical stjohn = new Medical("St. John's Medical College", "9000000024", "MBBS", "Bangalore", CollegeType.OtherMedical);
        stjohn.addBranch("MBBS", new Branch(650, 670, 150));
        stjohn.addBranch("BAMS", new Branch(450, 470, 90));
        stjohn.addBranch("BHMS", new Branch(400, 420, 90));
        map.put(324, stjohn);

        // 325 Grant Medical College & Sir J.J.
        Medical grantjj = new Medical("Grant Medical College & Sir J.J. Group of Hospitals", "9000000025", "MBBS", "Mumbai", CollegeType.OtherMedical);
        grantjj.addBranch("MBBS", new Branch(655, 670, 200));
        grantjj.addBranch("BAMS", new Branch(455, 475, 90));
        grantjj.addBranch("BHMS", new Branch(405, 425, 90));
        map.put(325, grantjj);

        // 326 Amrita School of Medicine
        Medical amrita = new Medical("Amrita School of Medicine, Kochi", "9000000026", "MBBS", "Kochi", CollegeType.OtherMedical);
        amrita.addBranch("MBBS", new Branch(640, 660, 150));
        amrita.addBranch("BAMS", new Branch(440, 460, 80));
        amrita.addBranch("BHMS", new Branch(390, 410, 80));
        map.put(326, amrita);

        // 327 Manipal College of Medical Sciences
        Medical manipal = new Medical("Manipal College of Medical Sciences", "9000000027", "MBBS", "Manipal", CollegeType.OtherMedical);
        manipal.addBranch("MBBS", new Branch(630, 650, 200));
        manipal.addBranch("BAMS", new Branch(430, 450, 100));
        manipal.addBranch("BHMS", new Branch(380, 400, 100));
        map.put(327, manipal);

        // 328 JIPMER Puducherry
        Medical jipmer = new Medical("JIPMER Puducherry", "9000000028", "MBBS", "Puducherry", CollegeType.OtherMedical);
        jipmer.addBranch("MBBS", new Branch(680, 695, 200));
        jipmer.addBranch("BAMS", new Branch(480, 500, 100));
        jipmer.addBranch("BHMS", new Branch(430, 450, 100));
        map.put(328, jipmer);

        // 329 KGMU Gorakhpur Campus
        Medical kgmugkp = new Medical("King George's Medical University – Gorakhpur Campus", "9000000029", "MBBS", "Gorakhpur", CollegeType.OtherMedical);
        kgmugkp.addBranch("MBBS", new Branch(620, 640, 150));
        kgmugkp.addBranch("BAMS", new Branch(420, 440, 80));
        kgmugkp.addBranch("BHMS", new Branch(370, 390, 80));
        map.put(329, kgmugkp);

        // 330 IMS BHU (duplicate structured entry)
        Medical bhu2 = new Medical("Institute of Medical Sciences, Banaras Hindu University", "9000000030", "MBBS", "Varanasi", CollegeType.OtherMedical);
        bhu2.addBranch("MBBS", new Branch(665, 680, 150));
        bhu2.addBranch("BAMS", new Branch(465, 485, 90));
        bhu2.addBranch("BHMS", new Branch(415, 435, 90));
        map.put(330, bhu2);

        return map;
    }


    // ================= PHARMACY COLLEGES =================
    private static HashMap<Integer, Pharmacy> createPharmacyCollegeDatabase() {

        HashMap<Integer, Pharmacy> map = new HashMap<>();

        // ========= PHARMACY COLLEGES =========

        // 401 Poona College of Pharmacy
        Pharmacy poona = new Pharmacy("Poona College of Pharmacy", "8111111111", "BPharm", "Pune", CollegeType.OtherPharmacy);
        poona.addBranch("BPharm", new Branch(120, 150, 120));
        poona.addBranch("DPharm", new Branch(90, 120, 60));
        map.put(401, poona);

        // 402 Bombay College of Pharmacy
        Pharmacy bombay = new Pharmacy("Bombay College of Pharmacy", "8222222222", "BPharm", "Mumbai", CollegeType.OtherPharmacy);
        bombay.addBranch("BPharm", new Branch(115, 145, 100));
        bombay.addBranch("DPharm", new Branch(85, 115, 60));
        map.put(402, bombay);

        // 403 DY Patil Pharmacy
        Pharmacy dypPharma = new Pharmacy("DY Patil Pharmacy", "8333333333", "BPharm", "Pune", CollegeType.OtherPharmacy);
        dypPharma.addBranch("BPharm", new Branch(110, 140, 150));
        dypPharma.addBranch("DPharm", new Branch(80, 110, 60));
        map.put(403, dypPharma);

        // 404 Sinhgad Pharmacy
        Pharmacy sinhgad = new Pharmacy("Sinhgad Pharmacy", "8444444444", "BPharm", "Pune", CollegeType.OtherPharmacy);
        sinhgad.addBranch("BPharm", new Branch(105, 135, 120));
        sinhgad.addBranch("DPharm", new Branch(75, 105, 60));
        map.put(404, sinhgad);

        // 405 KLE Pharmacy
        Pharmacy kle = new Pharmacy("KLE Pharmacy", "8555555555", "BPharm", "Belgaum", CollegeType.OtherPharmacy);
        kle.addBranch("BPharm", new Branch(110, 140, 100));
        kle.addBranch("DPharm", new Branch(80, 110, 60));
        map.put(405, kle);

        // 406 MIT Pharmacy
        Pharmacy mit = new Pharmacy("MIT Pharmacy", "8666666666", "BPharm", "Pune", CollegeType.OtherPharmacy);
        mit.addBranch("BPharm", new Branch(100, 130, 100));
        mit.addBranch("DPharm", new Branch(70, 100, 60));
        map.put(406, mit);

        // 407 SVKM Pharmacy
        Pharmacy svkm = new Pharmacy("SVKM Pharmacy", "8777777777", "BPharm", "Mumbai", CollegeType.OtherPharmacy);
        svkm.addBranch("BPharm", new Branch(115, 145, 120));
        svkm.addBranch("DPharm", new Branch(85, 115, 60));
        map.put(407, svkm);

        // 408 Bharati Vidyapeeth Pharmacy
        Pharmacy bv = new Pharmacy("Bharati Vidyapeeth Pharmacy", "8888888888", "BPharm", "Pune", CollegeType.OtherPharmacy);
        bv.addBranch("BPharm", new Branch(105, 135, 120));
        bv.addBranch("DPharm", new Branch(75, 105, 60));
        map.put(408, bv);

        // 409 PES Pharmacy
        Pharmacy pes = new Pharmacy("PES Pharmacy", "8999999999", "BPharm", "Aurangabad", CollegeType.OtherPharmacy);
        pes.addBranch("BPharm", new Branch(95, 125, 100));
        pes.addBranch("DPharm", new Branch(65, 95, 60));
        map.put(409, pes);

        // 410 RCPIPER
        Pharmacy rcpiper = new Pharmacy("RCPIPER", "8111222233", "BPharm", "Shirpur", CollegeType.OtherPharmacy);
        rcpiper.addBranch("BPharm", new Branch(115, 150, 120));
        rcpiper.addBranch("DPharm", new Branch(85, 115, 60));
        map.put(410, rcpiper);
        
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
