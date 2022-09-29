// dynamic dispatch method is also termed as run time polymorphism
package harry.corejava.basics;
class Phone
{
    Phone()
    {
        System.out.println("Non parameterized constructor of Phone class");
    }
    public void showTime()
    {
        System.out.println("Time is 8:00 AM");
    }
    public void on()
    {
        System.out.println("Turning on phone");
    }
}
class SmartPhone extends Phone{
    public void greet()
    {
        System.out.println("Hello, good evening");
    }
    public void on()
    {
        System.out.println("Turning on smartPhone");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args)
    {
        Phone phone=new Phone();
        SmartPhone smartPhone=new SmartPhone();
        // these are always allowed to do so
        Phone obj=new SmartPhone();// this is also allowed, super class-> sub-class
        //SmartPhone obj=new Phone(); this is not allowed
        obj.showTime();
        obj.on();// it runs the on() function of smart phone as obj is a reference to SmartPhone
        //obj.greet()//not allowed this is dynamic method dispatch

    }

}
