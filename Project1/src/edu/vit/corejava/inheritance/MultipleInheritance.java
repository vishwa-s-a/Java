package edu.vit.corejava.inheritance;
/**
 * java only supports single,multilevel,hierarchical inheritances. but does not support multiple inheritance.
 * but multiple inheritance can be implemented using interface, we see the same in below code.
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, 
    so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
 */
interface one{
    public void print_geek();
}
interface two{
    public void print_for();
}
// here we are inheriting from above two classes 
interface three extends one,two{ 
}
// then we are forming a child sub class to implement the interface
class Child implements three{
    @Override
    public void print_geek()
    {
        System.out.println("Geeks");
    }
    @Override
    public void print_for()
    {
        System.out.println("For");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Child child=new Child();
        child.print_geek();
        child.print_for();
        child.print_geek();
    }
    
}
