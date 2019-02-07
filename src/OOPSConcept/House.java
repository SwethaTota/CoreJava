package OOPSConcept;

public class House {

	// Class variables called Global variables
	
	int year; //built yr
	int square; //sqft
	
	public static void main(String[] args) {
		//create object of House class
		//new House()>> is object of House class
		//a,b,c >>object reference variables
		//new keyword is used to create object
		
		House a = new House();
		House b = new House();
		House c = new House();
		
		a.year = 1990;//initialize the values
		a.square = 2500;
		
		b.year = 1995;
		b.square = 3000;
		
		c.year = 2000;
		c.square = 3500;
		
		System.out.println("before assigning the references");
		System.out.println(a.year);
		System.out.println(a.square);
		System.out.println(b.square);
		
		System.out.println("after assigining the references");
		a=b;
		b=c;
		c=a;
		
		a.year = 20;
		System.out.println(a.year);//20
		c.year = 50;
		System.out.println(a.year);//50
		System.out.println(c.year);//50 //// c=a as a value became 50
		
		
		
		

	}

}
