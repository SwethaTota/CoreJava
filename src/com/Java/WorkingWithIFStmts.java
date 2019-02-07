package com.Java;


public class WorkingWithIFStmts {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		int z = 1000;
		
		if(x>y){
			System.out.println("PASSED");
		}
		if (y>z){
		System.out.println("PASSED");
		}
		else{
			System.out.println("FAILED");
		}
if ((x<y) && (y<z)){
	System.out.println("value of z is greater");
}

if ((x>y) && (x>z)){
	System.out.println("vaue of x is greater");
}
else if ((y>z) &&(y>x)){
	System.out.println("value of y is greater");
}
else {
	System.out.println("value of z is greater");
}
	}

}
