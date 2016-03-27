package cput.ac.za.question1;

/**
 * Created by sanXion on 2016/03/27.
 */
public class Car implements Vehicle {
    private double price;
    private int mileage;
    private int maxSpeed;
    private String registration_number;

    public Car()
    {

    }

    public Car(double price, int mileage, int maxSpeed, String registration_number)
    {
        this.price = price;
        this.mileage = mileage;
        this.maxSpeed = maxSpeed;
        this.registration_number = registration_number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", registration_number=" + registration_number +
                '}';
    }
}
