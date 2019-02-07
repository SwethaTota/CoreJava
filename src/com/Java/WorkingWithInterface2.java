package com.Java;

class Test1 implements TestInterface1,TestInterface2{
	// we are achieving multiple inheritance // "Is-a relation ship" --
	//Interface & class relation --using implements keyword
	// if any class is implementing any interface , it is mandatory to define/ override all the methods of Interface.
	
//overriding from TestInterface1
	public void Test1(){//we can change the logic
		int x = 20;
		int y = 50;
		System.out.println("Addition of 2 values are :" + (x+y));
	}
	
	public void Test2(){
		int x = 10;
		int y = 20;
		System.out.println("Subtraction of two values are :" + (y-x));
	}
	public void Test3(){
		int x = 10;
		int y = 20;
		System.out.println("multiplication of  two values are :" + (x*y));
	}
	
// Overriding from Interface2
	public void Sample(){
		System.out.println("This is Sample Method");
	}
}
public class WorkingWithInterface2 {

	public static void main(String[] args) {
		//we need to create object for class and call the methods
		
		TestInterface1 obj1 = new Test1(); //TestInterface1= Interface we created, obj1= object ref, Test1= class in which we call the interface and Complete
		TestInterface2 obj2 = new Test1();
		obj1.Test1();
		obj2.Sample();
		
		Test1 obj = new Test1();
		obj.Test1();
		obj.Test2();
		obj.Test3();
		obj.Sample();
		
		
	}

}
