package edu.vit.corejava.collections_pract;
// we are defining a functional interface so we can do functional programing
@FunctionalInterface
interface Math{
    public int add(int a, int b);// in this functional interface we can only have one method
    //public int subtract(int a , int b);// here if we uncomment it we get error
}

public class LambdaExpDemo {
    public static void main(String[] args) {
        // now we create a annonymous class for using the above interface
        Math math=new Math() {
            public  int add(int a, int b)
            {
                return a+b;
            }
        };
        System.out.println(math.add(20,30));
        // above all this lines are equalent to
        Math math1=(a,b)->a+b;
        System.out.println(math1.add(33, 33));


    }

    
}
