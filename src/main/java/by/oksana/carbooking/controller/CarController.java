package by.oksana.carbooking.controller;

import by.oksana.carbooking.dao.impl.OrderDAOImpl;
import by.oksana.carbooking.model.Car;
import by.oksana.carbooking.model.Login;
import by.oksana.carbooking.model.Order;
import by.oksana.carbooking.model.User;
import by.oksana.carbooking.service.CarService;
import by.oksana.carbooking.service.OrderService;
import by.oksana.carbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;



@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private OrderService orderService;


    @RequestMapping(value = "/choosingProcess", method = RequestMethod.GET)
    public ModelAndView carListProcess(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("carchoosing");
        List<String> carModels = carService.getModels();
        List<Car> carInfo = carService.listCar();
        modelAndView.addObject("carModels", carModels);
        modelAndView.addObject("car", new Car());
        modelAndView.addObject("carInfoAttr", carInfo);
        return modelAndView;
    }
//***********************************


    @RequestMapping(value = "/orderCar", method = RequestMethod.POST)
    public ModelAndView carOrder(HttpServletRequest request, HttpServletResponse response,
                                 @ModelAttribute("car") Car car) {
        ModelAndView modelAndView = null;

        Car foundCar = carService.getCarByModel(car.getModel());

        if (foundCar != null) {
            modelAndView = new ModelAndView("redirect:/orderProcess");
            modelAndView.addObject("car", foundCar);

            //modelAndView.addObject("myCar", car.toString());  //show for check
        } else {
            modelAndView = new ModelAndView("errorPage");
            modelAndView.addObject("message", "Car model is not found");
        }
        return modelAndView;
    }


        //orderService.registerOrder(order);
        //modelAndView.addObject("myOrder", order.toString()); //show for check

        /*Car car = carService.getCarByModel(model);

        if (car != null) {
            modelAndView = new ModelAndView("carchoosing");
            modelAndView.addObject("model", car.getModel());
            modelAndView.addObject("dateFrom", dateFrom);
            modelAndView.addObject("dateTo", dateTo);
            modelAndView.addObject("fromCity", fromCity);
            modelAndView.addObject("toCity", toCity);
            // TO DO modelAndView.addObject("addOption", addOption);
        }
        else {
            modelAndView = new ModelAndView("errorPage");
            modelAndView.addObject("message", "Car model is not found");
        }*/

   /* @RequestMapping(value = "/orderInfo", method = RequestMethod.POST)
    public ModelAndView carOrder(HttpServletRequest request, HttpServletResponse response,
                                 @ModelAttribute("order") Order order) {
        ModelAndView modelAndView = new ModelAndView("carchoosing");

        //orderService.registerOrder(order);
        modelAndView.addObject("myOrder", order.toString()); //show for check


        return modelAndView;
    }*/



}
