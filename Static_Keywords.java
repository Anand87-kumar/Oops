package com.anand;

class Student4 {
    String name;
    static String school;
    
    public static void changeSchool() {
    	school = "newschool";
    }
}

public class Static_Keywords {
    public static void main(String[] args) {
        Student4.school = "ABC"; 
        Student4 s1 = new Student4();
        s1.name = "Tony";
        System.out.println(Student4.school); 
    }
}

