package com.Java;


public class ReverseString {

	public static void main(String[] args) {
		 //reverse a String
		//Do we reverse function in String? no, String is immutable, no reverse function
		
		String s = "Selenium";
		// 1. For Loop
		
		int len = s.length();//8 (0-7 char)
		  String rev ="";
		 
		 for (int i=len-1; i>=0; i--){
			rev = rev + s.charAt(i);//first i=len-1(8-1=7 (m)) , next i = 7-1(6) which is greater than 0, prints u,......////muineleS
		 }
     System.out.println(rev);//write this output stmt after FOR loop
     
     //2. Using String Buffer class: String bUffer is mutable, it has reverse function
     
     StringBuffer sf = new StringBuffer (s);//passing String s
     System.out.println(sf.reverse());
	}

}
