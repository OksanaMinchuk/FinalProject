package by.oksana.carbooking.controller;

import by.oksana.carbooking.model.Car;
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
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/orderProcess", method = RequestMethod.GET)
    public ModelAndView orderInfo (HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("order");
        Order order = new Order();
//        User user = new User();
//        User currentUser = userService.selectUser(user.getUsername());
        modelAndView.addObject("order", new Order());
        modelAndView.addObject("fromCity", order.getFromCity());
        modelAndView.addObject("toCity", order.getToCity());
        //modelAndView.addObject(currentUser.getId());
        return modelAndView;
    }

    @RequestMapping(value = "/orderInfo", method = RequestMethod.POST)
    public ModelAndView orderInfoForHistory (HttpServletRequest request, HttpServletResponse response,
                                             @ModelAttribute("order") Order order) {
        ModelAndView modelAndView = null;
        modelAndView = new ModelAndView("order");
        modelAndView.addObject("order", order);
        modelAndView.addObject("message", "Thank you!!");


        /*Car car = carService.getCarByModel(car.getModel());
        Order currentOrder = new Order();
        long days = orderService.getDaysCountBetweenDates(order.getDateFrom(), order.getDateTo());
        long sumPrice = days*car.getPricePerDay();
        modelAndView.addObject("sumPrice", sumPrice);*/
        //orderService.registerOrder(order);


        return modelAndView;
    }


}
