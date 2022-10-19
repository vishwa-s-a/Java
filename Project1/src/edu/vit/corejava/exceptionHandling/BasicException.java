/**
 * to demonstrate the use of try and catch.
 * to catch array index out of bound exception
 */
package edu.vit.corejava.exceptionHandling;

import java.util.Scanner;

public class BasicException {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        System.out.println("Enter the array index to be found: ");
        int ind=sc.nextInt();
        try{
            System.out.println("The element at the index specified is: "+num[ind]);
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println(aie.toString());
        }
               

    }
    
}
