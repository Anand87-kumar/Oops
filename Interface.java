package com.anand;

interface Animal1{
	public void walk();
	 
}
class Horse1 implements Animal1{
	public void walk() {
		System.out.println("walks on 4 legs");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Horse1 horse = new Horse1();
		horse.walk();
	}

}
