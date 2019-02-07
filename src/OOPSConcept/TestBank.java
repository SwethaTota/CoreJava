package OOPSConcept;

public class TestBank {

	public static void main(String[] args) {
		//compile or static polymorphism
		HSBCBank hb = new HSBCBank();//create object of HSBC class// we cannot create object of Interface
		
		hb.credit();
		hb.debit();
		hb.transferMoney();
		hb.educationLoan();
		hb.mutualFund();
		hb.carLoan();
		System.out.println("**************************");
		
		//Dynamic polymorphism/Runtime polymorphism***
		//child class object can be referred by parent Interface reference variable
		
		USBank ub = new HSBCBank();
		ub.credit();
		ub.debit();
		ub.transferMoney(); //only overriden methods will be called and not the separate methods created in child class(HSBC Bank)
		

	}
}
