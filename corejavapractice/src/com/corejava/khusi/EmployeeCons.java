package com.corejava.khusi;
class personCons{
	String name;
	personCons(){
		System.out.println("This is super class constructor");
	}
	personCons(String name){
		this.name = name;
	}
}
public class EmployeeCons extends personCons{
	int eID;
	EmployeeCons(){
		super();
		}
	EmployeeCons(String name, int eID){
		super(name);
		this.eID = eID;
		}
public void display(){
   System.out.println("Ename: "+name+", EID:"+eID);
}
   public static void main(String[] args){
	EmployeeCons e1 = new EmployeeCons();
	EmployeeCons e = new EmployeeCons("Monica",10);
	e.display();
	}
}
