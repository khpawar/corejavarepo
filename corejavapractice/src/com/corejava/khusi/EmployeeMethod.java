package com.corejava.khusi;
class PersonMethod{
	String name= "Monica";
	public void display(){
		System.out.println("This is super class");
	}
}
public class EmployeeMethod extends PersonMethod{
	String name= "Sameer";
	public void display(){
		System.out.println("Super class name: "+super.name);
		System.out.println("Sub class name: "+name);
	}
	public void finalDisplay(){
		super.display();
	}
	public static void main(String[] args){
		EmployeeMethod c = new EmployeeMethod();
		c.display();//this will call the sub class method
		c.finalDisplay();//this will call the superclass method
	}

}
