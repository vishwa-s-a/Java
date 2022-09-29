package horstmann.corejava.inheritance;

import java.util.Random;
import java.util.Scanner;

// this is a enum class, which comes under Enum super class
enum Size {SMALL,MEDIUM,LARGE,EXTRA_LARGE};
// we can also create one more enum class with constructors
enum Size1{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("xL");
    private String abbrevation;
    private Size1(String abbrevation)// this constructors should be private only
    {
        this.abbrevation=abbrevation;
    }
    public String toString()
    {
        return this.abbrevation;
    }
}
public class EnumerationClass {
    public static void main(String[] args) {
        // for above Size class we can object like this
        Size s=Size.SMALL;// here s is object of Size class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size: ");
        String input=sc.next().toUpperCase();
        // here basically we are setting the values of size1 to input given by user
        Size1 size1=Enum.valueOf(Size1.class,input);// Here Enum is super class in which all enum class come
        System.out.println("Size: "+size1);
        System.out.println("Abbrevated form: "+size1.toString());
        System.out.println("************************************************************");
        System.out.println("This is the usage of Class class");
        // this is method from Class class which is super class for all classes which keeps track of all class
        // and their objects
        System.out.println(size1.getClass().getName());
        var generator=new Random();// here generator is a object of Random class
        Class cl=generator.getClass();// here it returns "class java.util.Random". this as we know generator is Random class
        String name=cl.getName();// this returns java.util.Random as this is the class where generator belongs to
        System.out.println(cl);
        System.out.println(name);
        String className="java.util.Random";
        //Class cl1=Class.forName(className);
        //System.out.println(cl1);


    }

}
