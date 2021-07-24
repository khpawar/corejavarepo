package com.corejava.khusi;

public class ReturnValue {
	public static int returnNumber(){
		int empID = 201;
		return empID;
	}
	public static void main(String[] args){
		int eID = returnNumber();
		System.out.println(eID);

	}

}
