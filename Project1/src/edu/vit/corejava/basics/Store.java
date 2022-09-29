package edu.vit.corejava.basics;
/*
 * here instance means object of c++
 * 
 */
import java.util.Scanner;
public class Store{
    String product;
    int price;
    int quantity;

    public Store(String a, int b, int c){// it is a constructor
        product =a;
        price =b;
        quantity = c;
    }

    public static void main(String[] args)
    {
        int n, number,amount=0;
        Scanner sc = new Scanner(System.in);
        Store lemonadeStand = new Store("Lemon_juice",15,150);
        Store bakery=new Store("Cookies",20,200);
        System.out.println("We serve "+lemonadeStand.product+" at "+lemonadeStand.price+" per glass");
        System.out.println("We serve "+bakery.product+" at "+bakery.price+" per cookies");
        while(true){
        System.out.println("Tell your order in the console by typing:");
        System.out.println("1:For lemon_juice     2:For Cookies       3.For Exit");
        n=sc.nextInt();
        if(n==1){
            System.out.println("Enter the number of glass you want to order : ");
            number=sc.nextInt();
            lemonadeStand.quantity -=number;
            amount+=number*lemonadeStand.price;
            System.out.println("Total amount to be paid is "+amount+" Rupees");
        }
        if(n==2){
            System.out.println("Enter the number of cookies you want to order : ");
            number=sc.nextInt();
            bakery.quantity -=number;
            amount+=number*bakery.price;
            System.out.println("Total amount to be paid is "+amount+" Rupees");
        }
        if(n==3){
            System.out.println("Thank you, Shop again!");
            break;
        }
        }
    }
}
