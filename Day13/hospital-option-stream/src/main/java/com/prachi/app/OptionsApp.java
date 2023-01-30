package com.prachi.app;

import com.prachi.app.model.Prescription;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionsApp {

    public Optional<Prescription> getPrescription(String docname){
        Prescription prescription1 = new Prescription("1","a1","fever","pat1","doc1");
        Prescription prescription2 = new Prescription("2","a2","cold","pat2","doc2");
        Map<String,Prescription> data = new HashMap<>();
        data.put("d1",prescription1);
        data.put("d2",prescription2);

        Prescription result = data.get(docname);
        return Optional.ofNullable(result);
    }
}
