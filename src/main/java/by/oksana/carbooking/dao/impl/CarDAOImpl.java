package by.oksana.carbooking.dao.impl;

import by.oksana.carbooking.dao.CarDAO;
import by.oksana.carbooking.dao.mapper.CarMapper;
import by.oksana.carbooking.dao.mapper.ModelMapper;
import by.oksana.carbooking.model.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CarDAOImpl implements CarDAO {

    private final static String SQL_INSERT_CAR = "INSERT INTO cars (model, transmission, pricePerDay, count) value (?, ?, ?, ?)";

    private final static String SQL_SELECT_CAR_WHERE_MODEL = "SELECT * FROM cars WHERE model=?";

    private final static String SQL_SELECT_ALL_CAR_FROM_TABLE = "SELECT id, model, transmission, pricePerDay, count FROM cars";

    private final static String SQL_SELECT_DISTINCT_CAR_FROM_TABLE = "SELECT model FROM cars";

    private final static String SQL_DELETE_CAR = "DELETE FROM cars WHERE model = ?";

    private final static String SQL_UPDATE_CAR_ORDER = "UPDATE cars SET count=count-1 WHERE model=?";

    private final static String SQL_UPDATE_CAR_RETURN = "UPDATE cars SET count=count+1 WHERE model=?";

    private static final Logger log = LoggerFactory.getLogger(CarDAOImpl.class);

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
        log.info("get models from table ");
        return models;
    }

    @Override
    public Car getCarByModel(String model) {
        Car car = jdbcTemplate.queryForObject(SQL_SELECT_CAR_WHERE_MODEL, new Object[]{model}, new CarMapper());
        log.info("get car by model from table ");
        return car;
    }


    @Override
    public List<Car> listCar() {
        List<Car> cars = jdbcTemplate.query(SQL_SELECT_ALL_CAR_FROM_TABLE, new CarMapper());
        log.info("get list of all cars from table ");
        return cars;
    }

    @Override
    public void removeCar(String model) {
        jdbcTemplate.update(SQL_DELETE_CAR, model);
    }


    // ***********************************************
    @Override
    public Car orderCar(int count) {

        return null;
    }

    @Override
    public Car returnCar(int count) {

        return null;
    }
}
