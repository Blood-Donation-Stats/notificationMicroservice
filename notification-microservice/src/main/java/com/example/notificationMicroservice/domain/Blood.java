package com.example.notificationMicroservice.domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Blood")
@Data
public class Blood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String BloodType;
    private double AmountOfBlood;
}
