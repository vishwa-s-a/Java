package horstmann.corejava.inheritance;
/**
 * using reflection class to get all information about a particular class
 */

import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest
{
    public static void main(String[] args)// if you dont give this exception then we get error
    throws ReflectiveOperationException
    {
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the class name(like java.util.Date): ");
        name=sc.next();
        // prints class name, modifiers, superclass name(if!=object)
        Class cl=Class.forName(name);
        String modifiers=Modifier.toString(cl.getModifiers());
        if(modifiers.length()>0)
            System.out.println(modifiers+" ");
        if(cl.isSealed())
            System.out.println("sealed");
        if(cl.isEnum())
            System.out.println("Enum "+name);
        else if(cl.isRecord())
            System.out.println("Record "+name);
        else if(cl.isInterface())
            System.out.println("Interface "+name);
        else
            System.out.println("class "+name);
        Class supercl=cl.getSuperclass();
        if(supercl !=null && supercl !=Object.class)
            System.out.println("extends "+supercl.getName());
        printInterfaces(cl);
        printPermittedSubclasses(cl);
        System.out.println("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");

    }
    /**
     * prints all constructors of a class
     * @param cl a class
     */
    public static void printConstructors(Class cl)
    {
        Constructor[] constructors=cl.getDeclaredConstructors();
        for(Constructor c:constructors)
        {
            String name=c.getName();
            System.out.println("  ");
            String modifiers=Modifier.toString(c.getModifiers());
            if(modifiers.length()>0)
                System.out.print(modifiers+" ");
            System.out.print(name+ " (");
            // print parameter types
            Class[] paramTypes=c.getParameterTypes();
            for(int j=0;j<paramTypes.length;j++)
            {
                if(j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");


        }
    }
    /**
     * prints all methods of a class
     * @param cl a class
     */
    public static void printMethods(Class cl)
    {
        Method[] methods=cl.getDeclaredMethods();
        for(Method m: methods)
        {
            Class retType=m.getReturnType();
            String name=m.getName();

            System.out.print(" ");
            //print modifiers, return type and method name
            String modifiers=Modifier.toString(m.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print(retType.getName()+" "+name+"(");
            //print parameter types
            Class[] paramTypes=m.getParameterTypes();
            for(int j=0;j<paramTypes.length;j++)
            {
                if(j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());

            }
            System.out.println(");");

        }
    }
    /**
     * prints all fields of a class
     * @param cl a clas
     */
    public static void printFields(Class cl)
    {
        Field[] fields=cl.getDeclaredFields();
        for(Field f: fields)
        {
            Class type=f.getType();
            String name=f.getName();
            System.out.print(" ");
            String modifiers=Modifier.toString(f.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.println(type.getName()+" "+name+";");

        }
    }
    /**
     * prints all permitterd subtypes of a sealed class
     * @param cl a class
     */
    public static void printPermittedSubclasses(Class cl)
    {
        if(cl.isSealed())
        {
            Class<?>[] permittedSubclasses=cl.getPermittedSubclasses();
            for(int i=0;i<permittedSubclasses.length;i++)
            {
                if(i==0)
                    System.out.print(" permits ");
                else
                    System.out.print(", ");
                System.out.print(permittedSubclasses[i].getName());
            }

        }
    }
    /**
     * prints all directly implemented interfaces of a class
     * @param cl a class
     */
    public static void printInterfaces(Class cl)
    {
        Class<?>[] interfaces=cl.getInterfaces();
        for(int i=0;i<interfaces.length;i++)
        {
            if(i==0)
                System.out.print(cl.isInterface() ?" extends ": "implements");
            else
                System.out.print(", ");
            System.out.print(interfaces[i].getName());
        }
    }
}