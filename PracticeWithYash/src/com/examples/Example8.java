package com.examples;

import java.util.ArrayList;

public class Example8 {

	public static void main(String[] args) {
		String[] s= {"simran","yash","simran"};
		ArrayList<String> arr=new ArrayList<>();
		for(String temp:s) {
			if(!arr.contains(temp)) {
				arr.add(temp);
			}
		}
		System.out.println(arr);
	}

}
