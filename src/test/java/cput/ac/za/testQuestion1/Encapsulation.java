package cput.ac.za.testQuestion1;

import cput.ac.za.question1.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by sanXion on 2016/03/27.
 */
public class Encapsulation {
    private Car car;

    @Before
    public void setUp()
    {
        //Here is where encapsulation takes place, when the self contained modules are accessed and set
        car = new Car(10000, 5000, 150, "CA592345");
    }

    @Test
    public void TestPrice()
    {
        //Testing object(encapsulation) by comparing an expected price to the actual price of the object
        Assert.assertEquals(10000, car.getPrice(), 0);
    }

    @Test
    public void TestMileage()
    {
        Assert.assertEquals(5000, car.getMileage());
    }

    @Test
    public void TestMaxSpeed()
    {
        Assert.assertEquals(150, car.getMaxSpeed());
    }

    @Test
    public void TestRegistration_number()
    {
        Assert.assertEquals("CA592345", car.getRegistration_number());
    }
}
