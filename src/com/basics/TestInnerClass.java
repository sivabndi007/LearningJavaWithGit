package com.basics;

class OuterClass {
	int x = 10;

	
	  class InnerClass { int y = 5; }
	 
}

public class TestInnerClass {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
		
		System.out.println(myOuter.x);
	}
}
