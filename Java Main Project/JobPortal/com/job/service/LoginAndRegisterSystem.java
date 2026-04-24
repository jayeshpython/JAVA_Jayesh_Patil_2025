
package com.job.service;
import com.job.bean.*;
import com.job.dto.*;

public class LoginAndRegisterSystem {
    
    private CandidateRequest candReq = new CandidateRequest();
    private CandidateMain candMain = new CandidateMain();

    private RecruiterRequest recReq = new RecruiterRequest();
    private RecruiterMain recMain = new RecruiterMain();

    private AdminRequest adminReq = new AdminRequest();
    private AdminType adminType = new AdminType();

    public LoginAndRegisterSystem(){}

    //Candidate Registration
    public Candidate RegisterForCandidate(){
        Candidate cand = candReq.ValidateCandidateRegistration();
        candMain.addCandidate(cand);
        return candMain.getCandidateById(cand.getUserId());
    }

    //Candidate Login
    public Candidate CandidateLogin(){
        return candReq.ValidateCandidateLogin();
    }

    //Recruiter Registration
    public Recruiter RegisterFoRecruiter(){
        Recruiter rec = recReq.ValidateRecruiterRegistration();
        recMain.addRecruiter(rec);
        return recMain.getRecruiterById(rec.getUserId());
    }

    //Recruiter Login
    public Recruiter RecruiterLogin(){
        return recReq.ValidateRecruiterLogin();
    }

    //Admin Login
    public boolean AdminLogin(){
        return adminReq.ValidateAdminLogin();
    }
}
