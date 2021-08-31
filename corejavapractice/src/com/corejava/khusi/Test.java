package com.corejava.khusi;
class PersonClass{
	public void display(){
		System.out.println("Person Class");
	}
}
class Student extends PersonClass{
	public void display(){
		System.out.println("I am not a student");
	}
}
class EmpClass extends Student{
	public void display(){
		System.out.println("I am now an Employee");
	}
}
public class Test {
	public static void main(String[] args){
		System.out.println("Test Class");
		PersonClass p = new PersonClass();
		p.display();
		PersonClass s = new Student();
		s.display();
		Student e = new EmpClass();
		e.display();
	}
}