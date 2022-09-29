package edu.vit.corejava.basics;
import java.util.*;
public class Pract2 {
    public static void main(String[] args)
    {
        Scanner scanf=new Scanner(System.in);
        char a='B';
        a=(char)(a+8);
        System.out.println(a);
        //decrypt
        a=(char)(a-8);
        System.out.println(a);
        if(scanf.hasNextInt())
        {
            System.out.println("hi");
        }

    }
}
