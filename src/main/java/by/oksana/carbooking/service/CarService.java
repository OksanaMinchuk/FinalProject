package by.oksana.carbooking.service;

import by.oksana.carbooking.model.Car;

import java.util.List;

public interface CarService {
    void createCar(Car car);
    Car getCarByModel(String model);
    List listCar();
    void removeCar(String model);
    Car orderCar(int count);
    Car returnCar(int count);
    List<String> getModels();
}
