package com.Java;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		String x = "Welcome To India";
		String y = "Walcome To Indie";
		
		for (int i=0; i<x.length();i++){
		if(x.charAt(i)!= y.charAt(i)){
			System.out.println(x.charAt(i) + "-position of char" + i);
		}
		}

	}

}
