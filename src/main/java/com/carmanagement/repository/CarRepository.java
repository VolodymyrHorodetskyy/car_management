package com.carmanagement.repository;

import com.carmanagement.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  created by Volodymyr Horodetskyi
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
