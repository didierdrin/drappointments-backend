package com.drappointments.drappointments.service;

import com.drappointments.drappointments.model.Appointments;
import com.drappointments.drappointments.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointments> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointments addAppointment(Appointments appointment) {
        return appointmentRepository.save(appointment);
    }
}