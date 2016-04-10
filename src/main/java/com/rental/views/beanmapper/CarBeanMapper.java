package com.rental.views.beanmapper;

import com.rental.domain.Car;
import com.rental.domain.LicensePlate;
import com.rental.utilities.DateFormatUtil;
import com.rental.views.beans.CarBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarBeanMapper {
    public List<CarBean> mapToBean(List<Car> cars){
        ArrayList<CarBean> carBeans = new ArrayList<>();
        if(cars != null && !cars.isEmpty()){
            for(Car car : cars){
                CarBean carBean = new CarBean();
                carBean.setID(car.getID());
                carBean.setMake(car.getMake());
                carBean.setModel(car.getModel());
                carBean.setColor(car.getColor());
                carBean.setLocation(car.getLocation().getName());
                carBean.setStatus(car.getRentalStatus().getName());
                carBean.setTrim(car.getTrim());
                carBean.setVin(car.getVin());
                LicensePlate licensePlate = car.getLicensePlate();
                if(licensePlate != null){
                    carBean.setLicenseTitle(licensePlate.getTitle());
                    carBean.setStickerValidity(DateFormatUtil.formatDateToString(licensePlate.getValidity()));
                }
                carBean.setPurchaseDate(DateFormatUtil.formatDateToString(car.getPurchaseDate()));
                carBean.setYear(car.getYear());
                carBeans.add(carBean);
            }
        }
     return carBeans;
    }
}
