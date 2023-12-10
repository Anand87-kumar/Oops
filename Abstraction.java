package com.anand;

abstract class Animal{
	abstract void walk(); 
	
	//Constructor
	Animal(){
		System.out.println("You are creating a new Animal");
	}
	public void eat() {
		System.out.println("Animal eats");
	}
}
class Horse extends Animal{
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}
class Chicken extends Animal{
	public void walk() {
		System.out.println("walks on 2 legs");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
		horse.eat();
	}
	
}
