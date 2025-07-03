package Inheritance;


class Employee{
	String name;
	int id;
	double Salary;
	 
	Employee(String name,int id,double Salary){
		this.name=name;
		this.id=id;
		this.Salary=Salary;
	}
	public void displayDetails() {
		System.out.println("Name: " + name + ", ID: " + id + " ,  Salary: $ " + Salary);
	}
}

class Manager extends Employee{
	int teamSize;
	public Manager(String name,int id,double Salary,int teamSize){
		super(name,id,Salary);
		this.teamSize=teamSize;
		
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("team size: " + teamSize);
	}
	
	
}

class Developer extends Employee{
	String programmingLang;;
	public Developer(String name,int id,double Salary,String lang){
		super(name,id,Salary);
		this.programmingLang=lang;
	
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language: " + programmingLang);
	}
	
	
}
class Intern extends Employee{
	int durationMonths;
	public Intern(String name,int id,double Salary,int durationMonths){
		super(name,id,Salary);
		this.durationMonths=durationMonths;
		
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Duration Months: " + durationMonths);
	}
	
	
}


public class EmployeeSystem {
	public static void main(String[] args) {
		Employee e1=new Manager("Kriti" ,101,90000,5);
		Employee e2=new Developer("Ashita" ,101,75000,"java");
		Employee e3=new Intern("Vanshu" ,101,22000,5);
		
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
	
		

		
		
	}
	

}
