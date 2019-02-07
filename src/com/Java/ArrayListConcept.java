package com.Java;

import java.util.ArrayList;

public class ArrayListConcept {//Dynamic

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(100);//0 // add is storing/inserting the value not as addition method here
		ar.add(200);//1
		ar.add(500);//2
		
		System.out.println(ar.size());
		ar.add("Ronit");//3
		ar.add(23.33);//4
		ar.add('s');//5
		ar.add('$');//6
		System.out.println(ar.size());
		ar.remove(5);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));// to get the value .get method
		//System.out.println(ar.get(6));//IndexOutOfBoundsException --because we have removed 5th index and total index is 6
		
		//To print all the values of ArrayList: for loop
		for(int i=0; i<ar.size();i++){
			//System.out.println(i);//this gives index numbers, to know values ar.get(i)
			System.out.println(ar.get(i));
		}
//To restrict only to specific data type create another object as below(
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Ronit"); throws error as it is Sting
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Raaga");
		ar2.add("Ronit");
		System.out.println(ar2);
		System.out.println(ar2.get(1));
	}

}
