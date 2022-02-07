package com.example.combuy.combuysite.compu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class Ssd {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ssdNum;

    @Column(name = "name", nullable=false)
    private String name;

    @Column(name = "price", nullable=false)
    private int price;

    @Column(name = "ramAmount")
    private int ssdAmount;

    @Column(name = "pic", nullable=false)
    private String pic;

}
