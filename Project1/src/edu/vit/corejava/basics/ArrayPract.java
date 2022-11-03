/**
 * here we are going to demonstrate 2 methods to create arrays
 * one is general method and other is using ArrayList
 */
package edu.vit.corejava.basics;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayPract {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // using basic method to create a array
        int array1[]=new int[5];// it creates a array of size of 5
        // with some modification we can also create new array as follows
        int array2[]={1,2,3,4,5};//initialisation and declaration
        // adding values to the array
        for(int i=0;i<array1.length;i++)
        {
            array1[i]=sc.nextInt();
        }
        
        // now using ArrayList method
        ArrayList<Integer>iValues=new ArrayList<Integer>();
        iValues.add(33);
        iValues.add(30);
        iValues.add(12);
        iValues.add(6);
        iValues.remove(0);
        Collections.sort(iValues);
        for(int i=0;i<iValues.size();i++)
        {
            System.out.println(iValues.get(i));
        }
        System.out.println("*******************************");
        System.out.println("Using advanced for loop to print the array");
        for(Integer value:iValues)
        {
            System.out.println(value);
        }

    }
}

