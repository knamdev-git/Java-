package com.java8features;

interface Contact{
	void name(String name);
	void phone();
}
//we didn't creat the class for the interface methods implementation

public class Feature {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//anonymous class which is used with an interface without making a class 
		Contact person1 = new Contact() {
			public void name (String n) {
				System.out.println(n+" ");
			}
			
			public void phone() {
				System.out.println("911919191");
			}
		};
		
		person1.name("Ram");
		
		// we can create another instance of the same anonymous class
		Contact person2 = person1.getClass().newInstance();
		
		person2.name("Jassy");
		person2.phone();
	}
}
