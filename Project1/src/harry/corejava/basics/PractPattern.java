package harry.corejava.basics;

public class PractPattern {
    static void pattern(int n)
    {
        if(n>=1)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            pattern(n-1);
        }
    }
    static void pattern2(int n,int m)
    {
        if(n>=1)
        {
            pattern2(n-1,m+1);
            for(int i=1;i<=n;i++)
            {
                if(i==1)
                    System.out.printf("%"+m+"s","*");
                else
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        for(int i=1;i<6;i++)
        {
            pattern2(i,1);
            pattern(i);
        }

    }

}
