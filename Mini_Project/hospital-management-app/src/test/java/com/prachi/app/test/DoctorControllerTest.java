package com.prachi.app.test;

import com.prachi.app.controller.DoctorController;
import com.prachi.app.model.Appointment;
import com.prachi.app.repository.AppointmentRepository;
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
public class DoctorControllerTest {

    @InjectMocks
    DoctorController doctorController;
    @Mock
    AppointmentRepository appointmentRepository;

    @Mock
    Appointment appointment;
    @BeforeEach
    void setUp(){
        appointmentRepository= Mockito.mock(AppointmentRepository.class);
        appointment= Mockito.mock(Appointment.class);
    }

    /*@Test
    public void TestGetAppointments() {
        List getAppointment = new ArrayList();
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(getAppointment);
        List result = doctorController.getAppointments("doc01");
        assertEquals(getAppointment, result);
    }
    @Test
    public void TestSaveAppointment() {
        Appointment saveAppointment=new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(saveAppointment);
        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(saveAppointment, result);
    }*/
}
