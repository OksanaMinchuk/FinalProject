package by.oksana.carbooking.model;

public class AdditionalOption {
    private String addOption;
    private int pricePerDay;

    public AdditionalOption() {
    }

    public String getAddOption() {
        return addOption;
    }

    public void setAddOption(String addOption) {
        this.addOption = addOption;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "AdditionalOption{" +
                "addOption='" + addOption + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
