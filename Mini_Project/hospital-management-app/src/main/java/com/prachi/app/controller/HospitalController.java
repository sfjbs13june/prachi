package com.prachi.app.controller;


import com.prachi.app.model.Appointment;
import com.prachi.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/doctor")
public class HospitalController {

    @Autowired
    AppointmentRepository appoinmentRepo;
    private List<Appointment> doctorList= new ArrayList<>();


    /*@GetMapping("/doctorappointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName){

    }*/

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment = appoinmentRepo.save(appointment);
        return appointment;
    }

}
