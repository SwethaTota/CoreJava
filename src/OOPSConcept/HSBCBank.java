package OOPSConcept;

public class HSBCBank implements USBank,BrazilBank { //we are achieving multiple Inheritance --Implementing multiple Interfaces
	
//Is-a relationship- Interface to class --using implements key word
	//has-a relation-- Class to class --using extend key word

	//if a class is implementing any Interface, then its mandatory to define/override all the methods of Interface

	//overriding from USBank Interface
public void credit(){
	System.out.println("HSBC ---credit");
}
	public void debit(){
		System.out.println("HSBC --debit");	
	}
	
	public void transferMoney(){
		System.out.println("HSBC --transferMoney");	
	}
	///special methods of HSBCBank class:
	
	public void educationLoan(){
		System.out.println("HSBC-- educationLoan");	
	}
	public void carLoan(){
		System.out.println("HSBC --carLoan");
	}
	
	//Override Brazil Bank Method:
	public void mutualFund(){
		System.out.println("HSBC --mutualFund");	
	}
	
}
