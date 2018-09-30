package by.oksana.carbooking.service.impl;

import by.oksana.carbooking.dao.OrderDAO;
import by.oksana.carbooking.model.Order;
import by.oksana.carbooking.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDAO orderDao;

    @Override
    public void registerOrder(Order order) {
        orderDao.registerOrder(order);
    }

    @Override
    public long getDaysCountBetweenDates(Date dateFrom, Date dateTo) {
        return getDaysCountBetweenDates(dateFrom, dateTo);
    }
}
