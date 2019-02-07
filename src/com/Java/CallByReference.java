package com.Java;

class Number{
	int x;
}

public class CallByReference {

	int p;
	int q;
	
	public static void Test(Number a){
		System.out.println("value of a before incrementing:" + a.x);
		a.x = a.x+1;
		System.out.println("value of a after incrementing:" + a.x);
	}
	
	public static void main(String[] args) {
		 CallByReference obj = new CallByReference();
		 obj.p= 50;
		 obj.q = 100;
		 
		 obj.swap(obj);//obj is the reference...we are passing ref to ref
//after swap
		 System.out.println(obj.p);
		 System.out.println(obj.q);
		 
		 Number a = new Number();
		 a.x = 5;
		 System.out.println("value of a.x before calling Test method:" + a.x);
		 Test(a);
		 System.out.println("value of a.x after calling Test method:" + a.x);//after incrementing value is saved in a.x in CallByvalue
	}
//call by Ref...passing value of object reference
	private void swap(CallByReference t) {
	int temp;
	temp = t.p;
	t.p = t.q;
	t.q = temp;
	
			

}
}