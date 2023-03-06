package com.devopsinc.bugscout.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PersonInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "person_id")
    private int personId;

    @Column
    private String name;
    @Column
    private int age;
    @Column(name="phone")
    private String phoneNumber;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String zipcode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private SystemUser systemUser;


}
