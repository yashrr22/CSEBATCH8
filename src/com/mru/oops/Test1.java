package com.mru.oops;

public class Test1 {
		@Override
		public void addition() {
			int num1 = 100;
			int num2 = 50;
			int res = num1 + num2;
			System.out.println("Addition...."+res);
		}

		@Override
		public int subtraction(int num1, int num2) {
			int res = num1 - num2;
			return res;
		}
		@Override
		public void multi(int num1, int num2) {
			int result = num1*num2;
			System.out.println("multiplication...."+result);
		}
		@Override
		public int Division() {
			int num1 = 100;
			int num2 = 50;
			int result= num1/num2;
			return result;
		}
	}
