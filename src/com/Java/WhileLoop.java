package com.Java;

public class WhileLoop {

	public static void main(String[] args) {
		
		int x = 1;//Initialization
		
		while(x<=10){//conditional
			System.out.println("The value of x is :" +x);
			x++;//Incremental/ Decremental
			
		}
		//Disadvantage: While Loop will generate infinite loop if you don't give Increment/decrement part
		
		/*while(x<2){
			System.out.println("The value of x is :" + x);
		}*/

	}

}
