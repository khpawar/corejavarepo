package com.corejava.khusi;

public class InstanceVariable{
	int c;

	public void addition(){
		int a = 10;
		int b = 20;
		c = a+b;
		System.out.println("sum of a and b is "+c);
	}
	public void difference(){
		int x = 100;
		int y = 150;
		c = x-y;
		System.out.println("Difference between a and b is "+c);
	}
	public static void main(String args[]){
		InstanceVariable inal=new InstanceVariable();
		inal.addition();
		inal.difference();
	}
}


