package edu.vit.corejava.basics;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.Date;

public class Pract1 {
    public static void main(String[] args)
    {
        Date today=new Date();
        System.out.println(today.getTime());
        Scanner sc=new Scanner(System.in);
        System.out.println(LocalDate.now());
    }
}