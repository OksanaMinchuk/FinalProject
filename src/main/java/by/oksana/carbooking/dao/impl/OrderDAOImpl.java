package by.oksana.carbooking.dao.impl;

import by.oksana.carbooking.dao.OrderDAO;
import by.oksana.carbooking.model.Car;
import by.oksana.carbooking.model.Order;
import by.oksana.carbooking.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class OrderDAOImpl implements OrderDAO {

    private static  final String SQL_INSERT_ORDER_IN_HISTORY="INSERT INTO history (client_id, cars_id, fromCity, toCity) VALUES(?,?,?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void registerOrder(Order order) {
        jdbcTemplate.update(SQL_INSERT_ORDER_IN_HISTORY, new Object[]{
                order.getUser().getId(),
                order.getCar().getId(),
//                order.getModel(),
//                order.getDateFrom(),
//                order.getDateTo(),
                order.getFromCity(),
                order.getToCity()
        });

    }
}
