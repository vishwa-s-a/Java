package horstmann.corejava.inheritance;

import java.time.LocalDate;

/**
 * here we demonstrate the use of var keyword and dynamic dispatch of methods
 */

abstract class Person
{
    private String name;
    public Person(String name)
    {
        this.name=name;
    }
    abstract public String toString();
    public String getName()
    {
        return this.name;
    }
}
class Employee1 extends Person
{
    private double salary;
    private LocalDate hireDay;
    public Employee1(String name,double salary,LocalDate hireDay)
    {
        super(name);
        this.hireDay=hireDay;
        this.salary=salary;
    }
    @Override
    public String toString()
    {
        return String.format("name: %s, salary: %f",this.getName(),this.salary);
    }
}
// just copied the class to show the use of var
class Student extends Person
{
    private double salary;
    private LocalDate hireDay;
    public Student(String name,double salary,LocalDate hireDay)
    {
        super(name);
        this.hireDay=hireDay;
        this.salary=salary;
    }
    @Override
    public String toString()
    {
        return String.format("name: %s, salary: %f",this.getName(),this.salary);
    }
}
public class PersonTest {
    public static void main(String[] args)
    {
        String date="2022-12-12";
        // we cannot create a object for abstract class but we can do this way, using var keyword
        var people=new Person[2];// dont give people[] it gives error
        // here the people is not object of person class(keep this in mind)
        people[0]=new Student("ram",12.34, LocalDate.parse(date));
        people[1]=new Employee1("ram",12.34, LocalDate.parse(date));
        // using for each loop to get tostring methods to work
        for(Person i:people)
        {
            System.out.println(i.toString());
        }
    }
}
