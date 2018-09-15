package by.oksana.carbooking.dao.mapper;

import by.oksana.carbooking.model.Car;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car> {
    @Override
    public Car mapRow(ResultSet resultSet, int i) throws SQLException {
        Car car = new Car();
        car.setId(resultSet.getInt("id"));
        car.setModel(resultSet.getString("model"));
        car.setTransmission(resultSet.getString("transmission"));
        car.setPricePerDay(resultSet.getInt("pricePerDay"));
        car.setCount(resultSet.getInt("count"));
        return car;
    }
}
