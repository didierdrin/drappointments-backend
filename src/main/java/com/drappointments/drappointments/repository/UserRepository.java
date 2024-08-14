package com.drappointments.drappointments.repository;

import com.drappointments.drappointments.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}