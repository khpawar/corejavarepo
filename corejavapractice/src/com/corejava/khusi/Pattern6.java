package com.corejava.khusi;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern");
		int x = 1;
		int rows = scanner.nextInt();
		System.out.println( " * * Printing the  pattern... * * " );
		for(int i = 1; i<=rows; i++) {
			for(int j=rows; j>=i; j--) {
				System.out.print( "  " );
			}
			for (int k = 1; k<=i; k++) {
				System.out.print(x +  "  " );
				x++;
			}

			System.out.println();
		}
	}
}
