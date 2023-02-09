package com.prachi.app.model;

import org.springframework.stereotype.Component;
@Component
public class Prescription {

    private String prescriptionId;
    private String appointmentId;
    private String description;
    private String patientName;
    private String doctorName;


    public Prescription(){}
}
