package edu.vit.corejava.exceptionHandling;
import java.util.Scanner;
class TwoException extends Exception{
    public TwoException(String message)
    {
        super(message);
    }
    
}
class Operation
{
    public static float divide(int a, int b) throws TwoException
    {
        if(b==0)
        throw new TwoException("Denominator cannot be zero");
        return a/b;
    }
}
public class Pract2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            System.out.println("Division of two numbers is : "+Operation.divide(a, b));
        } 
        catch (TwoException e) {
            System.out.println(e.toString());
            
        }
    }
    
}

