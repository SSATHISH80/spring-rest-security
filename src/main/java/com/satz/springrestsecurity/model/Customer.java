package com.satz.springrestsecurity.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "client_table")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
