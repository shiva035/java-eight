package com.java.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class FunInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunInterfaceDemo d = new FunInterfaceDemo();
		List<Integer> list = (List) Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("print all");
		d.eval(list, lt->true);
		
		System.out.println("print even");
		d.eval(list, lt-> lt%2 == 0);
		
		System.out.println("print greater than 3");
		d.eval(list, lt-> lt > 3);
	}
	
	public void eval(List lt, Predicate<Integer> predictor){
		lt.forEach((i)->{
			if(predictor.test((Integer) i)){
				System.out.println(i + " ");
			}
		});

	}
}
