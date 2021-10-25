package com.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pattern pattern = Pattern.compile("this text is there",Pattern.CASE_INSENSITIVE);
		//Pattern pattern = Pattern.compile("^[abc]def$",Pattern.CASE_INSENSITIVE);
		//Pattern pattern = Pattern.compile("^[a-z]*$",Pattern.CASE_INSENSITIVE);
		//Pattern pattern = Pattern.compile("^[0-9]*$",Pattern.CASE_INSENSITIVE);
		Pattern pattern = Pattern.compile("^[0-9]{10}$",Pattern.CASE_INSENSITIVE);
		//Matcher matcher = pattern.matcher("this text is there");
		//Matcher matcher = pattern.matcher("aadfasfasdfsaafssdfasddef");
		Matcher matcher = pattern.matcher("9361444823");
		//boolean matches = matcher.find();
		boolean matches = matcher.matches();
		System.out.println(matches);

	}

}
