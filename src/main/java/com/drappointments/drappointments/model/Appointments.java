package com.drappointments.drappointments.model;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "APPOINTMENTS")
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "DOCTOR_NAME")
    private String doctor_name;

    @Column(name = "NURSE_NAME")
    private String nurse_name;

    @Column(name = "APPOINTMENT_REASON")
    private String appointment_reason;

    @Column(name = "DATE") 
    private String date; 


}