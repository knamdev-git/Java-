package com.java8features;

interface Iname{
	void method1();
}

//inside of creating the class with implemented method  
class IClass implements Iname{
	public void method1() {
		System.out.println("Iclass method");
	}
}

public class LambdaFeature {
	public static void main(String[] args) {		
		//and create the obj then call method of interface through class 
		IClass ob = new IClass();
		ob.method1();
		
		//we use lamba expression for functional methods -> has only one method inside an interface
		Iname obj = (/* Parameter1, Parameter 2*/ )->{ System.out.println("This is only the method inside Iname"); };
		obj.method1();
	}
}
