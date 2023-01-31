package com.prachi.app.repository;

import com.prachi.app.model.Patients;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patients, Integer> {
}

