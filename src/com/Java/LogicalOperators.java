package com.Java;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int age = 25;
		int Salary = 10000;
		//AND Operator //&&
		System.out.println("Age is T and Salary is T:" + ((age==25) && (Salary==10000)));//== for comparison, = is to replace left side with right
		System.out.println("Age is T and Salary is F:" + ((age==25) && (Salary!=10000)));
		System.out.println("Age is F and Salary is T:" + ((age!=25) && (Salary==10000)));
		System.out.println("Age is F and Salary is F:" + ((age!=25) && (Salary!=10000)));
		
		System.out.println("****************************************");
		
		//OR Operator//||
		System.out.println("Age is T OR Salary is F:" + ((age==25) || (Salary!=10000)));
		System.out.println("Age is T OR Salary is F:" + ((age==25) || (Salary!=10000)));
		System.out.println("Age is F OR Salary is T:" + ((age!=25) || (Salary==10000)));
		System.out.println("Age is F OR Salary is F:" + ((age!=25) || (Salary!=10000)));
		
	}

}
