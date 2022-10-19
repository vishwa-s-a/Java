package edu.vit.corejava.exceptionHandling;
// some modified code of this file is written in Pract1.java of this package
import java.util.Scanner;
class MyException extends Exception{
    // we are overriding the tostring and other methods of exception class and we are giving our own definition as it is custom exception class
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
public class CustomException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a;
        a=sc.nextInt();
        if(a<9)
        {
            try{
                System.out.println("hi");
                throw new MyException();
            }
            catch( Exception e)
            {
                
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes finished");
        }
        

    }

    
}
