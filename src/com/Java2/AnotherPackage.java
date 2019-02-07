package com.Java2;

import com.Java.StaticMethod;//tool will import the code from another package/class
import com.Java.Variables;

public class AnotherPackage {

	public static void main(String[] args) {
		StaticMethod.add();
		Variables.Test();//to call method from diff class, copy class name and put .Ctrl+spacebar
		System.out.println(Variables.x);
		//System.out.println(Variables.y);//error- Cannot make a static reference to the non-static field Variables.y// y is non static variable
		
	}

}
