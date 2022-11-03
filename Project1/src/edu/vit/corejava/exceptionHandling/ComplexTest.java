package edu.vit.corejava.exceptionHandling;
/**
 * @author vishwa shivanand appaji
 * @since 3/11/2022
 * source code for lab assessment-3
 * important concepts to be seen are:
 *  Double.parseDouble()
 *  String.split(regex, limit)
 */
import java.util.Scanner;
class Complex{
    private Double x;
    private Double y;
    public Complex(){}
    public Complex(Double x, Double y)
    {
        this.x=x;
        this.y=y;
    }
    // add getters and setters methods for this class
    // now writing method to add two complex numbers
    public Complex addition(Complex c1, Complex c2)
    {
        Complex temp=new Complex();
        temp.x=c1.x+c2.x;
        temp.y=c1.y+c2.y;
        return temp;
    }
    public String toString()
    {
        if(this.y>=0)
        return this.x+"+"+this.y+"i";
        else
        return this.x+""+this.y+"i";
    }
}

// now writing a exception class(custom)
class ComplexException extends Exception{
    public ComplexException()
    {
        super("Invalid input format for complex number!!!");
    }
}

public class ComplexTest {
    public static void InputValidator(String s1, String s2) throws ComplexException
    {
        if(!(s1.contains("+")) || !(s1.contains("-")))
        {
            if(!(s1.contains("i")))
            throw new ComplexException();
        }
        if(!(s2.contains("+")) || !(s2.contains("-")))
        {
            if(!(s2.contains("i")))
            throw new ComplexException();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String  s1,s2;
        System.out.print("Enter First complex number: ");
        s1=sc.next();
        System.out.print("Enter second complex number: ");
        s2=sc.next();
        try{
            ComplexTest.InputValidator(s1,s2);
            Complex c1=new Complex();
            Complex c2=new Complex();
            Complex c3=new Complex();
            // string splitting for first string
            if(s1.contains("+"))
            {
                String real1[]=s1.split("[+]");
                String imaginary1[]=real1[1].split("[i]");
                Double x=Double.parseDouble(real1[0]);
                Double y=Double.parseDouble(imaginary1[0]);
                c1=new Complex(x,y);
            }
            else{
                String real1[]=s1.split("[-]");
                String imaginary1[]=real1[1].split("[i]");
                Double x=Double.parseDouble(real1[0]);
                Double y=Double.parseDouble(imaginary1[0]);
                y=-y;
                c1=new Complex(x,y);
            }
            // String spliting for second string 
            if(s2.contains("+")){
                String real2[]=s2.split("[+]");
                String imaginary2[]=real2[1].split("[i]");
                Double x=Double.parseDouble(real2[0]);
                Double y=Double.parseDouble(imaginary2[0]);
                c2=new Complex(x,y);
            }
            else{
                String real2[]=s2.split("[-]");
                String imaginary2[]=real2[1].split("[i]");
                Double x=Double.parseDouble(real2[0]);
                Double y=Double.parseDouble(imaginary2[0]);
                y=-y;
                c2=new Complex(x,y);
            }

            // now printing both the complex objects
            //System.out.println(c1.toString());
            //System.out.println(c2.toString());
            c3=c1.addition(c1, c2);
            System.out.println("Addition of these two complex number is :"+c3.toString());
            
           

        }
        catch(ComplexException e)
        {
            System.out.println(e.toString());
        }
    }
    
}
