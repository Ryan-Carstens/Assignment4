package cput.ac.za.question2;

import java.util.Date;

/**
 * Created by sanXion on 2016/03/27.
 */
public class AppointmentDetails {
    private String time;
    private long contactNumber;
    private String date;

    public AppointmentDetails()
    {

    }

    public AppointmentDetails(String time, long contactNumber, String date) {
        this.time = time;
        this.contactNumber = contactNumber;
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AppointmentDetails{" +
                "time='" + time + '\'' +
                ", contactNumber=" + contactNumber +
                ", date='" + date + '\'' +
                '}';
    }
}
