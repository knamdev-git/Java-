package com.java8features;

enum Status{
	Pending, Running, Stopped, Success;
}

public class Enum_Class {
	public static void main(String[] args) {
		Status s = Status.Pending;

		int order = 1;
		
		if(order == 1) {
			s = Status.Running;
		}
		
		if(s.equals(Status.Running)) {
			System.out.println("Your Pizza is cooking..");
		}
	}
	
}
