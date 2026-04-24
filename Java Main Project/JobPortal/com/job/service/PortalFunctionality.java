
package com.job.service;
import com.job.bean.*;

public interface PortalFunctionality {
    
    public void displayAllAvailableJobs();
    public void searchJobsAccordingToLocation(String location);
    public void searchJobAccordingToType(JobType type);
    public void searchJobAccodingToCandidateType(CandidateType type);
    public void searchJobById(int id);
    public void searchJobAccordingToRole(String role);

    public Candidate getCandidate(int code);
    public Job getJobById(int code);

}
