package com.anand;

class Student{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public void printInfo(String name) {
		System.out.println(this.name);
	}
	public void printInfo(String name,int age) {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	//constructor
	Student(){
		System.out.println("constructor called");
	}
	Student(String name ,int age){
		this.name = name;
		this.age = age;
	}
}

public class OopsEx2 {

	public static void main(String[] args) {
		Student s1 = new Student("aman",24);
		//s1.name = "Anand";
		//s1.age  = 24;
		
		s1.printInfo();

	}

}
