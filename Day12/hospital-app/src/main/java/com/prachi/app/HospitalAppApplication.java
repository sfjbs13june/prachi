package com.prachi.app;

import com.prachi.app.model.Appointment;
import com.prachi.app.model.Prescription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalAppApplication.class, args);

		OptionsApp optionsApp = new OptionsApp();
		optionsApp.getPrescription("d2").ifPresent(prescription -> System.out.println(prescription.getDoctorName()));
	}

}
