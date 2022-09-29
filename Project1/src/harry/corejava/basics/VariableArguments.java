package harry.corejava.basics;

public class VariableArguments {
    //instead of writing lot of methods to overload the method by varying the number of arguments we can simply use variable
    // arguments method to just define one method which will accepts many arguments like this one in below
    static int foo(int ...args)
    {
        int result=0;
        for(int a:args)
        {
            result=result+a;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(foo(1,2,3,4,5));
        System.out.println(foo(12,12,12,12));
    }
}
