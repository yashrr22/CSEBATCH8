package com.mru.oops;



public class Demo1 {
	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		obj1.addition();
		
		int res1 = obj1.subtraction(100,50);
		System.out.println("Subtraction...."+res1);
		obj1.multi(100, 50);
		
		int result = obj1.Division();
		System.out.println("Division..."+result);
	}
}
