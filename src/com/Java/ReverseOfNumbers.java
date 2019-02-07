package com.Java;

public class ReverseOfNumbers {

	public static void main(String[] args) {
		
		int a = 12345;
		 //int a = 13531;
		
		int x = a;
		int y = 0;
		
		while (a!=0){
			int z = a % 10;//5//4//3//2//1
			y = y * 10 + z;//0+5//0+4//0+3//0+2
			
			a = a/10;//1234//123//12//1
			
		}
		System.out.println("reverse of number :" + y);
		System.out.println("the value of a is: " + a);
		System.out.println("the value of x is :" + x);
		
		if (x==y){
			System.out.println("number is Palindrome");
		}
			else{
				System.out.println("number is not Palindrome");
			}
		}

	}


