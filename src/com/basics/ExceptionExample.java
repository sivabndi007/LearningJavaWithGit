package com.basics;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionExample {
	public static void main(String[] args) throws Exception{
		try {
			String data = null;
			try {
				if (data.contains("wer")) {
					System.out.println("did not occur null pointer exception");
				}
			} catch (NullPointerException ex) {
				throw new Exception("null pointer");
				//ex.printStackTrace();
			}

			int i = 0;
			File f = new File("Car.Java");
			try {
				FileInputStream fis = new FileInputStream(f);
			} catch (Exception ex) {

			} finally {
				System.out.println("Exception handled");
			}

			System.out.println(f.exists());
			try {
				i = 3 / 0;
				i = i + 1;
				System.out.println("exception not called");

			} catch (Exception ex) {
				ex.printStackTrace();
				i = 0;
			} finally {
				System.out.println("finally executed");
			}

			i = i + 1;
			System.out.println(i);
		} catch (Exception ex) {
			System.out.println("last exception");
			ex.printStackTrace();
		} finally {
			System.out.println("last finally block");

		}
	}

}
