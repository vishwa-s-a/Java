package edu.vit.corejava.inheritance;
// in abstract class we can have normal and abstract methods, constructor,properties
// but in interface we cannot have normal methods and constructors. but we can have constants,abstract methods
//      and default methods.
// abstract class cannot have objects but can only have sub-classes
abstract class Biscuit
{
    protected String name;
    protected Integer price;
    public Biscuit(){}
    public Biscuit(String name,Integer price)
    {
        this.name=name;
        this.price=price;
    }
    abstract public void setName(String name);// these are abstract classes so no body is there
    abstract public String getName();
    abstract public void setPrice(Integer price);
    public Integer getPrice()
    {
        return this.price;
    }// this is regular class so has a body and there is no compulsion that it has to be used by children
    abstract public String toString();

}
class Parle extends Biscuit
{
    public Parle(){};
    public Parle(String name,Integer price)
    {
        super(name,price);
    }
    @Override
    public void setName(String name)
    {
        this.name=name;
    }
    @Override
    public String getName()
    {
        return this.name;
    }
    @Override
    public void setPrice(Integer price)
    {
        this.price=price;
    }
    @Override
    public String toString()
    {
        return "Name: "+this.name+" Price: "+this.price;
    }
}
public class Abstraction2 {
    public static void main(String[] args)
    {
        Parle parle=new Parle("parle-g",5);
        System.out.println(parle.toString());
        parle.setPrice(15);
        System.out.println(parle.toString());

    }
}
