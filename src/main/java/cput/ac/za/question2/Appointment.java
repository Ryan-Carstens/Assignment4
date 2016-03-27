package cput.ac.za.question2;

/**
 * Created by sanXion on 2016/03/27.
 */
public class Appointment {
    private String name;
    private String Surname;
    private String DoctorSeeing;
    private AppointmentDetails appointmentDetails;

    public Appointment()
    {

    }

    public Appointment(String name, String surname, String doctorSeeing, AppointmentDetails appointmentDetails) {
        this.name = name;
        this.Surname = surname;
        this.DoctorSeeing = doctorSeeing;
        this.appointmentDetails = appointmentDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDoctorSeeing() {
        return DoctorSeeing;
    }

    public void setDoctorSeeing(String doctorSeeing) {
        DoctorSeeing = doctorSeeing;
    }

    public AppointmentDetails getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(AppointmentDetails appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", DoctorSeeing='" + DoctorSeeing + '\'' +
                ", appointmentDetails=" + appointmentDetails +
                '}';
    }
}
