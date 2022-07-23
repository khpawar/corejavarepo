package com.infy.cgtrng;

public class UnaryOperator {
	public static void main(String[] args) {
		int num1=10;
		int num2=3;
		System.out.println(num1++);
		System.out.println(num2++);
		System.out.println(num1++ + ++num1);
		System.out.println(num2++ + ++num2);
		System.out.println(num1-- + --num1);
		System.out.println(num2-- + --num2);
	}

}
