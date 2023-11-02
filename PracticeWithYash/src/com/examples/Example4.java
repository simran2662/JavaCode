package com.examples;

class Father{
	private String name;
	
	public void color() {
		System.out.println("dusky");
	}
}
class Child extends Father{
	
	public void nose() {
		System.out.println("straight");
	}
}
interface Mother{
	final Double hieght = null;
	public void behaviour();
}

class Simran implements Mother{

	@Override
	public void behaviour() {
		System.out.println("like father like me");	
	}
}

abstract  class Sister{
	public abstract void fighting();
}

class Alia extends Sister{
	@Override
	public void fighting() {
		System.out.println("we always fight");	
	}
}

public class Example4 {
	public static void main(String[] args) {
	Child c=new Child();
	c.color();
	c.nose();
	Simran s=new Simran();
	s.behaviour();
	Alia a=new Alia();
	a.fighting();
	}

}
