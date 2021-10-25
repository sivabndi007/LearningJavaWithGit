package com.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(ld.format(df));

	}

}
