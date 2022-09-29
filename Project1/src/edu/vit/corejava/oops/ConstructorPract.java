/*
* this is demonstration of constructor and types and uses of various constructors
 */
package edu.vit.corejava.oops;
class Employee
{
    private String name;
    private Integer age;
    private String id;
    private Integer salary;
    public Employee(){}//No argument constructor
    public Employee(Integer salary)//parameterized constructor(also chain constructor)
    {
        this.salary=salary;
    }
    public Employee(String name,Integer age,Integer salary)//chain constructor part
    {
        this(salary);//sending the salary value to above constructor
        this.name=name;
        this.age=age;
    }
    public Employee(String name,Integer age,Integer salary,String id)
    {
        this(name,age,salary);//sending these arguments to above constructor
        this.id=id;
    }
    public Employee(Employee emp)// copy constructor
    {
        System.out.println("Copy constructor called.");
        this.age=emp.age;
        this.salary=emp.salary;
        this.id=emp.id;
        this.name=emp.name;
    }
    public void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Id: "+this.id);
        System.out.println("Salary: "+this.salary);
        System.out.println("\n");

    }
}
public class ConstructorPract {
    public static void main(String[] args)
    {
        Employee clerk=new Employee("vinod",26,23000,"EMP1234");
        clerk.display();
        Employee trainer=new Employee(clerk);
        trainer.display();
        Employee guard=new Employee();
        guard.display();
    }
}
