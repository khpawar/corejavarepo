package com.corejava.khusi;

public class ArrayMethodArguments {

	public static void printArray(int[] array){
		for (int i = 0; 1 < array.length; i++)
		{
			System.out.print(array[1]+" ");

		}
	}
	public static void main(String[]args){
		printArray(new int[]{3,1,2,6,4,2});
	}
}

