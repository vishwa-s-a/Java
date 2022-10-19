package edu.vit.corejava.exceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class NestedTry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        
        try{
            System.out.println("Welcome to nested try catch block section.");
            System.out.println("Enter the array index to be found: ");
            int ind=sc.nextInt();
            try{
                System.out.println("Element at index specified is: "+num[ind]);
            }
            catch(ArrayIndexOutOfBoundsException aie)
            {
                System.out.println("Array index specified is out of bounds");
            }
        }
        catch(InputMismatchException aie)
        {
            System.out.println(aie.toString());
        }
    }
    
}
