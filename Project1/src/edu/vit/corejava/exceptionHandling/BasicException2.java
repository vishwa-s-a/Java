package edu.vit.corejava.exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BasicException2 {
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
    public static void main(String[] args)
    {
        Scanner sc=null;
        int a,b;
        System.out.println("Enter the values of a and b: ");
        try{
            sc =new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Division : "+division(a, b));
        }
        //if try block is executed successfully without any error then catch block will not be
        // executed(compiler just skips the catch block)
        catch(InputMismatchException | ArithmeticException e)
        {
            a=10;b=20;
            System.out.println(e.toString());
        }
        /* 
        can use above single catch block instead of these two catch block
        catch(InputMismatchException ime)
        {
            System.out.println("Expected a Integer data type");
            
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.toString());
            
        }
        */
        finally{
            
            sc.close();
        }
        System.out.println("Addition: "+addition(a, b));
        System.out.println("Multiplication: "+multiply(a, b));
        

    }
    
}
