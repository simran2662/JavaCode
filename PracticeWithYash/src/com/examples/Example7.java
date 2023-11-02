package com.examples;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 2, 3, 5, 6, 7 };
		ArrayList<Integer> arr = new ArrayList<>();
		for (Integer temp : a) {
			if (!arr.contains(temp)) {
				arr.add(temp);
			}
		}
		System.out.println(arr);

	}
}
