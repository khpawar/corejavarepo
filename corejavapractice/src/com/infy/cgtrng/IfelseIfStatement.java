package com.infy.cgtrng;

public class IfelseIfStatement {
	public static void main(String []args) {
		String customerType = "";
		int quantity = 2;
		int unitPrice = 10;
		int totalCost = 0;
		int discount = 5;
		int deliveryCharge = 5;
		totalCost = unitPrice * quantity;
		if (customerType == "Regular") {
			totalCost = totalCost - (totalCost * discount/100);
			System.out.println("You are regular customer and eligible for 5% discount");
		}else if (customerType == "Non-Regular"){
			totalCost = totalCost + deliveryCharge;
			System.out.println("You need to pay extra delivery charge of $5");
			System.out.println("Total cost: " + totalCost);
		}else 
			System.out.println("Invalid customer type");


	}

}


