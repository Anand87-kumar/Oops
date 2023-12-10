package com.anand;

class Student1{
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    //constructor non parmerized 
//    Student1(){
//    	System.out.println("constructor called");
//    }
//    //parmerterized consturctor
//    Student1(String name,int age){
//    	this.name = name;
//    	this.age = age;
//    }
    //copy constructor
    Student1(Student1 s2){
    	this.name = s2.name;
    	this.age =s2.age;
    }
    Student1(){
    	
    }
}

public class OopsEx3_CopyConstructor {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "anand";
        s1.age = 24;
        
        Student1 s2 = new Student1(s1);
        s2.printInfo();
        s1.printInfo();
    }
}

