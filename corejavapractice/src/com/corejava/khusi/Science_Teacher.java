package com.corejava.khusi;
interface Person{}
class Employee implements Person{}

public class Science_Teacher extends Employee{
	public static void main(String args[]){
		Employee e = new Science_Teacher();
		Science_Teacher s = new Science_Teacher();
		System.out.println(e instanceof Person);
		System.out.println(s instanceof Employee);
		System.out.println(s instanceof Person);
	}
}
