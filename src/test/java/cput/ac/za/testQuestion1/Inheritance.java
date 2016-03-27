package cput.ac.za.testQuestion1;

import cput.ac.za.question1.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by sanXion on 2016/03/27.
 */
public class Inheritance {

    private Car BMW;

    @Before
    public void setUp()
    {
        //Here is where encapsulation takes place, when the self contained modules are accessed and set
        BMW = new Car(50000, 12000, 230, "CA900900");
    }

    @Test
    public void TestPrice()
    {
        //Testing object(encapsulation) by comparing an expected price to the actual price of the object
        Assert.assertEquals(50000, BMW.getPrice(), 0);
    }

    @Test
    public void TestMileage()
    {
        Assert.assertEquals(12000, BMW.getMileage());
    }

    @Test
    public void TestMaxSpeed()
    {
        Assert.assertEquals(230, BMW.getMaxSpeed());
    }

    @Test
    public void TestRegistration_number()
    {
        Assert.assertEquals("CA900900", BMW.getRegistration_number());
    }
}
