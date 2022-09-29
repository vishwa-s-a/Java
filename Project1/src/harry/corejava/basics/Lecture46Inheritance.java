package harry.corejava.basics;
class Base
{
    Base()
    {
        System.out.println("Base class constructor is called");
    }
    Base(int x)
    {
        System.out.println("Base class constructor is overloaded");
    }
}
class Derived extends Base{
    Derived()
    {
        System.out.println("Derived class constructor is called");
    }
    Derived(int x, int y) {
        super(x);
        System.out.println("Derived class constructor is overloaded");
    }
}
class DerivedChild extends Derived
{
    DerivedChild()
    {
        System.out.println("DerivedChild constructor is called");
    }
    DerivedChild(int x,int y, int z)
    {
        super(x,y);
        System.out.println("DerivedChild class constructor is overloaded");
    }
}
public class Lecture46Inheritance {
    public static void main(String[] args)
    {
        Base base=new Base();
        System.out.println("*****************************");
        Base base1=new Base(19);
        System.out.println("*****************************");
        Derived derived = new Derived();
        System.out.println("*******************************");
        Derived derived1=new Derived(12,14);
        System.out.println("*****************************");
        DerivedChild ram=new DerivedChild();// here default constructors of all classes are called in output
        System.out.println("*************************8***");
        DerivedChild bheem = new DerivedChild(1,2,3);
        System.out.println("***********************************");
    }
}
