package com.basics;

public class ConstructorExample {
	
	public String name;
	
	public int eid;
	
	ConstructorExample(String ename, int empId){
		this.name = ename;
		this.eid = empId;
	}

	public static void main(String[] args) {
		
		ConstructorExample e1 = new ConstructorExample("shiva", 123);
		ConstructorExample e2 = new ConstructorExample("suresh", 456);
		
		System.out.println(e1.eid);
		System.out.println(e1.name);
		
		System.out.println(e2.eid);
		System.out.println(e2.name);
	}

}
