package com.corejava.khusi;

public class StaticVariable {
	static String sum = "sum:";
	static String diff = "Difference of a and b:";

	public static void main(String args[]){
		int a = 10;
		int b = 20;
		int c = a+b;
		int e = a+c;
		int d = a-b;
		System.out.println(sum+c);
		System.out.println(sum+e);
		System.out.println(diff+d);

	}
}


