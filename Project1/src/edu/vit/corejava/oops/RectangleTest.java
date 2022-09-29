package edu.vit.corejava.oops;

public class RectangleTest {
    public static void main(String[] args)
    {
        Rectangle rect=new Rectangle();
        Rectangle rect1=new Rectangle(20,10);
        System.out.println("The area of the rectangle is "+rect.area());
        System.out.println("The area of the rectangle is "+rect1.area());
    }
}
