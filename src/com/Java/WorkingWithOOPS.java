package com.Java;

public class WorkingWithOOPS {

	public static void main(String[] args) {
		StaticMethod obj = new StaticMethod();
			obj.add();//2nd way of reusing the code// we call Static and Non static methods with object
			obj.sum();
			System.out.println(obj.age);
			
	StaticMethod.sub();//calling method by class name//1st way of reusing the code- only static methods can be called
StaticMethod.mul();
	}

}
