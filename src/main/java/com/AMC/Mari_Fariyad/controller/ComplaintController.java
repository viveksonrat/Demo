package com.AMC.Mari_Fariyad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AMC.Mari_Fariyad.model.Complaint;
import com.AMC.Mari_Fariyad.services.ComplaintService;

@RestController
public class ComplaintController {

    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @PostMapping("/complaint")
    public Complaint addComplaint(
            @RequestParam("citizenName") String citizenName,
            @RequestParam("description") String description,
            @RequestParam("location") String location) {
        return complaintService.addComplaint(citizenName, description, location);
    }

    @GetMapping("/complaint")
    public Complaint getComplaint() {
        return complaintService.getComplaint();
    }

    @PutMapping("complaint/status")
    public Complaint updateStatus(@RequestParam("status") String newStatus) {
        return complaintService.updateStatus(newStatus);
    }
}
