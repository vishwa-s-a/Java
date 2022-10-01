/**
 * to demonstrate the use of try and catch
 */
package edu.vit.corejava.exceptionHandling;

import java.util.Scanner;

public class BasicException {
    public static int addition(int a,int b)
    {
        return a+b;
    }
    public static double division(int a, int b)
    {
        return a/b;
    }
    public static int subtraction(int a, int b)
    {
        return a-b;
    }
    public static int multiply(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer values a and b: "); 
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("addition: "+addition(a,b));
        try{
            System.out.println("division: "+division(a,b));
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.toString());
            System.out.println("Infinity!!");
        }       
        System.out.println("subtraction: "+subtraction(a,b));       
        System.out.println("multiplication: "+multiply(a,b));       

    }
    
}
