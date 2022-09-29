package edu.vit.corejava.oops;
import java.util.Scanner;

/**
 * @author vishwa
 * this was java live session 1. Main focus on OOPS concepts,static variables.
 * in this file still getter and setter methods are to be included as usual, but i have just left it to save time
 *  here.
 *
 *
 */
class Contact
{
    public static int count;// here we count is set to value of zero by default, now it is a class variable
    private String name;
    private String mobile_number;
    public Contact(){}
    public Contact(String name,String number)
    {
        this.name=name;
        this.mobile_number=number;
        count++;
    }
    public String toString()
    {
        return("name "+this.name+" \tmobile: "+this.mobile_number);
    }
}
public class Pract1 {
    public static void main(String[] args)
    {
        String name,number;
        int choice;
        Scanner sc=new Scanner(System.in);
        // now to create array of objects for this syntax is
        Contact contacts[]=new Contact[5];
        while(true)
        {
            System.out.println("Enter 1 to create new contact\nEnter 2 to view all saved contacts");
            System.out.println("Enter 3 to exit");
            choice=sc.nextInt();
            if(choice==1)
            {
                if(Contact.count<3)// here we cannot call count directly so we use Class name as it is a class variable
                // we cannot use contacts[0].count instead use Contact.count      -> this shows class_name.variable
                {
                    System.out.print("Enter name: ");
                    name=sc.next();
                    System.out.print("Enter number");
                    number=sc.next();
                    if(name.matches("[a-z A-Z]+") && number.matches("[0-9]+") && name.length()>=3 && number.length()==10)
                    contacts[Contact.count]=new Contact(name,number);
                    else
                        System.out.println("Invalid name or number");
                }
                else
                {
                    System.out.println("System storage is full");
                }
            }
            else if(choice==2)
            {
                for(int i=0;i<Contact.count;i++)
                {
                    System.out.println(contacts[i].toString());
                }
            }
            else if(choice==3)
                System.exit(0);
            else
                System.out.println("Invalid choice ");

        }

    }
}
