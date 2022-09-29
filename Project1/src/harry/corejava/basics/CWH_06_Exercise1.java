package harry.corejava.basics;
import java.util.Scanner;
// here it is a program to calculate the percentage of marks obtained by a
// a student studying in CBSE board(consider 5 subjects)
public class CWH_06_Exercise1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float sub1,sub2,sub3,sub4,sub5,total,percentage;
        System.out.println("Enter the marks of subject 1 :");
        sub1=sc.nextFloat();
        System.out.println("Enter the marks of subject 2 :");
        sub2=sc.nextFloat();
        System.out.println("Enter the marks of subject 3 :");
        sub3=sc.nextFloat();
        System.out.println("Enter the marks of subject 4 :");
        sub4=sc.nextFloat();
        System.out.println("Enter the marks of subject 5 :");
        sub5=sc.nextFloat();
        total=sub1+sub2+sub3+sub4+sub5;
        percentage=(total/500)*100;
        System.out.print("The percentage of the boy is: ");
        System.out.print(percentage);
    }
}
