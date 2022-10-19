package edu.vit.corejava.exceptionHandling;
import java.util.Scanner;
public class PasswordTest {
    public static void main(String[] args) {
        String entry;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password to check the strength: ");
        entry=sc.nextLine();
        try {
            PasswordValidator.checkPassword(entry);// this line asks you to surround this thing is try and catch block
            System.out.println("Password is Strong");
        } 
        catch (PasswordException e) {
            System.out.println(e.toString());
            
        }

    }
    
}
