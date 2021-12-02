package com.corejava.khusi;
import java.util.Scanner;
public class OperatorCalculation {
	public static void main(String args[]) {
		int n1,n2,n3,ch;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");
		n1 = input.nextInt();
		System.out.println("Enter Second Number");
		n2 = input.nextInt();
		System.out.println("Choices Are:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter Your Choice");
		ch= input.nextInt();
		switch(ch) {
		case 1:
			n3= n1+n2;
			System.out.println("Addition = " + n3);
			break;
		case 2:
			n3 = n1-n2;
			System.out.println("Subtraction = " + n3);
			break;
		case 3:
			n3 = n1*n2;
			System.out.println("Multiplication = " + n3);
			break;
		case 4:
			n3 = n1/n2;
			System.out.println("Division = " + n3);
			break;
		default:
			System.out.println("You have entered wrong choice");
			
			}
		}
	}

