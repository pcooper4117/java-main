package com.techelevator.reservations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// this is the api server- this is what we start
@SpringBootApplication
public class HotelReservationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelReservationsApplication.class, args);
    }

}
