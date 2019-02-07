package com.Java;

public class Variables {

	public static int x = 100; //static global variable//declared in class
	public int y = 20; //non static variable //we cannot call in method/Main Method/ another class/package
	
public static void Test(){
	
	int a = 10;//these are local variables - declared inside the method, can be called only within method and cannot be used in another method
	int b = 30;
	System.out.println(x);
	System.out.println(a+b);
	//System.out.println(y);//we cannot call non static variable in Static method.
}
	public static void main(String[] args) {
		System.out.println(x);
		Test();
		//System.out.println(y);//we cannot call non static variable in Main Method/ another class/package

	}

}
