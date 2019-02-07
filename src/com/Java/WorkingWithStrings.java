package com.Java;

public class WorkingWithStrings {

	public static void main(String[] args) {
		String s1 ="Jack in the Box";
		String s2 = "This is Selenium Training";
		String s3 = "this is selenium training";
		
System.out.println(s1);
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s2.length());//length count starts with 1
System.out.println(s1.charAt(3));// charAt- char count starts with 0
System.out.println(s1.startsWith("Ja"));//boolean result
System.out.println(s2.endsWith("g"));//boolean 
System.out.println(s1.contains("k"));//boolean//verify specific char is there or not

System.out.println(s1.replace("in", "at")); //to replace older char with new char
System.out.println(s2.replace("This", "That"));
System.out.println(s2.replaceFirst("i", "I"));//to replace only first occurrence of the letter

System.out.println(s1.concat(s2));//joining 2 strings by using concat method
System.out.println(s1+s2);//by using arithmetic operator

System.out.println(s2.indexOf('s'));//***//first occurrence of s// 0,1,2,3 - first s is the 3rd char
System.out.println(s2.indexOf('s',s2.indexOf('s')+1));//second occurrence of s
System.out.println(s2.indexOf("is"));//first i place is 2
System.out.println(s1.indexOf("is")); //gives -1.... as there is no such value

        //String comparison:
System.out.println(s1.equals(s3));
System.out.println(s2.equals(s3));
System.out.println(s2.equalsIgnoreCase(s3));

        //substring:
System.out.println(s1.substring(0));
System.out.println(s1.substring(0, 9));//Jack in t/// starts with 0, 9th value will not be displayed

       //Trim:
String r = " Heritage Valley  ";
System.out.println(r);
System.out.println(r.trim());//it will trim the space before and end

       //Split:****
String test = "This_is_Selenium_Training";
String testval[] = test.split("_"); /// "_" will be removed and 4 values will be there
                     //since there are 4 values, we need to create Array Variable. return type of split is String Array

for(int i=0; i<testval.length; i++){ //to know the values write for loop
System.out.println(testval[i]);
}


	}

}
