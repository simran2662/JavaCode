package com.examples;

// method overloading + constructor
class Addition{
	int a;
	int b;
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public Addition() {
		
	}
	
	public void  addition() {
		System.out.println(a+b +",.........");
	}
	public void addition(double a, float b) {
		System.out.println(a+b +"double and float");
	}
}

public class Example5 {

	public static void main(String[] args) {
		Addition a=new Addition(10,20);
		a.addition();
		Addition a1=new Addition();
	    
	a1.addition(10.0, 20);

	}

}
