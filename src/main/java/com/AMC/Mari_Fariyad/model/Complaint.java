package com.AMC.Mari_Fariyad.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Complaint {

    private Long id;
    private String citizenName;
    private String description;
    private String location;
    private String status;

}
