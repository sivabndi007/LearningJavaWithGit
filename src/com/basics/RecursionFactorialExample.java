package com.basics;

public class RecursionFactorialExample {

	public static void main(String[] args) {
		int result = fact(5);
		System.out.println(result);

	}

	static int fact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

}
