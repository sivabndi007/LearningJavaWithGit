package com.basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<Integer,String> dataMap = new HashMap<Integer,String>();
		dataMap.put(123, "shiva");
		dataMap.put(456, "suresh");
		
		System.out.println(dataMap.get(123));
		
		Iterator<Integer> it = dataMap.keySet().iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("key is "+ i + "value is"+ dataMap.get(i));
		}
		
		for(Integer key :dataMap.keySet()) {
			System.out.println("key is "+ key + "value is"+ dataMap.get(key));	
		}
		
		for(String value :dataMap.values()) {
			System.out.println(value);	
		}
		
	}
}
