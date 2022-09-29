package edu.vit.corejava.oops;

import java.util.Scanner;

class Car
{
    private int currentSpeed;
    private int maxSpeed;
    private double milage;
    private String engineNumber;
    public Car()
    {
        maxSpeed=120;
        milage=12.9;
    }
    public void setCurrentSpeed(int speed)
    {
        this.currentSpeed=speed;
    }
    public void setEngineNumber(String number)
    {
        engineNumber=number;
    }
    public void accelertion()
    {
        System.out.println("Car is put on Acceleration mode");
        currentSpeed=maxSpeed;
        System.out.println("vroom  vrooooooooooooooooooooooooooooooooom");
    }
    public void display()
    {
        System.out.println("Current speed is: "+currentSpeed);
        System.out.println("Milage is: "+milage);
        System.out.println("Engine number is: "+engineNumber);
    }

}
public class Vehicles {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Car thar=new Car();
        thar.setEngineNumber("AS3244GHFK");
        thar.setCurrentSpeed(60);
        thar.display();
        thar.accelertion();
        thar.display();

    }
}
