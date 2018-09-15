package by.oksana.carbooking.model;

import java.util.Date;

public class Order {
    User user;
    Car car;
    String  model;
    Date dateFrom;
    Date dateTo;
    String fromCity;
    String toCity;

    public Order(User user, Car car, String model, Date dateFrom, Date dateTo, String fromCity, String toCity) {
        this.user = user;
        this.car = car;
        this.model = model;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public Order() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", car=" + car +
                ", model='" + model + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                '}';
    }
}
