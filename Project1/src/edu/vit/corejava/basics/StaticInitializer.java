package edu.vit.corejava.basics;
import java.util.*;
// this is hacker rank problem
// topic static initializer block
public class StaticInitializer {
    // at first this static block is executed and then goes to main block
    // instance field
    static int B,H;
    static boolean flag=true;// as these are static variables they can be only accessed by static methods only
    static{// new static method
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    try
    {
        if (B <= 0 || H <= 0)
            throw new Exception("Breadth and Height must be positive");
    }
    catch(Exception e)
    {
        System.out.println(e);
        System.exit(0);
    }
    }
    public static void main(String[] args){
        if(flag)
        {
            int area=B*H;// both static variables belong to same class so we dont have to use class name to access the static variables
            System.out.println(area);
        }
        }
    }

