package com.prachi.app.repository;

import com.prachi.app.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface AppointmentRepository extends MongoRepository<Appointment, String> {
        public Appointment save(Appointment appointment);


    }

