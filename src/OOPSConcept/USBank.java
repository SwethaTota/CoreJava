package OOPSConcept;

public interface USBank {

	int min_bal = 100;////Initialize var//value of variable is final
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Properties of Interface:
		//1. only Method declaration, no Method body- only method prototype
		//2.In Interface we can declare variables, Var are by default static in nature
		//3. Variable value will not change, Its final/ constant in nature
		//4.*****No Static Method in Interface// it is a part of OOPS concept, so we create objects
		//5.There is no Main method in Interface
		//6.Interfaces are abstract in nature- we cannot create object of Interface
}
