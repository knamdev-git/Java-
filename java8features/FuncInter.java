package com.java8features;

@FunctionalInterface
interface KeyBoard{
	String Work();
}

public class FuncInter {
	public static void main(String[] args) {
		 
		//anonymous class for interface b/c can't use lambda expression
		KeyBoard dellKeyBoard = new KeyBoard() {
			public String Work() {
				return "Only Typing";
			}
		};
		
		//with lambda expression
		KeyBoard lenovoKeyBoard = ()-> "can type neatly" ;
		System.out.println(lenovoKeyBoard.Work());
	}
	
}
