package com.Java;

public class TwoDimensionArray {

	public static void main(String[] args) {
		String x[][] = new String [3][4];
		
		System.out.println(x.length); //2 -- Total no.of rows
		
		System.out.println(x[0].length);//4 -- total no.of columns
        
		//1st row //represents table rows and colums
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		//x[0][4] = "E";//ArrayIndexOutOfBoundsException:4//as there is no 4th column
		
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		
		//3rd row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		
		System.out.println(x[1][2]);
		System.out.println(x[0][3]);
		
		//To Print all the values of 2 dimension array: use 2 for loops
		//row=0, col= 0 to 3
		//row=1, col = 0 to 3
		//row=2, col= 0 to 3
		
		for (int row=0; row<x.length; row++){ //x.length represents total rows
			for(int col=0; col<x[0].length; col++){ //internal loop //x[0].length represents total col
				System.out.println(x[row][col]);
			}
			
		}
	}

}
