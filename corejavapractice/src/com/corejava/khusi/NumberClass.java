package com.corejava.khusi;

public class NumberClass {
	public static void main(String args[]){
		Integer x = 5;
		Integer y = 10;
		Double d = -100.675;
		Float f = -90.20f;

		System.out.println(x);
		System.out.println(x.equals(y));
		System.out.println(x.compareTo(3));
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(f));
		System.out.println(Math.min(x,y));
		System.out.printf("The value of e is %4f%n",Math.E);
		System.out.println(Math.random());
	}
}