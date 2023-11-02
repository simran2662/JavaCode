package com.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) {
		Integer[] a= {1,2,3,4,5,2,1};
		ArrayList<Integer> arr=new ArrayList<>();
		arr.addAll(Arrays.asList(a));
		System.out.println("My ArrayList:"+arr);
		ArrayList<Integer> arr1=new ArrayList<>();
			for(Integer temp:arr) {
				if(!arr1.contains(temp)) {
					arr1.add(temp);
				}
			}
			System.out.println(arr1);
		
	}

}
