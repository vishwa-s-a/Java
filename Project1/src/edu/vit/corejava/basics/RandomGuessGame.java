package edu.vit.corejava.basics;
import java.util.Scanner;
import java.lang.Math;// here this class is used to get a random number(can be double or int)
public class RandomGuessGame {
    public static void main(String[] args)
    {
        int max=400, min=200;
        Scanner sc=new Scanner(System.in);
        int assumed, answered;
        //double a=Math.random();
        /* theory part
        it gets random number mainly double which lies between 0.0 to 1.0 can be equal or greater than mentioned bounderies
         to avoid getting a double between [0.0 to 1.0] and to get our desired double number we use below formula
         double b=Math.random()*(max-min+1)+min;
         to get a integer random number in a certain range[min,max]
         int c=(int)(Math.random()*(max-min+1)+min);
         */

         /* 
         uncomment and test the output for practical
        double b=Math.random()*(max-min+1)+min;
        int c=(int)(Math.random()*(max-min+1)+min);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */
        assumed = (int)(Math.random()*(max-min+1)+min);
        //System.out.println((assumed));
        System.out.println("Here the assumed number is in between [200,400]");
        System.out.println("Guess the number generated in the program");
        while(true)
        {
            answered=sc.nextInt();
            if((answered>assumed) && (answered-assumed<10)){
                System.out.println("Your answer is more than assumed number, very near to assumed number ");
            }
            else if(answered>assumed){
                System.out.println("Your answer is more than assumed number");
            }
            else if((answered<assumed) && (assumed-answered)<10){
                System.out.println("Your answer is less than assumed number, very near to assumed number ");
            }
            else if(answered<assumed){
                System.out.println("Your answer is less than assumed number");
            }
            else{
                System.out.println("Got the answer!!!!!!!!!!!!!!!!!!!");
                break;
            }
        }

    }
    
}
