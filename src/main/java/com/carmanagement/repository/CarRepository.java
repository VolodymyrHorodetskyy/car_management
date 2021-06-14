package com.carmanagement.repository;

import com.carmanagement.domain.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  created by Volodymyr Horodetskyi
 */
public interface CarRepository extends JpaRepository<Car, Long> {
}
