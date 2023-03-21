package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data  // para no tener que agregar los setters and getters con lombok
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private Long lastName;
    @Column(name = "email_address", unique = true, nullable = false)
    private Long email;

}
