package com.academy.academy.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column(name= "user",nullable = false)
    @Getter @Setter
    private String user;

    @Column(name= "email",nullable = false)
    @Getter @Setter
    private String email;

    @Column(name= "theme",nullable = false)
    @Getter @Setter
    private String theme;

    @Column(name= "password",nullable = false)
    @Getter @Setter
    private String password;

    @Column(name= "email_verified_at",nullable = false)
    @Getter @Setter
    private String email_verified_at;

    @Column(name= "remember_token",nullable = false)
    @Getter @Setter
    private String remember_token;
}
