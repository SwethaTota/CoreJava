package com.Java;



public class ForLoop {

	public static void main(String[] args) {
		
		//Initialization;Condition;Increment/Decrement
		
		for(int i=1; i<5; i++){//initialization,condition, increment
			System.out.println(i);
		}
System.out.println("************************");
		for(int j=10; j>1; j--){//initialization,condition, decrement
	System.out.println(j);
}
		System.out.println("************************");	
		//Multiplication table of 5
		//5 * 1 = 5
		//5 * 2 = 10
		int x =5;
		for(int a=1; a<=10; a++){
			System.out.println("5 * " + a + " = " + (x*a));
		}
		
	}

}
