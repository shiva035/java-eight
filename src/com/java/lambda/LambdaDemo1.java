package com.java.lambda;

public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaDemo1 lbd = new LambdaDemo1();
		MathOperation add = (int a, int b)-> a + b ;
		MathOperation sub = (int a, int b)-> a - b ;
		MathOperation mult = (int a, int b)-> a * b ;
		MathOperation divide = (int a, int b)-> a / b ;
		
		System.out.println("Addition  :" + lbd.operate(4, 5, add));
		System.out.println("Addition  :" + lbd.operate(4, 5, sub));
		System.out.println("Addition  :" + lbd.operate(4, 5, mult));
		System.out.println("Addition  :" + lbd.operate(100, 5, divide));
		
		Message msg1 = message -> System.out.println("hello "+ message);
		Message msg2 = (message) -> System.out.println("hello "+ message);
		msg1.sayMessage("LALA");
		msg2.sayMessage("BALA");
		
	}
	
	interface MathOperation{
		public int operation(int a,int b);
	}
	
	interface Message{
		public void sayMessage(String message);
	}
	
	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}
}
