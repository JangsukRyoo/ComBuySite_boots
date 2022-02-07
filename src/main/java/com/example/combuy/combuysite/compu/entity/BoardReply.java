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
public class BoardReply {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardnum;

    @Column(name = "writeId", nullable=false)
    private String writeId;

    @Column(name = "content", nullable=false)
    private String content;

    @Column(name = "regDate", nullable=false)
    private Date regDate;

}
