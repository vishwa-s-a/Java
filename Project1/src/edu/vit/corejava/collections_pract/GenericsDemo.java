package edu.vit.corejava.collections_pract;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Student{
    private String regNumber;
    private Double cgpa;
    public Student(String regNumber, Double cgpa) {
        this.regNumber = regNumber;
        this.cgpa = cgpa;
    }
    @Override
    public String toString() {
        return "Student [regNumber=" + regNumber + ", cgpa=" + cgpa + "]";
    }
    
}
public class GenericsDemo {
    public static void main(String[] args) {
        List details=Arrays.asList("21abc2929","ram",29);
        List<Integer> number=Arrays.asList(1,2,3,4);
        List<String>name=Arrays.asList("kamal","hasan");
        List<Student> student=Arrays.asList(new Student("vishnu",7.6),new Student("Laxman",9.0));
        // all the below methods are correct
        List<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        var c=new ArrayList<Integer>();
        for(Student i:student)
        {
            System.out.println(i.toString());
        }
        for(String i:name)
        {
            System.out.println(i);
        }
    }
}
