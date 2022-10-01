/**
 * using ArrayList to create an dynamic array of objects 
 */
package harry.corejava.inheritance;
import java.util.Scanner;
import java.util.ArrayList;
class Student
{
    private String name;
    private Integer age;
    public Student(){}
    public Student(String name, Integer age)
    {
        this.age=age;
        this.name=name;
    }
    public String toString()
    {
        return "[Name: "+this.name+" Age: "+this.age+" ]";
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Integer choice,age;
        String name;
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> student=new ArrayList<Student>();
        Student ram=new Student();
        while(true)
        {
            System.out.println("1 to profile\n2 to view profile\n0 to exit");
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the name\nEnter the age");
                sc.nextLine();
                name=sc.nextLine();
                age=sc.nextInt();
                ram =new Student(name,age);
                student.add(ram);
            }
            else if(choice==0)
            {
                System.exit(0);
            }
            else{
                for(Student i:student)
                {
                    System.out.println(i.toString());
                }
            }
        }
        
    }
    
}
