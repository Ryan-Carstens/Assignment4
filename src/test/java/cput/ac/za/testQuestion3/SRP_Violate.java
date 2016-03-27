package cput.ac.za.testQuestion3;

import cput.ac.za.question3.V_ImpDriveCar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sanXion on 2016/03/27.
 */
public class SRP_Violate {

    private V_ImpDriveCar v_impDriveCar;

    @Before
    public void setUp()
    {
        v_impDriveCar= new V_ImpDriveCar(100);
    }

    @Test
    public void testSpeed()
    {
        Assert.assertEquals(100, v_impDriveCar.getSpeed());
    }

    @Test
    public void testAccelerate()
    {
        Assert.assertEquals(120, v_impDriveCar.accelerate(20));
    }

    @Test
    public void testBrake()
    {
        Assert.assertEquals(80, v_impDriveCar.brake(20));
    }

    @Test
    public void testReverse()
    {
        Assert.assertEquals(true, v_impDriveCar.reverse(90));
    }

}
