package by.oksana.carbooking.dao;

import by.oksana.carbooking.model.Order;

import java.time.LocalDate;

public interface OrderDAO {
    void registerOrder(Order order);
    long getDaysCountBetweenDates(LocalDate dateFrom, LocalDate dateTo);
}
