package by.oksana.carbooking.dao.impl;

import by.oksana.carbooking.dao.OrderDAO;
import by.oksana.carbooking.model.Car;
import by.oksana.carbooking.model.Order;
import by.oksana.carbooking.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OrderDAOImpl implements OrderDAO {

    private static  final String SQL_INSERT_ORDER_IN_HISTORY="INSERT INTO history (fromCity, toCity) VALUES(?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void registerOrder(Order order) {
        jdbcTemplate.update(SQL_INSERT_ORDER_IN_HISTORY, new Object[]{
//                order.getUser().getId(),
  //              order.getCar().getId(),
//                order.getModel(),
                order.getFromCity(),
                order.getToCity()
        });
    }

    // methods for calculating price
    public long getDaysCountBetweenDates(LocalDate dateFrom, LocalDate dateTo) {
        long days = ChronoUnit.DAYS.between(dateFrom, dateTo);
        return days;
    }




}
