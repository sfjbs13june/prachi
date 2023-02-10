package com.prachi.app.controller;

import com.prachi.app.model.Appointment;
import com.prachi.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")

public class PatientController {

    @Autowired
    AppointmentRepository appointmentRepository;


    @GetMapping("/myappointment")
    public List<Appointment> getMyAppointments(@RequestParam String patientName){
        return appointmentRepository.findByPatientName(patientName);
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment = appointmentRepository.save(appointment);
        return appointment;
    }
}
