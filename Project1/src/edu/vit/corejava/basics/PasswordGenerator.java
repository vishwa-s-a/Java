package edu.vit.corejava.basics;
import java.util.Scanner;
import java.util.Random;
public class PasswordGenerator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int length;
        String pwd="";
        String option[]=new String[4];
        option[0]="abcdefghijklmnopqrstuvwxyz";
        option[1]="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        option[2]="0123456789";
        option[3]="!@#$%^&*_-+=.?/|:";
        System.out.println("Welcome to password generator");
        System.out.println("Enter the length of password to generate: ");
        length=sc.nextInt();
        for(int i=0;i<length;i++)
        {
            int one=random.nextInt(4);
            int two=random.nextInt(26);
            switch(one)
            {
                case 0:
                    pwd=pwd+option[one].charAt(two);
                    break;
                case 1:
                    pwd=pwd+option[one].charAt(two);
                    break;
                case 2:
                    two=random.nextInt(10);
                    pwd=pwd+option[one].charAt(two);
                    break;

                case 3:
                    two=random.nextInt(18);
                    pwd=pwd+option[one].charAt(two);
                    break;
            }

        }
        System.out.println("The generated password is : "+pwd);

    }
}
