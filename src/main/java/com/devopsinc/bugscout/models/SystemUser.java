package com.devopsinc.bugscout.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class SystemUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private int id;
    @Column(length = 50)
    private String username;
    @Column
    private String email;
    @Column
    private String role;
    @Column(length = 255)
    private String imageURL;

}
