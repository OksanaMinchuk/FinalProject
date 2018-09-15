package by.oksana.carbooking.dao.impl;

import by.oksana.carbooking.dao.OrderDAO;
import by.oksana.carbooking.model.Car;
import by.oksana.carbooking.model.Order;
import by.oksana.carbooking.model.User;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public void registerOrder(Order order) {
        Car car = new Car();
        User user = new User();

    }
}
