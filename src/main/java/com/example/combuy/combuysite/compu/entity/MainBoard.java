package com.example.combuy.combuysite.compu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class MainBoard {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mbNum;

    @Column(name = "name", nullable=false)
    private String name;

    @Column(name = "price", nullable=false)
    private int price;

    @Column(name = "pic", nullable=false)
    private String pic;

}
