package com.corejava.khusi;

public class DoWhile {
   public static void main(String args[]){
	   int x = 1;
	   do {
		   
		   if(x%2 == 0){
			   System.out.println("value of x: " + x);  
		   }
		   x++;
	   }while (x < 100);
   }
}
