package com.carmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * created by Volodymyr Horodetskyi
 */
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
