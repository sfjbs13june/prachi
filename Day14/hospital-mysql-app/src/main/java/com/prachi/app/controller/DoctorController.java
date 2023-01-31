package com.prachi.app.controller;

import com.prachi.app.model.Appointment;
import com.prachi.app.model.Prescription;
import com.prachi.app.repository.AppointmentRepository;
import com.prachi.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping(value = "/doctorappointment")
    public @ResponseBody
    Iterable<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @PostMapping(value = "/save")
    public @ResponseBody
    String store(@RequestBody final Appointment appointment) {
        appointmentRepository.save(appointment);
        return "saved";
    }
}
