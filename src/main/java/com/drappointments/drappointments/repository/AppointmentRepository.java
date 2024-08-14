package com.drappointments.drappointments.repository;

import com.drappointments.drappointments.model.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointments, Integer> {
}