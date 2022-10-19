package edu.vit.corejava.basics;
// we can easily copy elements of one array into another by just equating both them like this
// if values[]={1,2,3,4,5}; num[]=new int[5]; num=values;
public class Vishwa {
    public static void add(int ...values)
    {
        int num[]=new int[6];
        num=values;
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[7]);// this line will give a array index out of bound error so we use try catch block
        System.out.println(num[4]);
        
    }
    public static void main(String[] args) {
        try{
        add(1,2,3,4,5);
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println(aie.toString());
        }
    }
    
}
