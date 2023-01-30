package com.prachi.app;

import com.prachi.app.model.Appointment;
import com.prachi.app.model.Prescription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HospitalAppApplication.class, args);

		OptionsApp optionsApp = new OptionsApp();
		optionsApp.getPrescription("d2").ifPresent(prescription -> System.out.println(prescription.getDoctorName()));

		StreamApp streamApp=new StreamApp();
		System.out.println("employee Array");
		streamApp.getEmployeeArray().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee List");
		streamApp.getEmployeeList().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee Data");
		streamApp.getEmployeeData().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee builder");
		streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("using forEach method");
		streamApp.getEmployeeList().forEach(e -> e.salaryIncrement(10.0));
		streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));

	}

}
