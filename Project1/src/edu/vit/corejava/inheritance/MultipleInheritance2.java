package edu.vit.corejava.inheritance;
/*
 * here we are demonstrating, how to implement multiple inheritance using interface and default methods
 * also to call default methods of interface class using super keyword example: PI1.super.show()
 */
interface PI1
{
    default void show()
    {
        System.out.println("Default 1");
    }
}
interface PI2
{
    default void show()
    {
        System.out.println("Default 2");
    }
}
class TestChild implements PI1,PI2{
    public void show()
    {
        System.out.println("calling show() method of PI1");
        // using super keyword to call the show() method of PS1 interface
        PI1.super.show();
        System.out.println("Calling show() method of PI2");
        // using super keyword to call the show() method of PS2 interface
        PI2.super.show();
    }
}
public class MultipleInheritance2 {
    public static void main(String[] args) {
        TestChild child=new TestChild();
        child.show();
    }
   
}
