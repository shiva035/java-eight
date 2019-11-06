package com.java.method.reference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lt = new ArrayList<String>();
		lt.add("Mohan");
		lt.add("shruta");
		lt.add("manya");
		lt.add("kalam");
		
		lt.forEach(System.out::println);
	}

}
