package com.example.Api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "table_student")
public class Student {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer student_Id;

    private String first_name;

    private String last_name;

    @Column( name = "email_address", unique = true, nullable = false)
    private String email;

}
