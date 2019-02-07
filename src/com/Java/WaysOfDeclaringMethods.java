package com.Java;

public class WaysOfDeclaringMethods {

	public static void test(){
		System.out.println("This is a Test method");
	
	}
	public static void test(int x){ //method with single Argument
		System.out.println("The value of x is:" + x);
	
		}
	public static void Add(){
		int a = 10;
		int b = 20;
		System.out.println("Addition of 2 values are :" + (a+b) );
	}
	public static void test(int x, int y){//method with 2 arguments//only declaring variables, we will pass the values in Main method when we call this method
		System.out.println("Multiplication of 2 values are:" + (x*y));
	}
	
	
	public static void main(String[] args) {
		test();
		test(5);
		Add();
		test(5, 2);
		

	}

}
