package edu.vit.corejava.inheritance;
//designing a user custom abstract data type
// the main aim of the program is to return two words or string simultaneously using abstract data type
class Student1
{
    private String name;
    private String regNumber;
    public Student1(){}
    public Student1(String name,String regNumber)
    {
        this.name=name;
        this.regNumber=regNumber;
    }
    public String toString()
    {
        return String.format("Student name: %s  RegNumber : %s",this.name,this.regNumber);
    }
}
class Lib
{
    public Student1 convertCaps(String name, String regNumber)// here the return type is Student1 and name of the function is convertCaps
    {
        Student1 student1=new Student1(name.toUpperCase(),regNumber.toUpperCase());
        return student1;
    }
}
public class ReturnTwoWords {
    public static void main(String[] args)
    {
        Lib lib=new Lib();
        System.out.println(lib.convertCaps("ram","21bci0001").toString());
        // here in short in above sentence student1 is returned then by .toString() method we print the name and regno
    }
}
