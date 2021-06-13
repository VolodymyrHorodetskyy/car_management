package com.carmanagement.controller;

import com.carmanagement.entity.Car;
import com.carmanagement.entity.request.CreateCarRequest;
import com.carmanagement.service.CarService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * created by Volodymyr Horodetskyi
 */
@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAll() {
        return carService.getCars();
    }

    @PostMapping
    public Car createCar(@RequestBody @Valid CreateCarRequest request) {
        return carService.createCar(request);
    }

    @DeleteMapping
    public void deleteCar(@RequestParam Long id) {
        carService.deleteCar(id);
    }
}
