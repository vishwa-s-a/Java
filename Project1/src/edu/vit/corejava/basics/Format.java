package edu.vit.corejava.basics;
// here we will demonstrate how we can formate output in our program using printf
import java.io.PrintStream;// this is the class which has printf method for us to formate the output
import java.util.Locale;
import java.util.Date;
// here we use %s for strings, %c for characters,%d for integers, %f for float and double
public class Format {
    public static void main(String[] args)
    {
        int a=123;
        double b=123.45453;
        String s="vishwa";
        // to break the string into separate lines
        System.out.printf("Baeldung%nterminator%n");

        //string formatting using %s
        //here if we want output in '' quotes then we put printf("'%s'") otherwise no need of '' in ""
        System.out.printf("'%S' %n","baeldung");// S capitalises the output
        System.out.printf("'%s' %n","baeldung");// s prints the string as it is

        // to specify the minimum length, we can specify width
        System.out.printf("'%15s' %n","baeldung");
        System.out.printf("%-15s %d %n","baeldung",a);

        // limiting the characters printed in console
        System.out.printf("%2.2s %n","Hi There");
        System.out.printf("%2.2s %n","Hii There");
        System.out.printf("%3.2s %n","Hi There");
        System.out.printf("%4.1s %n","Hi There");

        //formating integers
        System.out.printf(Locale.US,"%,d %n",1000000);// here to use Locale we need to import java.util.Locales
        System.out.printf("%,d %n",10000);
        System.out.printf(Locale.ITALY,"%,d %n",10000);
        System.out.printf(Locale.ITALY,"%,d %n",1000000);
        System.out.printf("%04d%n",a);// it just pads zeros to leading digits which are empty

        //formatting float and double
        System.out.printf("%f%n",b);
        System.out.printf("%5.2f%n",b);
        System.out.printf("%7.2f%n",b);

        Date date = new Date();
        System.out.printf("%tT%n", date);












    }
}
