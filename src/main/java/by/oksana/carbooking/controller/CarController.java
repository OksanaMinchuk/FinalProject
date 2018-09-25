package by.oksana.carbooking.controller;

import by.oksana.carbooking.model.Car;
import by.oksana.carbooking.model.Login;
import by.oksana.carbooking.model.Order;
import by.oksana.carbooking.model.User;
import by.oksana.carbooking.service.CarService;
import by.oksana.carbooking.service.OrderService;
import by.oksana.carbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

/*

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateFrom;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTo;

    private String fromCity;
    private String toCity;
*/


    @RequestMapping(value = "/choosingProcess", method = RequestMethod.GET)
    public ModelAndView carListProcess(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("carchoosing");
        List<String> carModels = carService.getModels();
        List<Car> carInfo = carService.listCar();

        modelAndView.addObject("carModels", carModels);
        modelAndView.addObject("car", new Car());
        modelAndView.addObject("carInfoAttr", carInfo);
        modelAndView.addObject("car", new Order());


        return modelAndView;
    }
//***********************************


    @RequestMapping(value = "/orderCar", method = RequestMethod.POST)
    public ModelAndView carOrder(HttpServletRequest request, HttpServletResponse response,
                                 @ModelAttribute("car") Car car, Order order) {
        ModelAndView modelAndView = new ModelAndView("carchoosing");
        modelAndView.addObject("myCar", car.toString());  //show for check
        modelAndView.addObject("myOrder", order.toString()); //show for check




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
        return modelAndView;
    }
//***********************************

    //то же самое для addOption
//***********************************

    // методы о вычислении стоимости в какую часть проекта???
//    private long getDaysCountBetweenDates(LocalDate dateFrom, LocalDate dateTo) {
//        long days = ChronoUnit.DAYS.between(dateFrom, dateTo);
//        return days;
//    }
//***********************************


}
