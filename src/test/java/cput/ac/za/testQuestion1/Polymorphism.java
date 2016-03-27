package cput.ac.za.testQuestion1;

import cput.ac.za.question1.Porsche;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sanXion on 2016/03/27.
 */
public class Polymorphism {

    private Porsche porsche;

    @Before
    public void setUp()
    {
        //Here is where encapsulation takes place, when the self contained modules are accessed and set
        porsche = new Porsche(100000, 8000, 300, "CA911GT3", "GT3", true);
    }

    @Test
    public void TestPrice()
    {
        //Testing object(encapsulation) by comparing an expected price to the actual price of the object
        Assert.assertEquals(100000, porsche.getPrice(), 0);
    }

    @Test
    public void TestMileage()
    {
        Assert.assertEquals(8000, porsche.getMileage());
    }

    @Test
    public void TestMaxSpeed()
    {
        Assert.assertEquals(300, porsche.getMaxSpeed());
    }

    @Test
    public void TestRegistration_number()
    {
        Assert.assertEquals("CA911GT3", porsche.getRegistration_number());
    }

    @Test
    public void TestModel()
    {
        Assert.assertEquals("GT3", porsche.getModel());
    }

    @Test
    public void TestCustom()
    {
        Assert.assertEquals(true, porsche.getCustom());
    }
}
