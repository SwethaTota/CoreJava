package OOPSConcept;

public class Polymorphism {
//using methods from parent and child classes
	public static void main(String[] args) {
		
//static ploymorphism--compile time polymorphism
		Child c = new Child(); //created child class object to call methods from child class
		c.property();
		c.shares();
		c.shopping();
		System.out.println("*****************");
		
		Parent p = new Parent();
		p.property();
		p.shopping();
		System.out.println("**********************");
		
		//Dynamic Polymorphism -->Runtime polymorphism***
		//Top casting
		Parent p1 = new Child();// child class object can be referred by Parent class reference variable---Dynamic Polymorphism -->Runtime polymorphism***
	p1.property();
	p1.shopping();

	//we cannot access shares method from child class, cause object is child class , but referred by Parent class reference variable
	//only overriden methods can be called
	//we can access child classes only using compile polymorphism
	
	//Down Casting>>we can do but it gives exception
	//Child c1 = (Child)new Parent();//referred by Child class reference variable//java.lang.ClassCastException: com.Java.Parent cannot be cast to com.Java.Child
	//degrading parent class into child
	
	
	}

}
