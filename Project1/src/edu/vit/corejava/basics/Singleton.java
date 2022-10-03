package edu.vit.corejava.basics;
/**
 * As the name implies, a class is said to be singleton if it limits the number of objects of that class to one.
 * We can’t have more than a single object for such classes.
 * Singleton classes are employed extensively in concepts like Networking and Database Connectivity.
 */
class MySingleton
{
    public int x=10;
    static MySingleton instance=null;
    private MySingleton(){}//private constructor
    // this is static method which we can call without the need of the object
    public static MySingleton getInstance()
    {
        if(instance==null)
        instance=new MySingleton();

        return instance;
    }

}
public class Singleton {
    public static void main(String[] args) {
        MySingleton a=MySingleton.getInstance();
        MySingleton b=MySingleton.getInstance();
        // if we print the address of the object then we get the same address
        System.out.println("address of a: "+a);
        System.out.println("address of a: "+b);
        System.out.println("In the above lines its clearly evident that a,b point to same address in heap");
        a.x=a.x+10;
        System.out.println("The value of a.x is: "+a.x);
        System.out.println("The value of b.x is: "+b.x);
        System.out.println("In these above line we can see the same.");


    }
    
}
