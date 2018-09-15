package by.oksana.carbooking.dao;

import by.oksana.carbooking.model.Car;

import javax.sql.DataSource;
import java.util.List;

public interface CarDAO {
    void createCar(Car car);
    Car getCarByModel(String model);
    List listCar();
    void removeCar(String model);
    Car orderCar(int count);
    Car returnCar(int count);
    List<String> getModels();
}
