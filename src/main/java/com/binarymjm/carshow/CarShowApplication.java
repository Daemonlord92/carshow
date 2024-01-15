package com.binarymjm.carshow;

import com.binarymjm.carshow.domains.Car;
import com.binarymjm.carshow.domains.Owner;
import com.binarymjm.carshow.repository.CarRepository;
import com.binarymjm.carshow.repository.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CarShowApplication implements CommandLineRunner {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private OwnerRepository ownerRepository;
    private static final Logger logger = LoggerFactory.getLogger(CarShowApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CarShowApplication.class, args);
        logger.info("App Started");
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("Bob", "Jones", 45);
        Owner owner2 = new Owner("Matt", "John", 24);
        ownerRepository.saveAll(Arrays.asList(owner1, owner2));
        List<Car> cars = Arrays.asList(
                new Car("Ford", "Mustang", "MUS-32442", 2024,"Red", 75000.00, owner1),
                new Car("Ford", "Mustang", "MUS-32442", 2024,"White", 75000.00, owner2),
                new Car("Ford", "Mustang", "MUS-32442", 2024,"Black", 75000.00),
                new Car("Ford", "F-150", "F150-32442", 2024,"Red", 75000.00, owner1),
                new Car("Ford", "F-150", "F150-32442", 2024,"White", 75000.00, owner2),
                new Car("Ford", "F-150", "F150-32442", 2024,"Black", 75000.00, owner1),
                new Car("Ford", "F-150", "F150-32442", 2024,"Grey", 75000.00, owner2)
        );
        carRepository.saveAll(cars);

        carRepository.findAll().forEach(car -> logger.info(car.getMake()+" "+ car.getModel()));
    }
}
