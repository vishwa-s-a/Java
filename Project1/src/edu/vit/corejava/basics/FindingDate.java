package edu.vit.corejava.basics;
import java.util.*;
public class FindingDate {
    static List<String> days=Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
    public static String getDay(String date,String month,String year)
    {
        int d=Integer.parseInt(date);
        int m=Integer.parseInt(month);
        int y=Integer.parseInt(year);
        Calendar c=Calendar.getInstance();
        c.set(y,m-1,d);
        int p=c.get(Calendar.DAY_OF_WEEK);
        String s=days.get(p-1);
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String date=sc.next();
        String month=sc.next();
        String year=sc.next();
        String day=getDay(date,month,year);
        System.out.println(day);
    }
}
