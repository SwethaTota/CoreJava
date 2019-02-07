package com.Java;

public class CallByValue {

	public static void Test(int a){
		System.out.println("value of a before incrementing :" + a);
		a++;
		System.out.println("value of a after incrementing:" + a);
	}
	
	public static void main(String[] args) {
		
       int x = 20;
System.out.println("value of x before calling test method:" + x);
Test(x);//passing x value to "a"
System.out.println("value of x after calling Test method:" + x);//not saving the incremented x value from Test method
	}

}
