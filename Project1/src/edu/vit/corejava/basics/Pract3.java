package edu.vit.corejava.basics;
// adding two complex numbers
class Complex{
    private int x;
    private int y;
    public Complex(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void add(Complex c,Complex d)
    {
        int temp1=c.x+d.x;
        int temp2=c.y+d.y;
        System.out.println(temp1+"+i"+temp2);
    }
}

public class Pract3 {
    public static void main(String[] args)
    {
        Complex complex1=new Complex(1,2);
        Complex complex2=new Complex(3,4);
        complex1.add(complex1,complex2);
    }
}
