package com.corejava.khusi;

public class Overloading {
	int c;
	public void addition(){
		int a=10,b=20;
		System.out.println("Sum of a and b: "+(a+b));
	}
	public void addition(int a,int b){
		System.out.println(a+b);
	}
	public int addition(int a,int b,int c){
		return a+b+c;
	}
	public static void main(String[] args){
		Overloading obj = new Overloading();
		obj.addition();
		obj.addition(10,20);
		int ret= obj.addition(10,20,30);
		System.out.println(ret);
	}
}