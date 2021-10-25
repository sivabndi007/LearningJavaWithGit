package com.basics;

public class EnumTest {

	public static void main(String[] args) {
		  Days day =  Days.FRIDAY;
		  switch(day) {
		  case FRIDAY:
			   System.out.println("this is friday");
			   break;
		  case MONDAY:
			  System.out.println("this is monday");
			  break;
		  default:
			   System.out.println("this is default");
		  
		  }
		  

	}

}
