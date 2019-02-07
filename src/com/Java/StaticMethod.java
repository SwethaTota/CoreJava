package com.Java;

public class StaticMethod {
	
	//Scope of Global variables: will be available across all the functions/methods with some conditions.
	String name = "Ronit"; //non static global variable
	static int age = 6; //static global variable
	
	//static methods can be called within class/some other class/ another package

	public static void add(){//we have to call this method in Main method//code exe starts in Main method
		int x = 10;
		int y = 20;
		System.out.println("Addition of two values are :" + (x+y));
		sub();
		
	}
	public void sum(){ //Non static method
		System.out.println("Sum Method");
	}
	
	public static void main(String[] args) {
		
            add();
            mul();
           
//How do we call static methods and variables?
          //1. direct calling;
              sub();
              
          //2. calling by class name
              StaticMethod.add();
              System.out.println(age);//direct calling//static global variable
              System.out.println(StaticMethod.age);//calling by class name
              
 //How to call Non static methods and variables
              //1. by creating object to class
              StaticMethod obj = new StaticMethod();
           obj.sum();//calling non static sum method by object reference
           System.out.println(obj.name);//name is non static global variable, we need to call with obj.name (obj ref)

//can we access static method by using obj ref? YES but it is not a good practice. we can call static method directly, no need of obj ref
           obj.sub();//warning will be given
	}

	public static void sub(){
		int x = 30;
		int y = 12;
		System.out.println("Subtraction of two values are :" + (x-y));
	}
	public static void mul(){
		int a = 10;
		int b = 15;
		System.out.println("multiplication of two values are :" + (a*b));
	}
}
