package com.Java;

class Test implements TestInterface1{ //Interfaces will be implemented stage by the time we call them, so we have to add a key word "implements"
	
	public  void Test1(){
		System.out.println("This is Test1 Method");
	}
	public void Test2(){
		System.out.println("This is Test2 Method");
	}
	public void Test3(){
		System.out.println("This is Test3 Method");
	}
}
public class WorkingWithInterface1 {

	public static void main(String[] args) {
		System.out.println(TestInterface1.sum);
		
//TestInterface1.sum = 500;// compilation problem: //the value of Interface variable cannot be changed
		TestInterface1 obj = new Test(); //we can call the methods with the help of obj
          obj.Test1();
          obj.Test2();
          obj.Test3();
          
	}

}
