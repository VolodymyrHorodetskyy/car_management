package com.carmanagement.service;

import com.carmanagement.entity.Car;
import com.carmanagement.entity.request.CreateCarRequest;
import com.carmanagement.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by Volodymyr Horodetksyi
 */
@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * @return collection of all cars
     */
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    /**
     * @param request
     * @return created car
     */
    public Car createCar(CreateCarRequest request) {
        return carRepository.save(new Car(request));
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
