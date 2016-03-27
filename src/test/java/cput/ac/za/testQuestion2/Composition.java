package cput.ac.za.testQuestion2;

import cput.ac.za.question2.Appointment;
import cput.ac.za.question2.AppointmentDetails;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sanXion on 2016/03/27.
 */
public class Composition {
    private AppointmentDetails appointmentDetails;
    private Appointment appointment;

    @Before
    public void setUp()
    {
        appointmentDetails = new AppointmentDetails("10:00",7826565,"27/04/2016");
        appointment = new Appointment("Ryan","Charles","Dr.Henry",appointmentDetails);
    }

    @Test
    public void testAppointmentTime()
    {
        Assert.assertEquals("10:00", appointment.getAppointmentDetails().getTime());
    }

    @Test
    public void testContactNumber()
    {
        Assert.assertEquals(7826565, appointment.getAppointmentDetails().getContactNumber());
    }

    @Test
    public void testAppointmentDate()
    {
        Assert.assertEquals("27/04/2016", appointment.getAppointmentDetails().getDate());
    }

    @Test
    public void testGetFullName()
    {
        Assert.assertEquals("Ryan Charles",appointment.getName() + " " + appointment.getSurname());
    }
}
