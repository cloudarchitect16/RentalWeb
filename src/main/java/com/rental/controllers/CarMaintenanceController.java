package com.rental.controllers;

import com.rental.domain.Car;
import com.rental.services.CarsService;
import com.rental.views.beanmapper.CarBeanMapper;
import com.rental.views.beans.CarBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarMaintenanceController {

    @Autowired private CarsService carsService;
    @Autowired private CarBeanMapper beanMapper;

    @RequestMapping(value="/cars", method = RequestMethod.GET)
    public ModelAndView showAllCars(){
        List<Car> cars =  carsService.getAllCars();
        List<CarBean> carBeans = beanMapper.mapToBean(cars);
        ModelMap map = new ModelMap();
        map.addAttribute("message", "Cars Maintenance");
        map.addAttribute("cars", carBeans);
        return new ModelAndView("carList", map);
    }
}
