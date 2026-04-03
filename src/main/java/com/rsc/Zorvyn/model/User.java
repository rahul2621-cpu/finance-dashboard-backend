package com.rsc.Zorvyn.model;

import jakarta.persistence.*;
import lombok.Data;
import com.rsc.Zorvyn.model.Role;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean isActive = true;
}