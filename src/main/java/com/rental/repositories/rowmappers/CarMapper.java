package com.rental.repositories.rowmappers;

import com.rental.domain.Car;
import com.rental.domain.LicensePlate;
import com.rental.domain.Location;
import com.rental.domain.RentalStatus;
import org.springframework.cglib.core.Local;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class CarMapper implements RowMapper<Car> {

    @Override
    public Car mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Car car = new Car();
        car.setID(resultSet.getInt("ID"));
        car.setMake(resultSet.getString("MAKE"));
        car.setYear(resultSet.getInt("YEAR_BUILT"));
        car.setModel(resultSet.getString("MODEL"));
        car.setTrim(resultSet.getString("TRIM"));
        car.setVin(resultSet.getString("VIN"));
        car.setColor(resultSet.getString("COLOR"));
        car.setPurchaseDate(resultSet.getDate("PURCHASE_DATE"));
        mapStatus(resultSet, car);
        mapLocation(resultSet, car);
        mapLicensePlate(resultSet, car);
        return car;
    }

    private void mapLicensePlate(ResultSet resultSet, Car car) throws SQLException {
        LicensePlate licensePlate = new LicensePlate();
        licensePlate.setTitle(resultSet.getString("TITLE"));
        licensePlate.setValidity(resultSet.getDate("VALIDITY"));
        car.setLicensePlate(licensePlate);
    }

    private void mapLocation(ResultSet resultSet, Car car) throws SQLException {
        Location location = new Location();
        location.setID(resultSet.getInt("LOCATION_ID"));
        location.setName(resultSet.getString("LOCATION_NAME"));
        car.setLocation(location);
    }

    private void mapStatus(ResultSet resultSet, Car car) throws SQLException {
        RentalStatus rentalStatus = new RentalStatus();
        rentalStatus.setID(resultSet.getInt("RENTAL_STATUS_ID"));
        rentalStatus.setName(resultSet.getString("STATUS_NAME"));
        car.setRentalStatus(rentalStatus);
    }
}
