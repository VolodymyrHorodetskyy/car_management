package com.carmanagement.controller;

import com.carmanagement.domain.entity.Car;
import com.carmanagement.domain.request.CreateCarRequest;
import com.carmanagement.service.CarService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * created by Volodymyr Horodetskyi
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAll(HttpServletRequest request) {
        return carService.getCars();
    }

    @PostMapping
    public Car createCar(@RequestBody @Valid CreateCarRequest request) {
        return carService.createCar(request);
    }

    @DeleteMapping("{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
