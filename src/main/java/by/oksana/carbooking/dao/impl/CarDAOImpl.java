package by.oksana.carbooking.dao.impl;

import by.oksana.carbooking.dao.CarDAO;
import by.oksana.carbooking.dao.mapper.CarMapper;
import by.oksana.carbooking.dao.mapper.ModelMapper;
import by.oksana.carbooking.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO {

    private final static String SQL_INSERT_CAR = "INSERT INTO cars (model, transmission, pricePerDay, count) value (?, ?, ?, ?)";

    private final static String SQL_SELECT_CAR_WHERE_MODEL = "SELECT * FROM cars WHERE model=?";

    private final static String SQL_SELECT_ALL_CAR_FROM_TABLE = "SELECT id, model, transmission, pricePerDay, count FROM cars";

    private final static String SQL_SELECT_DISTINCT_CAR_FROM_TABLE = "SELECT model FROM cars";

    private final static String SQL_DELETE_CAR = "DELETE FROM cars WHERE model = ?";

    private final static String SQL_UPDATE_CAR_ORDER = "UPDATE cars SET count=count-1 WHERE model=?";

    private final static String SQL_UPDATE_CAR_RETURN = "UPDATE cars SET count=count+1 WHERE model=?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createCar(Car car) {
        jdbcTemplate.update(SQL_INSERT_CAR, new Object[] {
                car.getModel(),
                car.getTransmission(),
                car.getPricePerDay(),
                car.getCount()
        });
    }

    @Override
    public List<String> getModels() {
        List<String> models = jdbcTemplate.query(SQL_SELECT_DISTINCT_CAR_FROM_TABLE, new ModelMapper());
        return models;
    }

    @Override
    public Car getCarByModel(String model) {
        Car car = jdbcTemplate.queryForObject(SQL_SELECT_CAR_WHERE_MODEL, new Object[]{model}, new CarMapper());
        return car;
    }


    // запрос автомобилей из базы данных !!!!!!!!!
    @Override
    public List<Car> listCar() {
        List<Car> cars = jdbcTemplate.query(SQL_SELECT_ALL_CAR_FROM_TABLE, new CarMapper());
        return cars;
    }

    @Override
    public void removeCar(String model) {
        jdbcTemplate.update(SQL_DELETE_CAR, model);
    }


    // при заказе счетчик count уменьшается на 1, если в БД 0 шт, заказ недоступен ???????
    @Override
    public Car orderCar(int count) {

        return null;
    }

    // при возврате счетчик count увеличивается на 1 ?????
    @Override
    public Car returnCar(int count) {

        return null;
    }
}
