package com.carmanagement.entity;

import com.carmanagement.entity.request.CreateCarRequest;
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
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;

    public Car() {
    }

    public Car(CreateCarRequest request) {
        this.brand = request.getMake();
        this.model = request.getModel();
    }
}
