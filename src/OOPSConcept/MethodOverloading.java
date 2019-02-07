package OOPSConcept;

public class MethodOverloading {
	
//Method overloading --when the method name is same with different arguments or input parameters within the same class
//same method name with diff auguments and with diff data types
	
	public static void main(String[] args) {
MethodOverloading obj = new MethodOverloading();

      obj.sum();
      obj.sum(10);
      obj.sum(15, 20);
      obj.sum(22.15);

	}
	
	public static void main(int a){
		
	}
	public static void main( int a, int b){
		
	}
	//can we overload Main method?
            //yes, Main method can be overloaded
	    /// we can create main methods with same name but need to give arguments
	
     public void sum(){
	System.out.println("SUM method --with zero parameter");
	System.out.println();
}
     public void sum(int x){
	System.out.println("SUM method --with 1 input Parameter");
	System.out.println(x);
}
     public void sum(int x , int y){
    	 System.out.println("SUM method--with 2 input Parameters");
    	System.out.println(x+y);
     }
     public void sum(double a){
    		System.out.println("SUM method --with 1 input Parameter with diff data type");
    		System.out.println(a);

	}
}
// to call these non static methods , we need to create object in Main method and call these by giving obj ref
//duplicate methods are not allowed--same method name with same number of arg are not allowed
//we cannot create method inside a method
//

