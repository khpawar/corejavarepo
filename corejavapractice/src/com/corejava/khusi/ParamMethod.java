package com.corejava.khusi;

public class ParamMethod {
	public static void swapFunction(int n1, int n2){
		int n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("After swapping(Inside), a = " + n1
				+ " b = " + n2);
	}
	public static void main(String[]args){
		int a = 30;
		int b = 45;
		System.out.println("Before swapping, a = " +
				a + " and b = " + b);
		swapFunction(a,b);
	}
}
