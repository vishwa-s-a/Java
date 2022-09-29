package harry.corejava.basics;
import java.util.Scanner;
import java.lang.Math;
class Cylinder
{
    private double radius;
    private double height;
    public Cylinder(){}
    public Cylinder(double a, double b)
    {
        this.radius=a;
        this.height=b;
    }
    public double area()
    {
        return(2*Math.PI*radius*radius + 2*Math.PI*radius*height);
    }
    public double volume()
    {
        return(Math.PI*radius*radius*height);
    }

}
public class Pract2 {
    public static void main(String... args)
    {
        Cylinder cylinder=new Cylinder(12.2,15.5);
        System.out.println("Total surface area of the cylinder is: "+cylinder.area());
        System.out.println("Total volume of the cylinder is: "+cylinder.volume());


    }
}
