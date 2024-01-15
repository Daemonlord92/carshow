package com.binarymjm.carshow.controller;

import com.binarymjm.carshow.domains.Car;
import com.binarymjm.carshow.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/cars")
public class CarController {
    protected final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getCarList();
    }
}
