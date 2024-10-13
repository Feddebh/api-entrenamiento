package com.feddebh.fitbot.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ejercicios")
@Data
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String tipo; // Ej. "fuerza", "cardio"

    @Column(nullable = false)
    private int duracion; // Duración en minutos




}
