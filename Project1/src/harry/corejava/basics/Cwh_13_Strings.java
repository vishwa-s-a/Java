package harry.corejava.basics;
import java.util.*;
public class Cwh_13_Strings {
    public static void main(String[] args)
    {
        // String is a class so we need to create a new instance for using String
        //String  name=new String("Harry");
        String name="Harry";//this also works
        System.out.println(name);
        int a=6;
        float b=5.6454f;
        System.out.printf("The value of a is %d and b is %f%n",a,b);
        System.out.format("The value of a is %d and b is %f",a,b);
        // we can use both printf and format for doing the same job
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
    }
}
