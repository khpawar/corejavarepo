package com.corejava.khusi;

public class RelationalOperator {
   public static void main(String args[]){
	   int a = 10;
	   int b = 20;
	   int c = 30;
	    int smallest;
	   //find the smallest number
	   if(a<b) {
		   if(c<a) {
			   smallest =c;
		   }else {
			   smallest = a;
			   }
	   }else {
		   if(b<c) {
			   smallest = b;
			    }else {
			    	smallest = c;
			    	}
	   }
	   
	   System.out.println(smallest +" is the smallest number");
	   }
   }
   
	  
	   
   
   

