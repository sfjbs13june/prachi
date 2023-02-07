package com.prachi.app.controller;

import com.prachi.app.model.Prescription;
import com.prachi.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrescriptionController {

    @Autowired
    PrescriptionRepository prescriptionRepo;

    @GetMapping("/viewprescription")
    public List<Prescription> getAllPrescriptions(@RequestParam String patientName){
        return prescriptionRepo.findAllByPatientName(patientName);
    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepo.save(prescription);
        return prescription;
    }

}
