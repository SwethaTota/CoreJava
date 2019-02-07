package OOPSConcept;

public class WrapperClass {

	public static void main(String[] args) {
		
		String s = "100";
		System.out.println(s+20);
//use wrapper class to convert String to int
		
		//data conversion from String to int:
		int i = Integer.parseInt(s); //parse String... i is storing this int value
		System.out.println(i+20);
		
		//wrapper classes - Integer, double,char,boolean
		
		//string to double conversion:
	String s1 = "22.35";;
	double d = Double.parseDouble(s1);
	System.out.println(d+10);
	    
	//String to boolean:
	String s2 = "true";
	boolean b = Boolean.parseBoolean(s2);
	System.out.println(b);
	
	//int to String conversion
	int x = 10;
	System.out.println(x+20);//30
	String y = String.valueOf(x);
	System.out.println(y+20);//String concatenation 1020
	
		/*String u = "100A";
		Integer.parseInt(u);//.NumberFormatException:  For input string: "100A"//as this is not pure numeric value
		*/
		//double to String
		double d2 = 10.22;
		System.out.println(d2+10);
		String y2 = String.valueOf(d2);
		System.out.println(y2+10);
	}

}
