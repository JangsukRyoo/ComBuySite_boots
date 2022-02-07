package com.example.combuy.combuysite.compu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class GuideView {

    @Column(name="guide")
    private String guide;

    @Column(name="cpu")
    private String cpu;

    @Column(name="cpuPrice")
    private int cpuPrice;

    @Column(name="cpuPic")
    private String cpuPic;

    @Column(name="mainboard")
    private String mainboard;

    @Column(name="mainboardPrice")
    private int mainboardPrice;

    @Column(name="mainboardPic")
    private String mainboardPic;

    @Column(name="ram")
    private String ram;

    @Column(name="ramAmount")
    private int ramAmount;

    @Column(name="ramPrice")
    private int ramPrice;

    @Column(name="ramPic")
    private String ramPic;

    @Column(name="gpu")
    private String gpu;

    @Column(name="gpuPrice")
    private int gpuPrice;

    @Column(name="gpuPic")
    private String gpuPic;

    @Column(name="ssd")
    private String ssd;

    @Column(name="ssdPrice")
    private int ssdPrice;

    @Column(name="ssdPic")
    private String ssdPic;

    @Column(name="ssdAmount")
    private int ssdAmount;


    @Column(name="cooler")
    private String cooler;

    @Column(name="coolerPrice")
    private int coolerPrice;

    @Column(name="coolerPic")
    private String coolerPic;

    @Column(name="power")
    private String power;

    @Column(name="powerPrice")
    private int powerPrice;

    @Column(name="powerPic")
    private String powerPic;

    @Column(name="caseN")
    private String caseN;

    @Column(name="caseNPrice")
    private int caseNPrice;

    @Column(name="caseNPic")
    private String caseNPic;

    @Column(name="catPic")
    private String catPic;

}
