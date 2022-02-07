package com.example.combuy.combuysite.compu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class MapInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CompNum;

    @Column(name="name")
    private String name;

    @Column(name="webpage")
    private String webPage;

    @Column(name="addr")
    private String addr;

    @Column(name="mapAddr")
    private String mapAddr;

}
