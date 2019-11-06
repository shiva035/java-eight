package com.java.dateapi;

import java.time.LocalDate;

public class DateApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plusDays(1);
		date = date.plusMonths(1);
		System.out.println(date);
	}

}
