package com.corejava.khusi;
import java.util.*;
public class BinarySearch {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		int p,c,m;
		System.out.println("Enter the marks of student");
		System.out.println("Physics Marks");
		p=sc.nextInt();

		System.out.println("Chemistry Marks");
		c=sc.nextInt();

		System.out.println("Mathematics Marks");
		m=sc.nextInt();
		int choice=sc.nextInt();
		int Totalmarks= p+c+m;
		int Average= Totalmarks/3;
		switch(choice) {
		case 1:
			System.out.println("Total marks: " +Totalmarks);
			break;
		case 2:
			System.out.println("Average: "+Average);
			break;
		case 3:
			System.out.println("Grade A-marks>=80");
			break;
		}
		Default://optional
			System.out.println("Invalid Grade");
		
		
	}
}


