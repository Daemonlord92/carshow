package com.binarymjm.carshow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarShowApplication {

    private static final Logger logger = LoggerFactory.getLogger(CarShowApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CarShowApplication.class, args);
        logger.info("App Started");
    }

}
