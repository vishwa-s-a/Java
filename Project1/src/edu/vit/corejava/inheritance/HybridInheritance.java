package edu.vit.corejava.inheritance;
// hybrid inheritance's small example. from one grandparent two parents are inherited,
//      then from both parents one grandchild is inherited
interface Gp
{
    default void show()
    {
        System.out.println("Default 1");
    }
}
interface P1 extends Gp{
    
}
interface P2 extends Gp
{
    
}
class GrandChild implements P1,P2{
    
}
public class HybridInheritance {
    public static void main(String[] args) {
        GrandChild child=new GrandChild();
        child.show();
    }
    
}
