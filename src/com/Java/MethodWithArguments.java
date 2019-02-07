package com.Java;

public class MethodWithArguments {

	public static void Test(){
		System.out.println("Method with no arguments");
	}
	public static void Test(int x){
		System.out.println("Method with single argument");
		
	}
	public static void Test(int x, int y){
		System.out.println("Method with multiple arguments");
	}
		public static void Add(int a, int b){ //a and b are arguments
			System.out.println("addition of two values are :" +(a+b));
		}

	public static void main(String[] args) {//when we call Add method, system will force us to give argument values (parameters)
		Add(10, 15);
		Add(22, 220);//all the values given here are Parameters***
		
	}

}
