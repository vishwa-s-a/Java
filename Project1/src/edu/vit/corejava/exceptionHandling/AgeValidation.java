package edu.vit.corejava.exceptionHandling;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
class Courses{
    private String courseName;
    private Double credits;
    private String faculty;
    public Courses(){}
    public Courses(String courseName,Double credits,String faculty)
    {
        this.courseName=courseName;
        this.faculty=faculty;
        this.credits=credits;
    }
    @Override
    public String toString()
    {
        return String.format("[Course name: %s, Faculty name: %s, Credits: %f]",this.courseName,this.faculty,this.credits);
    }

}
class Address{
    private String doorNumber;
    private String area;
    private String landmark;
    private String place;
    private String district;
    private String state;
    private String pincode;
    public Address(){}
    
    public Address(String doorNumber, String area, String landmark, String place, String district, String state,
            String pincode) {
        this.doorNumber = doorNumber;
        this.area = area;
        this.landmark = landmark;
        this.place = place;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
    }
    @Override
    public String toString(){
        return String.format("Door Number: %s\nArea: %s\nLandmark: %s\nPlace: %s\nDistrict and State:%s and %s\nPincode: %s",
        this.doorNumber,this.area,this.landmark,this.place,this.district,this.state,this.pincode);
    }
}
class Person{
    private String name;
    private Address address;
    private LocalDate dob;
    public Person(){}
    public Person(String name, Address address, LocalDate dob) {
        this.name = name;
        this.address = address;
        this.dob = dob;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address.toString();
    }
    public LocalDate getDob() {
        return dob;
    }
    
    

}
class Student extends Person{
    Courses courses;
    public Student(String name, Address address, LocalDate dob,Courses courses)
    {
        super(name,address,dob);
        this.courses=courses;
    }
    @Override
    public String toString()
    {
        return String.format("Name: %s\nAddress:\n%s\nDate of Birth: %s\nCourses: %s",super.getName(),super.getAddress(),
        super.getDob().toString(),courses.toString());
    }
}
public class AgeValidation {
	public static Boolean checkAge(LocalDate dob)
	{
		Integer age;
		LocalDate today=LocalDate.now();
		age=(Period.between(dob,today).getYears());
		if(age>=18)
		return true;
		else
		return false;
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name,date;
        String doorNumber,area,landmark,place,district,state,pincode;
        System.out.println("Enter the name of the student: ");
        name=sc.nextLine();
        System.out.println("Enter the door number: ");
        doorNumber=sc.nextLine();
        System.out.println("Enter area: ");
        area=sc.nextLine();
        System.out.println("Landmark: ");
        landmark=sc.nextLine();
        System.out.println("place: ");
        place=sc.nextLine();
        System.out.println("District: ");
        district=sc.nextLine();
        System.out.println("State: ");
        state=sc.nextLine();
        System.out.println("Pincode: ");
        pincode=sc.nextLine();
        System.out.println("enter the date of birth in dd/mm/yyyy format: ");
        date=sc.next();
        String data[]=date.split("[/]");
        Integer dd=Integer.parseInt(data[0]);
        Integer mm=Integer.parseInt(data[1]);
        Integer yy=Integer.parseInt(data[2]);
        Student student=new Student(name, new Address(doorNumber,area,landmark,place,district,state,pincode), 
        LocalDate.of(yy,mm,dd), new Courses("java",3.5,"Anthoniraj"));
        System.out.println("************************************************************");
        System.out.println(student.toString());
	  if(checkAge(LocalDate.of(yy,mm,dd)))
		System.out.println("You are eligible to vote in this Elections");
	  else
		System.out.println("You are Not eligible to vote in this elections");
        sc.close();
        List<Student> btech=new ArrayList<Student>();
        btech.add(student);
        System.out.println(btech.get(0).toString());
    }
    
}


