package com.corejava.khusi;
import java.util.Scanner;
public class Matrix {
	public static void main(String[]args) {
		int A[][]= {{1,2,3},{2,4,3},{3,4,5}};
		int B[][]= {{4,5,6},{8,7,6},{3,4,5}};
		int C[][]=new int[3][3];
		for (int i = 0; i<3; i++) {
			for(int j =0; j<3; j++) {
				C[i][j] = A[i][j]+B[i][j];
				System.out.print(C[i][j] + "  " );
			}
			System.out.println();
		}
	}
}













