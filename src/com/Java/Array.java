package com.Java;

public class Array {

	public static void main(String[] args) {
		//To store similar data type values in a Array variable
		//One dimensional Array
		//advantages: we can store multiple values in a single variable
		//disad: 1. size is fixed-- static array// to overcome this we use Collections --ArrayList, Hashtable---use Dynamic array
		//2. stores only similar data types values//to overcome this we use Object array
		
		/*1. int array
		lowest bound/index = 0
		upper bound/index = n-1(n is the size of array)
*/
		int i[] = new int[3];// i is  the array variable , int[3] holds 3 values
		i[0] = 10;
		i[1] = 20;
		i[2] = 50;
		System.out.println(i[1]);
		//System.out.println(i[3]); i[3] is the 4th value and it doesn't exist, so it will throw ArrayIndexOutOfBoundsException
		System.out.println(i.length);//size of array
		//to know all values of array, use for loop//j<i.length --do not give <= as the i[3] doesn't exist
		
		for (int j=0; j<i.length; j++){
			System.out.println(i[j]);
		}
		//2. double array
		double d[] = new double [3];
		d[0] = 22.12;
		d[1] = 13.33;
		d[2] = 55.55;
		
		//3.char array
		char c[] = new char[2];
		c[0] = 'a';
		c[1]= '$';
		
		//4 boolean array
		boolean b []= new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5. String array
		String s[]= new String[2];
		s[0]= "Ronit";
		s[1]="Hello";
		System.out.println(s[1]);
		System.out.println(s.length);
		
		//6. object array: // Object is a super class ---Object array is used to store different data type values
		Object ob[]= new Object[5];
		ob[0]= "Ronit";
		ob[1]= 5;
		ob[2]= 12.33;
		ob[3]= 'p';
		ob[4]= 8/8/2012;
		System.out.println(ob[2]);
		System.out.println(ob.length);
		
		
		
		
		
		
	}

}
