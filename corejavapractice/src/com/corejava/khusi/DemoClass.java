package com.corejava.khusi;
import java.util.Arrays;
public class DemoClass {
	static void secondLargest(int[] input) {
		int firstLargest, secondLargest;//checking first two elements of input array
		if(input[0]> input[1]) {//If first element is greater than second element
			firstLargest = input[0];
			secondLargest = input[1];
		}
		else
		{
			//If  second element is greater than first element
			firstLargest = input[1];
			secondLargest = input[0];
		}
		//Checking remaining elements of input array
		for(int i = 2; i < input.length; i++) {
			if(input[i]> firstLargest) {
				//If element at 'i' is greater than 'firstLargest'
				secondLargest = firstLargest;
				firstLargest = input[i];
			}
			else if (input[i] < firstLargest && input[i] > secondLargest) {
				secondLargest = input[i];
			}
		}
		System.out.println("Input Array :");
		System.out.println(Arrays.toString(input));
		System.out.println("SecondLargest Element : ");
		System.out.println(secondLargest);
	}
	public static void main(String[] args) {
		secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796});
	}
}
