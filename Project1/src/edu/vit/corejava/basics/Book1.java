package edu.vit.corejava.basics;
// demonstration of uses of Date and LocalDate classes
import java.util.Date;
import java.time.LocalDate;
public class Book1 {
    public static void main(String[] args)
    {
        Date timeNow=new Date();
        System.out.println(new Date());//this is direct method;
        System.out.println(timeNow.toString());// here we create a new object and use toString() method to print

        LocalDate now=LocalDate.now();
        LocalDate some=LocalDate.of(2005,12,12);
        System.out.println("today date: "+now);
        System.out.println("some date: "+some);
        int year=now.getYear();
        int month=now.getMonthValue();
        int date=now.getDayOfMonth();
        System.out.println("date: "+date+" month: "+month+" year: "+year);

        // use of plusDays() methods
        some=some.plusDays(1000);// to add 1000 days to the todays date;
        System.out.println(now);
        System.out.println("some date: "+some);
    }

}
