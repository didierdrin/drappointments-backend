package com.drappointments.drappointments.controller;

import com.drappointments.drappointments.model.Appointments;
import com.drappointments.drappointments.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointments> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @PostMapping
    public Appointments addAppointment(@RequestBody Appointments appointment) {
        return appointmentService.addAppointment(appointment);
    }
}