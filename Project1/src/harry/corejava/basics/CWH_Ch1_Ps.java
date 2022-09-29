package harry.corejava.basics;
import java.util.Scanner;
public class CWH_Ch1_Ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* first question
        System.out.println("Enter your name ");
        String str = sc.next();
        //System.out.print("Hello ");
        //System.out.print(str);
        //System.out.print(" have a good day");

        // instead of these lines we can use
        System.out.println("Hello "+str+" have a good day!");
        */
        System.out.println("Enter the number ");
        System.out.println(sc.hasNextInt());


    }
}
