package com.prachi.app.test;

import com.prachi.app.controller.PrescriptionController;;
import com.prachi.app.model.Prescription;
import com.prachi.app.repository.PrescriptionRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest {

    @InjectMocks
    PrescriptionController prescriptionController;
    @Mock
    PrescriptionRepository prescriptionRepository;

    @Mock
    Prescription pres;
    @BeforeEach
    void setUp(){
        prescriptionRepository= Mockito.mock(PrescriptionRepository.class);
        pres= Mockito.mock(Prescription.class);
    }

    @Test
    public void TestGetAllPrescriptions() {
        List viewprescription = new ArrayList();
        when(prescriptionRepository.findAllByPatientName(anyString())).thenReturn(viewprescription);
        List result = prescriptionController.getAllPrescriptions("pat01");
        assertEquals(viewprescription, result);
    }
    @Test
    public void TestSavePrescription() {
        Prescription saveprescription = new Prescription();
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(saveprescription);
        Prescription result = prescriptionController.savePrescription(pres);
        assertEquals(saveprescription, result);
    }
}
