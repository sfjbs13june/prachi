package com.prachi.app.controller;

import com.prachi.app.exception.*;
import com.prachi.app.model.Patient;
import com.prachi.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;
    @PostMapping("/patient/save")
    public Patient savePatient(@RequestBody Patient patient) throws PatientIdNotFoundException, PatientNameNotFoundException, PatientAgeNotFoundException, PatientGenderNotFoundException, PatientDiseaseNotFoundException {
        if(patient.getId()==null){
            throw new PatientIdNotFoundException("There is no patient Id available");
        }
        if(patient.getName()==null){
            throw new PatientNameNotFoundException("There is no patient name available");
        }
        if(patient.getAge()==null){
            throw new PatientAgeNotFoundException("There is no patient age available");
        }
        if(patient.getGender()==null){
            throw new PatientGenderNotFoundException("There is no patient gender available");
        }
        if(patient.getDisease()==null){
            throw new PatientDiseaseNotFoundException("There is no patient disease available");
        }
        System.out.println(patient);
        return patient;
    }
    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, @RequestParam("disease") String disease, @RequestParam("age") String age){
        return patientService.updateDetail(patient,disease,age);
    }

}
