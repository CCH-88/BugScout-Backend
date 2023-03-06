package com.devopsinc.bugscout.models;

import com.devopsinc.bugscout.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class SystemUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "user_id")
    private int userId;
    @Column(length = 50)
    private String username;
    private String email;

    @Column
    private String imageURL;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    //
    @OneToOne(mappedBy = "systemUser")
    private PersonInfo personInfo;
}
