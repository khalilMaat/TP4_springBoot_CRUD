package com.example.tp4_springboot_crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="staff")
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String desgn;
    private String emailId;
}
