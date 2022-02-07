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
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;

    @Column(name = "writer", nullable=false)
    private String writer;

    @Column(name = "title", nullable=false)
    private String title;

    @Column(name = "content", nullable=false)
    private String content;

    @Column(name = "regdate", nullable=false)
    private Date regdate;

    @Column(name = "vcount", nullable=false)
    private int vcount;


}
