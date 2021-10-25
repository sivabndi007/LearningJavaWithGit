package com.basics;

public class TestInterfaceImpl implements TestInterface {

	@Override
	public void animalSound() {
		System.out.println("animal sound");

	}

	@Override
	public void run() {
		System.out.println("run method");

	}
	
	public static void main(String[] args) {
		TestInterface ob = new TestInterfaceImpl();
		ob.animalSound();
		ob.run();
		
	}

}
