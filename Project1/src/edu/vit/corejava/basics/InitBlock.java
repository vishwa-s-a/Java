package edu.vit.corejava.basics;
/**
 * When we want certain common resources to be executed with every constructor we can put the code in the init block. 
 * Init block is always executed before any constructor, whenever a constructor is used for creating a new object.
 * If there are more than one blocks, they are executed in the order in which they are defined within the same class.
 */
class Init{
    // this is how we define a init block and we can define it where ever we want and when ever we want
    {
        System.out.println("Init 1 block is executed.");
    }
    public Init()
    {
        System.out.println("default constructor");
    }
    public Init(int x)
    {
        System.out.println("Parameterized constructor "+x);
    }
    {
        System.out.println("Second init block is executed");
    }

}
public class InitBlock {
    public static void main(String[] args) {
        new Init();
        new Init(10);
    }
    
}
