package edu.vit.corejava.basics;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Name: Vishwa Shivanand Appaji
 * reg no: 21BCI0026
 */
public class LiveSession1 {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String itemName[]={"Dal","Rice","Bread","Noodles","butter"};
            int itemPrice[]={150,60,40,50,25};
            int availability[]={5,3,10,4,20};
            ArrayList<Integer>cartItem=new ArrayList<Integer>();
            ArrayList<String>name=new ArrayList<String>();
            ArrayList<Integer>code=new ArrayList<Integer>();
            System.out.println("----------------------------------------");
            System.out.println("************Welcome to Shop*************");
            while(true)
            {
                int option;
                System.out.println("1.Press 1 to continue shopping\n2.Press 0 to quit the shopping and to checkout");
                option=sc.nextInt();
                //System.out.println(option);
                if(option==0)
                {
                    System.out.println("ThankYou for shopping with us!!!!");
                    break;
                }
                else
                {
                    System.out.println("----------------------------------------");
                    System.out.println("Grocery items available in the shop are:");
                    System.out.println("Item code: Name(Availability)");
                    for(int i=0;i<5;i++)
                    {
                        System.out.println(i+":"+itemName[i]+"("+availability[i]+")");
                    }
                    System.out.println("----------------------------------------");
                    System.out.println("Choose an item code:");
                    int selected=sc.nextInt();
                    if(availability[selected] !=0)
                    {
                            code.add(selected);
                            name.add(itemName[selected]);
                            cartItem.add(itemPrice[selected]);
                            System.out.println("----------------------------------------");
                            System.out.println("Items present in the cart are:");
                            for(int z=0;z<name.size();z++)
                            {
                                System.out.println("Item code: "+code.get(z)+" Name: "+name.get(z)+" Price:"+cartItem.get(z));
                            }
                            System.out.println("----------------------------------------");
                            availability[selected]=availability[selected]-1;
                    }
                    else
                    {
                        System.out.print("Out of stock!!!!!!");
                    }



                }

            }
        }

}
