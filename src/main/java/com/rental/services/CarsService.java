package com.rental.services;

import com.rental.domain.Car;
import com.rental.repositories.CarsJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {


    @Autowired private CarsJDBCRepository repository;

    public List<Car> getAllCars(){
        return repository.getCars();
    }
}
