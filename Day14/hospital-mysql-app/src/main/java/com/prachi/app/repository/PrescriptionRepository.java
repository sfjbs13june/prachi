package com.prachi.app.repository;

import com.prachi.app.model.Prescription;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionRepository extends CrudRepository<Prescription, Integer> {
}

