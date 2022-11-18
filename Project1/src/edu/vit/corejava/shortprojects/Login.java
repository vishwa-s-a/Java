package edu.vit.corejava.shortprojects;
import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher; 
/**
 * @author vishwa-shivanand-appaji
 * @since 17/11/2022
 * it is a program for login page of a company, which performs login,sign-up tasks
 * the program is using file handling concepts to store the credentials of the user in a file named credentials.txt
 * this program has lot of custom exception classes to throw suitable custom user defined exception
 * this program has various methods to verify the correctiveness of the email-id entered by the user
 * this program also has one method which checks the strength of the password enterd by the user
 * this program has one method which can generates a 13 characters random password when requested by the user
 * 
 */
class PasswordException extends Exception {
    public PasswordException(String message)
    {
        super(message);
    }
    
}
class PasswordValidator {
    public static void checkPassword(String password) throws PasswordException
    {
        if(password.length()<8)
        {
            throw new PasswordException("password should be minimum 8 characters");
        }
        else{
            char a;
            int upChar=0,lowChar=0,digits=0,specialChar=0;
            for(int i=0;i<password.length();i++)
            {
                a=password.charAt(i);
                if(Character.isUpperCase(a)) upChar++;
                else if(Character.isLowerCase(a)) lowChar++;
                else if(Character.isDigit(a)) digits++;
                else specialChar++;
            }
            if(upChar==0)
            throw new PasswordException("Should contain atleast one upper case alphbet");
            if(lowChar==0)
            throw new PasswordException("should contain atleast one lower case alphabet");
            if(digits==0)
            throw new PasswordException("should contain atleast one digit");
            if(specialChar==0)
            throw new PasswordException("should contain atleast one special character");
        }
    }
}
class PasswordGen{
    public static String generate(){
        Random random=new Random();
        int length;
        String pwd="";
        String option[]=new String[4];
        option[0]="abcdefghijklmnopqrstuvwxyz";
        option[1]="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        option[2]="0123456789";
        option[3]="!@#$%^&*_-+=./|:";
        length=13;
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
                    two=random.nextInt(17);
                    pwd=pwd+option[one].charAt(two);
                    break;
            }

        }
        return pwd;
    }

}
public class Login {
    public static boolean emailValidator(String x)
    {
        String regex="^[A-Za-z0-9]+[A-Za-z0-9+_.-]+@[a-z]+[.]+[a-zA-Z0-9.-]*[a-z]+$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(x);
        return matcher.matches();
    }
    public static void main(String[] args) {
        int choice;
        String email;
        String password;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("\033[H\033[2J");
            System.out.println("**************************************************************************");
            System.out.println("___________________________Welcome to Musketeers__________________________");
            System.out.println("Home Page");
            System.out.println("\t\tMeanu");
            System.out.println("\t\t1. Press 1 to login");
            System.out.println("\t\t2. Press 2 to signup");
            System.out.println("\t\t3. Press 3 to Reset your Password");
            System.out.println("\t\t4. Press 0 to exit the home page");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.print("\033[H\033[2J");
                System.out.println("_____________________________________________________________________");
                System.out.println("************************Welcome to Login page************************");
                System.out.println("_____________________________________________________________________");
                System.out.print("Email Id: ");
                email=sc.next();
                System.out.print("Password: ");
                password=sc.next();
                try(BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\vishw\\Java\\Project1\\src\\edu\\vit\\corejava\\shortprojects\\credential.txt")))
                {
                    String line;
                    String mail="";
                    String pwd="";
                    while((line=fr.readLine())!=null)
                    {
                        String data[]=line.split("[?]");
                        //System.out.println(data[0]+""+data[1]);
                        mail=data[0];
                        pwd=data[1];
                        if(email.equals(mail) && password.equals(pwd) )
                        break;   
                    }
                    if(email.equals(mail))
                    {
                        if(password.equals(pwd))
                        {
                            System.out.print("\033[H\033[2J");
                            System.out.println("****************** Login Successful ************");
                            System.out.println("press any key to go to the home page");
                            sc.next();
                            break;
                        }
                        else{
                            System.out.println("The entered password is wrong. Try to re-enter the password");
                            System.out.println("press any key to go to the home page");
                            sc.next();
                            break;
                        }
                    }
                    else{
                        System.out.println("User email id not found. Try to re-enter or sign-up");
                        System.out.println("press any key to go to the home page");
                        sc.next();
                        break;
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e.toString());
                }
                break;

                case 2:
                System.out.print("\033[H\033[2J");
                System.out.println("_____________________________________________________________________");
                System.out.println("************************Welcome to sign-up page************************");
                System.out.println("_____________________________________________________________________");
                System.out.print("Email Id: ");
                email=sc.next();
                if(!(Login.emailValidator(email)))
                {
                    System.out.println("Invalid email-id format!!");
                    System.out.println("press any key to go to the home page");
                    sc.next();
                    break;
                }
                System.out.print("Password: ");
                password=sc.next();
                try(FileWriter fw=new FileWriter("C:\\Users\\vishw\\Java\\Project1\\src\\edu\\vit\\corejava\\shortprojects\\credential.txt",true))
                {
                    try
                    {
                        PasswordValidator.checkPassword(password);
                        System.out.println("Entered Password is Strong.\nSuccessfully signed-up");
                        fw.write(email+"?"+password+"\n");
                    }
                    catch(PasswordException e)
                    {
                        int choice1;
                        System.out.println(e.toString());
                        System.out.println("Press 1 to Auto-generate a random password from our side");
                        System.out.println("Press 2 to re-enter the password by yourself");
                        System.out.print("Choice: ");
                        choice1=sc.nextInt();
                        switch(choice1)
                        {
                            case 1:
                            password=PasswordGen.generate();
                            System.out.println("The Auto-generated password is: "+password);
                            fw.write(email+"?"+password+"\n");
                            System.out.println("Successfully signed-up");
                            System.out.println("press any key to go to the home page");
                            sc.next();
                            break;

                            case 2:
                            System.out.print("Re-enter your password: ");
                            password=sc.next();
                            fw.write(email+"?"+password+"\n");
                            System.out.println("Successfully signed-up");
                            System.out.println("press any key to go to the home page");
                            sc.next();
                            break;
                        }
                    
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.toString());
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e.toString());
                }
                break;

                case 0:
                System.out.print("\033[H\033[2J");
                System.out.println("**************** Thank You *************************");
                System.exit(0);

            }
        }
        
    }
    
}
