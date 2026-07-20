package com.AMC.Mari_Fariyad.services;

import org.springframework.stereotype.Service;
// this are chnages
import com.AMC.Mari_Fariyad.model.Complaint;

@Service
public class ComplaintService {

    private Complaint complaint;

    public Complaint addComplaint(String citizenName, String description, String location)
    {
        Complaint newcomplaint = new Complaint();
        newcomplaint.setId(1L);
        newcomplaint.setCitizenName(citizenName);
        newcomplaint.setDescription(description);
        newcomplaint.setLocation(location);
        newcomplaint.setStatus("SUBMITED");

        this.complaint = newcomplaint;

        return this.complaint;
    }

    public Complaint getComplaint()
    {
        return this.complaint;
    }

    public Complaint updateStatus(String newStatus)
    {
        if(this.complaint != null)
        {
            this.complaint.setStatus(newStatus);
        }
        return complaint;
    }
}
