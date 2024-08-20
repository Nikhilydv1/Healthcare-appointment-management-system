package com.example.healthcare.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User doctor;

    @ManyToOne
    private User patient;

    private LocalDateTime appointmentTime;

    // Getters and Setters
}
