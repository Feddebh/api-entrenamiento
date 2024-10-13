package com.feddebh.fitbot.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")

public class Usuario {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL usará auto-incremento
    private Long id;

    @Column(nullable = false) // Hace que el campo sea obligatorio en la base de datos
    private String nombre;

    @Column(nullable = false)
    private String nivel; // Ej. "principiante", "intermedio", "avanzado"

}
