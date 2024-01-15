package com.binarymjm.carshow.service;

import com.binarymjm.carshow.domains.Car;
import com.binarymjm.carshow.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    protected final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCarList() {
        return carRepository.findAll();
    }
}
