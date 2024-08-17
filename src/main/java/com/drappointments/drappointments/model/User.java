// src/main/java/com/drappointments/drappointments/model/User.java
package com.drappointments.drappointments.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "USERS")
public class User {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "REG_NUMBER")
    private int reg_number;

    @Column(name = "FIRST_NAME") 
    private String first_name; 

    @Column(name = "LAST_NAME") 
    private String last_name; 

    @Column(name = "GENDER") 
    private String gender;

    @Column(name = "QUALIFICATION")
    private String qualification;
    // Add other relevant fields
}