package com.prachi.app.model;

import org.springframework.stereotype.Component;

@Component
public class Appointment {

    private String appointmentId;
    private String patientName;
    private String doctorName;
    private String date;
    public Appointment(){}

    public Appointment(String appointmentId, String patientName, String doctorName, String date, Prescription prescription) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
        this.prescription = prescription;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }




    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDate() {
        return date;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    private Prescription prescription;





}
