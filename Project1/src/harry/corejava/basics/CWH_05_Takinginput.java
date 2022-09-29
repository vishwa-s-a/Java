package harry.corejava.basics;
import java.util.Scanner;
public class CWH_05_Takinginput {
    public static void main(String[] args)
    {
        System.out.println("Taking Input From the user");
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter number 1");
        //System.out.println("Enter number 2");
        //int a=sc.nextInt();
        //int b=sc.nextInt();
        //int sum=a+b;
        //System.out.print("The sum of these numbers is :");
        //System.out.println(sum);
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
        //String str=sc.next();// here it takes only one word as input even if you enter
        // a complete sentence
        //System.out.println(str);
        String str1=sc.next();
        System.out.println(str1);
    }
}