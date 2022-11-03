package edu.vit.corejava.basics;
import java.util.Scanner;
public class Test {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num="12.13+12.2i";
        String[] com=num.split("[+]");
        for(String i:com)
        {
            System.out.println(i);
        }
        String[] tom=com[1].split("[i]");
        System.out.println("x: "+com[0]);
        System.out.println("y: "+tom[0]);
        
    }       
    
    
}
