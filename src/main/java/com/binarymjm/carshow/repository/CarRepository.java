package com.binarymjm.carshow.repository;

import com.binarymjm.carshow.domains.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
