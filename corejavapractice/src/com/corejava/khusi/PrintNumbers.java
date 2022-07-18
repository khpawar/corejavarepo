package com.corejava.khusi;
import java.util.Scanner;
public class PrintNumbers {
	public static void printNos(int n) {
		if(n>0)
		{
		printNos(n - 1); 
				System.out.println(n + " ");
		}
		return;
	}
		public static void main(String[] args){
			printNos(100);
		}
	}


