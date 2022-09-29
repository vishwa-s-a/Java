package edu.vit.corejava.oops;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle()
    {
        length=12.24;
        width=34.67;
    }
    public Rectangle(double a,double b)
    {
        length=a;
        width=b;
    }
    public double area()
    {
        return length*width;
    }
}
