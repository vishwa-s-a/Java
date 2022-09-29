package edu.vit.corejava.inheritance;

/**
 * here we are discussing about abstraction class and its features
 * here all abstract methods should be put in a abstract class and abstract class cannot have a object
 *  instead the sub-class derived from abstract class can have a object
 * an abstract method does not have a body, instead given by sub-class.
 * an abstract class can contain regular and abstract methods
 */
abstract class Parent
{
    protected String name;// if declared as private then we cannot access in the following sub-class
    protected Integer age;
    protected Parent(){}
    protected Parent(String name, Integer age)
    {
        this.name=name;
        this.age=age;
    }
    abstract protected void setName(String name);// abstract method, and has no body
    abstract protected String getName();
    abstract protected void setAge(Integer age);
    abstract protected Integer getAge();
}
class Son extends Parent
{
    protected Son(){}
    protected Son(String name,Integer age)
    {
        super(name,age);
    }
    @Override
    public void setName(String name)
    {
        this.name=name;
    }
    @Override
    public void setAge(Integer age)
    {
        this.age=age;
    }
    @Override
    public String getName()
    {
        return this.name;
    }
    @Override
    public Integer getAge()
    {
        return this.age;
    }


}
public class Abstraction {
    public static void main(String[] args)
    {
        Son son=new Son("ram",24);
        System.out.println(son.getAge());
        System.out.println(son.getName());
        son.setName("bheem");
        System.out.println(son.getName());
    }
}
