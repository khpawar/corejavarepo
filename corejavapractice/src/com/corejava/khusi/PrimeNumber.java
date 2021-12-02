package com.corejava.khusi;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number to check prime or not");
		Scanner scanner = new Scanner(System.in);
		int number= scanner.nextInt();
		int i = 2,count =0;
		while (i <= number) {
			if(number % i ==0) {
				count++;
				break;
			}
			i++;
		}
		if (count ==0) {
			System.out.println(number + " is prime number");
		}
		else {
			System.out.println(number + " is not a prime number");
		}
	}
}
