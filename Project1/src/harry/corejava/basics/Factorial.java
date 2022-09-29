package harry.corejava.basics;

public class Factorial {
    static int recursive(int n)
    {
        if(n==1 || n==0)
            return 1;
        else {
            return n*recursive(n-1);
        }
    }
    static int iterative(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else{
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(recursive((5)));
        System.out.println(iterative((5)));
    }
}
