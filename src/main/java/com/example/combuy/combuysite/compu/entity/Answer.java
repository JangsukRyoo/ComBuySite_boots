package com.example.combuy.combuysite.compu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
public class Answer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qnanum;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "q_gpnum", nullable=false)
    private int q_gpnum;

    @Column(name = "q_gpseq", nullable=false)
    private int q_gpseq;

    @Column(name = "tabletab", nullable=false)
    private String tabletab;

    @Column(name = "title", nullable=false)
    private String title;

    @Column(name = "content", nullable=false)
    private String content;

    @Column(name = "regDate", nullable=false)
    private Date regDate;

    @Column(name = "vcount")
    private int vcount;



}
