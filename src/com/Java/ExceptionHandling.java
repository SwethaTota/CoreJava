package com.Java;

public class ExceptionHandling {

	public static void main(String[] args) {

		//uncaught exception:
		//int i =9/0;
		//System.out.println(i);//it will give ArithmeticException: / by zero and the program will be terminated
		
		//caught exception
		//Thread.sleep(2000);//it will how to handle by adding throws
		
		//Handling Exceptions:
		//1. try-catch block //catch the exception and continues the execution of program
		//a.used to catch exception
		//b.used for reporting exception--when exception comes to catch block ,we can take the screen shot and generate log, debug the code.
		
		try{
			int i = 9/0;
		}
		catch(ArithmeticException e){//inside catch write the exception name //e is the reference
			e.printStackTrace();
			System.out.println(e.getMessage());//gives the error message
			
		}
		System.out.println(" Hello");
		System.out.println(" Hello");
		System.out.println(" Hello");
		
		
		//2. Throws Keyword //we can catch exception but not be used for reporting
		//3. Throw Keyword //we don't use generally
		
		// Throwable class---Parent>>>1.Error, 2. Exception
		//we can use throwable class in catch block when we don't know which type of exception we get
		//catch (throwble e)
		//catch(Exception e)//Exception for all types of Exceptions>>nullpoint/ Arithmetic etc
		

	}

}
