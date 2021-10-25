package com.basics;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> dataList = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		dataList.add("one");
		dataList.add("two");
		dataList.add("three");
		dataList.add("four");
		dataList.add("five");
		
		// for loop
		for(int i=0;i<dataList.size();i++) {
			System.out.println(dataList.get(i));
		}
		// for each loop
		for(String data : dataList) {
			System.out.println(data);
		}
		
		System.out.println(dataList.contains("one"));
		System.out.println(dataList.contains("six"));
		System.out.println(dataList.remove("one"));
		System.out.println(dataList.contains("one"));
	}
}
