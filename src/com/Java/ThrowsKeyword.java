package com.Java;

public class ThrowsKeyword { 
	//used when we have method chaining
	//used for exception handling but not for reporting
	//Exception is caught by JVM
	//the program will be terminated  //to handle this we have to use Try- catch block

	public static void main(String[] args){
	//public static void main(String[] args) throws ArithmeticException{
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("Hello");
	}

	/*public void sum() throws ArithmeticException{ 
		div(); 
		
	}*/
	public void sum(){
		try {
			div();
		} 
		catch (ArithmeticException e){
			
		}
	}
		
	public void div() throws ArithmeticException{
		int i = 9/0;
		
	
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
