package cput.ac.za.question1;

/**
 * Created by sanXion on 2016/03/27.
 */
public class Porsche extends Car {
    private String model;
    private boolean custom;

    public Porsche()
    {

    }

    public Porsche(double price, int mileage, int maxSpeed, String registration_number, String model, boolean custom)
    {
        super(price, mileage, maxSpeed, registration_number);
        this.model = model;
        this.custom = custom;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getCustom() {
        return custom;
    }

    public void setCustom(boolean custom) {
        this.custom = custom;
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "price='" + super.getPrice() + '\'' +
                ", mileage='" + super.getMileage() + '\'' +
                ", maxSpeed='" + super.getMaxSpeed() + '\'' +
                ", registration_number='" + super.getRegistration_number() + '\'' +
                ", model='" + model + '\'' +
                ", custom=" + custom +
                '}';
    }
}
