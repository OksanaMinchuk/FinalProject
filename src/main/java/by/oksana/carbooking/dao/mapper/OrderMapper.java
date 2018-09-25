package by.oksana.carbooking.dao.mapper;


import by.oksana.carbooking.model.Car;
import by.oksana.carbooking.model.Order;
import by.oksana.carbooking.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirstname(resultSet.getString("firstname"));
            user.setLastname(resultSet.getString("lastname"));
            user.setDateOfBirth(resultSet.getDate("dateOfBirth"));
            user.setNumPassport(resultSet.getString("numPassport"));
            user.setNumTel(resultSet.getString("numTel"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));

        Car car = new Car();
            car.setId(resultSet.getInt("id"));
            car.setModel(resultSet.getString("model"));
            car.setTransmission(resultSet.getString("transmission"));
            car.setPricePerDay(resultSet.getInt("pricePerDay"));
            car.setCount(resultSet.getInt("count"));

        Order order = new Order();
            order.setUser(user);
            order.setCar(car);
            //order.setModel(resultSet.getString("model"));
            //dateFrom, dateTo
            order.setFromCity(resultSet.getString("fromCity"));
            order.setToCity(resultSet.getString("toCity"));
        return order;
    }
}
