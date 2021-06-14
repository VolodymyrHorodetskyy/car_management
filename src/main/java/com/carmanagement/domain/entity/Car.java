package com.carmanagement.domain.entity;

import com.carmanagement.domain.request.CreateCarRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;

    public Car(CreateCarRequest request) {
        this.brand = request.getMake();
        this.model = request.getModel();
    }
}
