package com.basics;

public class Test {
	
   public static void printName() {
	   
	   System.out.println("method name testing");
   }
   
   public int addNumbers(int a, int b) {
	   
	   return a+b;
   }
   
   public int addNumbers(int a, int b, int c) {
	   
	   return a+b+c;
   }
   
   public double addNumbers(double a, double b) {
	   
	   return a+b;
   }
   
   public static void main(String[] args) {
	   
	   printName();
	   printName();
	   printName();
	   printName();
	   
	   Test test = new Test();
	   int result = test.addNumbers(3, 4);
	   int finalResult = result + 2;
	   System.out.println(result);
	   System.out.println(finalResult);
	   
	   
   }

}
