package com.basics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> dataSet = new HashSet<String>();
		System.out.println(dataSet.add("one"));
		System.out.println(dataSet.add("one"));
		System.out.println(dataSet.add("two"));
		
		Iterator<String> it = dataSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
