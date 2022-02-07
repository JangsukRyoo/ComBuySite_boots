package com.example.combuy.combuysite.compu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;

@Getter
@Setter
public class Login {

    @Id
    private String Id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "pw", nullable = false)
    private String pw;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "role", nullable = false)
    private String role;

}
