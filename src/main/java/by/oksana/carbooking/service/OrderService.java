package by.oksana.carbooking.service;

import by.oksana.carbooking.model.Order;

import java.util.Date;

public interface OrderService {
    void registerOrder(Order order);
    long getDaysCountBetweenDates(Date dateFrom, Date dateTo);
}
