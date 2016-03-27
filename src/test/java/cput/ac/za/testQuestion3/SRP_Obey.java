package cput.ac.za.testQuestion3;

import cput.ac.za.question3.ImpDriveCar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by sanXion on 2016/03/27.
 */
public class SRP_Obey {
    private ImpDriveCar impDriveCar;

    @Before
    public void setUp()
    {
        impDriveCar= new ImpDriveCar(100);
    }

    @Test
    public void testSpeed()
    {
        Assert.assertEquals(100, impDriveCar.getSpeed());
    }

    @Test
    public void testAccelerate()
    {
        Assert.assertEquals(120, impDriveCar.accelerate(20));
    }

    @Test
    public void testBrake()
    {
        Assert.assertEquals(80, impDriveCar.brake(20));
    }
}
