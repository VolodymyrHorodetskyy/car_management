package com.carmanagement;

import com.carmanagement.domain.entity.Car;
import com.carmanagement.domain.request.CreateCarRequest;
import com.carmanagement.service.CarService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * created by Volodymyr Horodetskyi
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarmanagementApplicationTests {

    @Autowired
    private CarService carService;

    @Test
    public void a_getAllCarTest() {
        CreateCarRequest request = new CreateCarRequest();
        request.setMake("Toyota");
        request.setModel("Land Cruiser");
        carService.createCar(request);
        CreateCarRequest request2 = new CreateCarRequest();
        request.setMake("Toyota");
        request.setModel("Camry");
        carService.createCar(request2);
        assertEquals(2, carService.getCars().size());
    }

    @Test
    public void b_createCarTest() {
        CreateCarRequest request = new CreateCarRequest();
        request.setMake("Toyota");
        request.setModel("Land Cruiser");
        Car car = carService.createCar(request);
        assertEquals(request.getMake(), car.getBrand());
        assertEquals(request.getModel(), car.getModel());
    }

}
