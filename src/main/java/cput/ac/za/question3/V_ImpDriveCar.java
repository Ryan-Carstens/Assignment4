package cput.ac.za.question3;

/**
 * Created by sanXion on 2016/03/27.
 */
public class V_ImpDriveCar implements V_DriveCar {
    private int speed;

    public V_ImpDriveCar(int speed)
    {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int accelerate(int amount)
    {
        return (speed + amount);
    }

    public int brake(int amount)
    {
        return (speed - amount);
    }

    public boolean reverse(int speed)
    {
       if(speed>0)
       {
           return false;
       }
       else
           return true;
    }

}
