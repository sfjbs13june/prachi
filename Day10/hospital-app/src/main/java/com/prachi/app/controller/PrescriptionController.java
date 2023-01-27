package com.prachi.app.controller;

import com.prachi.app.model.Appointment;
import com.prachi.app.model.Prescription;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class PrescriptionController {
    Prescription prescription1 = new Prescription("p01","a01","fever","pat1","doc1");
    Prescription prescription2 = new Prescription("p02","a02","cold","pat2","doc2");
    @GetMapping("/viewprescription")
    public Map mapprescriptions() {
        Map Mapprescription = new HashMap();
        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "25-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc1","25-01-2023",prescription2);
        Mapprescription.put(prescription1.getDescription(), appointment1);
        Mapprescription.put(prescription2.getDescription(),appointment2);
        return Mapprescription;

    }
    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription, @RequestHeader("sessionid") String sessionid){

        return prescription;

    }
}
