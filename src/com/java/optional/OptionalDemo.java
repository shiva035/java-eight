package com.java.optional;

import java.util.Optional;

import javax.swing.text.html.Option;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionalDemo op = new OptionalDemo();
		Integer a = null;
		Integer b = new Integer(10);
		Optional<Integer> num1 = Optional.ofNullable(a);
		Optional<Integer> num2 = Optional.of(b);
		op.sum(num1, num2);
	}
	public void sum(Optional a , Optional b){
		System.out.println("Value a is present : "+ a.isPresent());
		System.out.println("Value b is present : "+ b.isPresent());
		Integer n1 = (Integer) a.orElse(0);
		Integer n2 = (Integer) b.get();
		System.out.println("sum : "+ (n1 + n2));
	}
}
