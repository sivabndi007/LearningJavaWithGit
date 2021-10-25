package com.basics;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int data =sc.nextInt();
		System.out.println(data);
		int[] ele = new int[data];
		for(int i=0;i<ele.length;i++) {
			ele[i]= sc.nextInt();
		}
		
		for(int i=0;i<ele.length;i++) {
			System.out.println(ele[i]);
		}
		
	}

}
