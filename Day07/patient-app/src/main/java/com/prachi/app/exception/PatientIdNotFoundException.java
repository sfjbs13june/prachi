package com.prachi.app.exception;

import com.prachi.app.model.Patient;

public class PatientIdNotFoundException extends Exception {
    public PatientIdNotFoundException(String message){
        super(message);
    }

}
