package com.basics;

public class ChildAbstractClass extends AbstractTestClass {

	@Override
	public void animalSound() {
		System.out.println("this is abstract method");

	}

	public static void main(String[] args) {
		
		AbstractTestClass ob = new ChildAbstractClass();
		ob.animalSound();
		ob.sleep();
	}

}
