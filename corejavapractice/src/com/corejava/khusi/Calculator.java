package com.corejava.khusi;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		char operator;
		double num1,num2; int i=1;
		System.out.println("Press any letter to Quit");
		System.out.println("Enter num " + i + " = ");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number ");
		while(input.hasNextInt()) {//Q
			i++;
		num1 = input.nextInt();
		System.out.println("Enter second number");
		num2 = input.nextInt();
		System.out.println("Enter the operator(+, -, *, /)");
		operator = input.next().charAt(0);
		switch(operator) {
		case '+':
			System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2));
			break;
		case '-':
			System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1-num2));
			break;
		case '*':
			System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1*num2));
			break;
		case '/':
			System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1/num2));
			break;
		default:
			System.out.printf("%c is an invalid operator",operator);
		}
	}
}
}


