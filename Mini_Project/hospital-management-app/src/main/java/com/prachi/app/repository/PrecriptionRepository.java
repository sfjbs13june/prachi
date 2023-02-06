package com.prachi.app.repository;
import com.prachi.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public class PrecriptionRepository {
    @Repository
    public interface PrecriptionRespository extends MongoRepository<Prescription, String> {


    }
}
