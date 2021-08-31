package com.corejava.khusi;
interface persons{
	public void department();
	void jobRole();
}
public class Employees implements persons{
	public void department(){
		System.out.println("Department: L&D");
	}
	public void jobRole(){
		System.out.println("Job: corporate Trainer");
	}
	public static void main(String []args){
		Employees e = new Employees();
		e.department();
		e.jobRole();
	}
}
