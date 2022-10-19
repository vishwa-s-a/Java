package edu.vit.corejava.exceptionHandling;

import java.util.Scanner;

class OneException extends Exception{
    @Override
    public String toString()
    {
        return "I am toString()";
    }
    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}
public class Pract1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int choice;
        choice=sc.nextInt();
        if(choice<8)
        {
            try{
                //throw new OneException();
                // here we can also give some thing like
                throw new ArithmeticException("This is a arithmetic exception");
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("finished");
            }
        }
        System.out.println("Fully finished");
    }

    
}
