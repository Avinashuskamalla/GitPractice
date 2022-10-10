package com.example.blog;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo2 {

	public static void main(String[] args) {
	
		
		LocalDate l=LocalDate.now();
		
		LocalDate l1=LocalDate.of(1994, 11, 1);
		
		System.out.println(l);
		System.out.println(l1);
		
		LocalDate l3=LocalDate.parse("1994-11-11", DateTimeFormatter.ISO_DATE);
		System.out.println(l3);
		
		LocalDate date=LocalDate.now().plusDays(1);
		
		System.out.println(date);
	
		
		LocalTime l4=LocalTime.now();
		
		System.out.println(l4);
		
	}
}
