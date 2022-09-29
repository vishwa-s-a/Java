package horstmann.corejava.inheritance;
import java.util.Objects;
import java.time.LocalDate;
class Employee
{
    String name;
    Integer salary;
    LocalDate doj;
    public Employee(String n, Integer salary, LocalDate doj)
    {
        // here we use objects class methods to set name to unknown if name is null
        name= Objects.requireNonNullElse(n,"unknown");// here if user gives null then we set to unknown to name
        //this.name=n;
        this.salary=salary;
        this.doj=doj;
    }
    public String getName()
    {
        return this.name;
    }


}
public class NullHandling
{
    public static void main(String[] args)
    {
        Employee employee=new Employee(null,1200,LocalDate.of(2022,9,12));
        System.out.println(employee.getName());

    }
}
