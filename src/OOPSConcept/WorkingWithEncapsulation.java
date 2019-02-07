package OOPSConcept;

class Encapsulation{ //Encapsulation is hiding the required data// we use Getters and Setters in encapsulation
	private int rollNum; 
	private int age;
	
	//Getters
	public int getrollNum(){ //since we didn't use void, should write return stmt
		return rollNum;
		
	}
	public int getage(){
		return age;
	}
	//setters
	public void setrollNum(int xValue){
		rollNum = xValue;
		
	}
	public void setage(int xValue){
		age = xValue;
	}
}

public class WorkingWithEncapsulation {

	
public static void main(String[] args) {
		
       Encapsulation obj = new Encapsulation();
       obj.setrollNum(20);
       obj.setage(6);
       
       System.out.println("Roll number is :" + obj.getrollNum());//we use getters to know the value
       System.out.println("age is : " + obj.getage());
	}

}
