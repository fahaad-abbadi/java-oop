package Intermediate;

public class Vehicle_01 {
    int no_of_wheels;
    int max_speed;
    int fuel_capacity;

    boolean isGear;


    //using a parameterized constructor
    public Vehicle_01(int no_of_wheels, int max_speed, boolean isGear)
    {
        this.no_of_wheels = no_of_wheels;
        this.max_speed = max_speed;
        this.isGear = isGear;
    }

    public void accelarate()
    {
        System.out.println("The vehicle is speeding up...");
    }

    public void stop()
    {
        System.out.println("Stopping...");
    }
}
