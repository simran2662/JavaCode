package com.examples;

 class Example2 {

	String name;

	public void dancer() {
		System.out.println("parent class");
	}
}

public class Example1 extends Example2 {
	public void singer() {
		System.out.println("child class");
	}

	public String toString() {
		return "Name:" + name;
	}

//public class Example1{
//	
	public static void main(String[] args) {
		Example1 e = new Example1();
		e.name = "alia";
		e.singer();
		System.out.println(e);

	}
}


