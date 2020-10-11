package com.example.notificationMicroservice.domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "People")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String BloodType;
    private String Email;

}
