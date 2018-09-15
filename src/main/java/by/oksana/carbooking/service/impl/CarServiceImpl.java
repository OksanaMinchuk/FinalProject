package by.oksana.carbooking.service.impl;

import by.oksana.carbooking.dao.CarDAO;
import by.oksana.carbooking.model.Car;
import by.oksana.carbooking.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarDAO carDao;

    @Override
    public void createCar(Car car) {
        carDao.createCar(car);
    }

    @Override
    public Car getCarByModel(String model) {
        return carDao.getCarByModel(model);
    }

    @Override
    public List listCar() {
        return carDao.listCar();
    }

    @Override
    public void removeCar(String model) {
        carDao.removeCar(model);
    }

    @Override
    public Car orderCar(int count) {
        return carDao.orderCar(count);
    }

    @Override
    public Car returnCar(int count) {
        return carDao.returnCar(count);
    }

    @Override
    public List<String> getModels() {
        return carDao.getModels();
    }
}
