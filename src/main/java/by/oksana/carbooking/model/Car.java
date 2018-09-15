package by.oksana.carbooking.model;

public class Car {

    private int id;
    private String model;
    private String transmission;
    private int pricePerDay;
    private int count;

    public Car() {
    }

    public Car(int id, String model, String transmission, int pricePerDay, int count) {
        this.id = id;
        this.model = model;
        this.transmission = transmission;
        this.pricePerDay = pricePerDay;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", transmission='" + transmission + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
