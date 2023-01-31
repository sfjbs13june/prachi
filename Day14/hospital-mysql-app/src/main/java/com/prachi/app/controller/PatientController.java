package com.prachi.app.controller;

import com.prachi.app.model.Appointment;
import com.prachi.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/patient")
    public class PatientController {

        @Autowired
        AppointmentRepository appointmentRepository;

        @GetMapping(value = "/myappointment")
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
