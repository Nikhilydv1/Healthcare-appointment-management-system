package com.example.healthcare.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;  // "PATIENT", "DOCTOR", "ADMIN"

    // Getters and Setters
}
