package com.prachi.app.service;

import com.prachi.app.model.Hospital;
import com.prachi.app.model.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.amqp.core.AmqpTemplate;

import org.springframework.test.context.ActiveProfiles;

@RunWith(MockitoJUnitRunner.class)
@ActiveProfiles(value = "test")
public class RabbitMQSenderTest {

  @InjectMocks
  RabbitMQSender rabbitMQSender;

  @Mock
  AmqpTemplate amqpTemplate;

  @Test
  public void sendHospitalTest() {
    Hospital hospital = new Hospital();
    rabbitMQSender.sendHospital(hospital);
  }

  @Test
  public void sendPatientTest() {
    Patient patient = new Patient();
    rabbitMQSender.sendPatient(patient);
  }
}
