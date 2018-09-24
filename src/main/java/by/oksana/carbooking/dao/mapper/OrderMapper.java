package by.oksana.carbooking.dao.mapper;


import by.oksana.carbooking.model.Order;
import by.oksana.carbooking.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        Order order = new Order();
        order.setUser((User) resultSet.getObject("firstname"));
        order.setUser((User) resultSet.getObject("lastname"));
        order.setModel(resultSet.getString("model"));
        // add Date dateFrom, dateTo
        order.setFromCity(resultSet.getString("fromCity"));
        order.setToCity(resultSet.getString("toCity"));


        return order;
    }
}
