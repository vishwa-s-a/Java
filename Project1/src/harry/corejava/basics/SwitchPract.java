// here we show you the old and new enhanced switch statements
package harry.corejava.basics;
import java.util.Scanner;
public class SwitchPract {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        /*
        this is the old c lang switch() statements. this also works, but the enhanced version has more words to speak
        switch(age)
        {
            case 18:
                System.out.println("Your are a adult");
                break;
            case 26:
                System.out.println("You should get a job");
                break;
            case 70:
                System.out.println("You should retire now");
        }
         */
        // here the enhanced version doesnt need any break
        switch (age) {
            case 18 -> System.out.println("Your are a adult");
            case 26 -> System.out.println("You should get a job");
            case 70 -> System.out.println("You should retire now");
        }
    }
}
