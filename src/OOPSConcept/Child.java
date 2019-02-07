package OOPSConcept;

public class Child extends Parent{//inheritance//"has - a relationship" - class to class relation - using extends key word

	public void shopping(){//overridden method
		System.out.println("child_cookies");//even though there is same shopping method in parent class, tool will call the child method//method over riding
		//when same method is present in parent class and child class with same name and same no.of arguments is called Method Overriding
		//Method should be non static to overload/overridden
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		property();
		c.shopping();

	}
	public static void shares(){
		System.out.println("BOFA shares");
	}

}
