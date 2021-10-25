package com.basics;

public class Main {
	public static void main(String[] args) {
		// this below line is to print
		
		/*
		 * this is used to do something 
		 * 
		 * 
		 */
		String data = "shiva";
		int age = 28;
		char sex = 'M';
		boolean isEmployed = true;
		float salary = 23000.25f;
		System.out.println("data is "+data);
		System.out.println("age is "+ age);
		System.out.println("sex is "+sex);
		System.out.println("is Employed" + isEmployed);
		System.out.println("salary is "+salary);
		
		System.out.println("hi welcome to java programming");
		System.out.println("hi welcome to java programming in second line");
		
		int x = 8;
		
		if(x>7 && x<15) {
			System.out.println("x is true");
		}else {
			System.out.println("x is false");
		}
		System.out.println(data.length());
		System.out.println(data.charAt(0));
		System.out.println(Math.min(50, 100));
		
		System.out.println(Math.pow(2, 4));
       int y=1;
		while(y<11) {
			System.out.println(y);
			y = y+1;
			y=y+10;
		}

		for(int z=1; z<11;z++) {
			System.out.println(z);
		}
		
		//break
		
		for(int w=1; w<11;w++) {
			if(w==4) {
				break;
			}
			System.out.println(w);
		}
		
		//continue
		
		for(int w=1; w<11;w++) {
			if(w==4) {
				continue;
			}
			System.out.println(w);
		}
		
	 //
		
		int[] a = new int[10];
		a[0] = 1;
		a[1] = 2;
		
		
		String[] names = {"volvo","bmw","hyundai"};
		
		// for each loop 
		
		for(String st : names) {
			
		  System.out.println(st);	
		}
		int i =2;
		do {
			System.out.println(i);
			i--;
		}while(i>0);
		
		
	}

}
