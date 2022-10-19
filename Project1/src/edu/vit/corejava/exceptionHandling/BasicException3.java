package edu.vit.corejava.exceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;// should be included for ime.
public class BasicException3 {
    public static int addition(int a, int b)
    {
        return a+b;
    }
    public static int subtraction(int a, int b)
    {
        return a-b;
    }
    public static int multiply(int a, int b)
    {
        return a*b;
    }
    public static double division(int a, int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
         try{
            System.out.print("Enter a and b integer values: ");
            a=sc.nextInt();
            b=sc.nextInt();
        }
        catch(InputMismatchException ime)
        {
            a=20;b=10;//default values if user gives wrong values as input
            System.out.println(ime.toString());
        }
        System.out.println("addition: "+addition(a,b));
        try{
            System.out.println("division: "+division(a,b));
        }
        catch(ArithmeticException ae)
        {
            //System.out.println(ae.toString());
            System.out.println("Infinity");
        }
        System.out.println("subtraction: "+subtraction(a,b));
        System.out.println("multiplication: "+multiply(a,b));
    }
    
}
