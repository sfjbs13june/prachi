package com.prachi.app.controller;

import com.prachi.app.model.Appointment;
import com.prachi.app.model.Prescription;
import com.prachi.app.repository.AppointmentRepository;
import com.prachi.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class PrescriptionController {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    @GetMapping("/viewprescription")
    public @ResponseBody
    Iterable<Prescription> getAll() {
        return prescriptionRepository.findAll();
    }

    @PostMapping("/saveprescription")
    public @ResponseBody
    String store(@RequestBody final Prescription prescription) {
        prescriptionRepository.save(prescription);
        return "saved";
    }

    /*@DeleteMapping(value = "/delete")
    public @ResponseBody
    String store(@RequestParam("id") final int id) {
        appointmentRepository.deleteById(id);
        return "deleted";
    }*/
}
