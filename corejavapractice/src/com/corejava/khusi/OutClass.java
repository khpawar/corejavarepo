package com.corejava.khusi;
abstract class AnonymousClassExam{
	public abstract void display();
	}
public class OutClass {
	public static void main(String[] args){
		AnonymousClassExam inclass = new AnonymousClassExam(){
		  public void display(){
			  System.out.println("This is an example of Anonymous Inner Class");
			  }
		};
		inclass.display();
		}
  }
