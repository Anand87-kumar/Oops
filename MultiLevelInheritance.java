package com.anand;

class Shape2{
	public void area() {
		System.out.println("displays area");
	}
}
class Triangle2 extends Shape2{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
class EquilateralTriangle extends Triangle2{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		

	}

}
