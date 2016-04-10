package com.rental.repositories;

import com.rental.domain.Car;
import com.rental.repositories.rowmappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class CarsJDBCRepository implements CarsRepository{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CarsJDBCRepository(DataSource dataSource){
        this.jdbcTemplate= new JdbcTemplate(dataSource);
    }

    @Override
    public List<Car> getCars() {
        String selectQuery = "SELECT C.ID, MAKE, YEAR_BUILT, MODEL, TRIM, VIN, COLOR, PURCHASE_DATE, C.LOCATION_ID, C.RENTAL_STATUS_ID, RS.NAME as STATUS_NAME, " +
                " L.NAME AS LOCATION_NAME, LP.TITLE, LP.VALIDITY " +
                " FROM CAR_MASTER C INNER JOIN RENTAL_STATUS RS ON RS.ID = C.RENTAL_STATUS_ID " +
                " INNER JOIN LOCATION L ON L.ID=LOCATION_ID " +
                " LEFT OUTER JOIN LICENSE_PLATE LP ON LP.ID = C.LICENSE_PLATE_ID " +
                " ORDER BY C.ID";
        List<Car> cars = jdbcTemplate.query(selectQuery, new CarMapper());
        return cars;
    }
}
