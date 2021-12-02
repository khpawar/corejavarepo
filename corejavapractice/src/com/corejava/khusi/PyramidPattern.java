package com.corejava.khusi;

public class PyramidPattern{
	public static void main(String args[]) {
		//i for rows and j for columns
		//row denotes the number of rows you want to print
		int i,j,n=6;
		for(i=0; i<n; i++) {

			for(j=2*(n-i); j>1; j--)
			{
				System.out.print( " " );
			}
			for(j=0; j<=i; j++)
			{
				
				System.out.print(" 1 ");
			}
			//throws the cursor in a new line after printing each line
			System.out.println();
		}
	}
}
