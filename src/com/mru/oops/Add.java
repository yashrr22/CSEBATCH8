package com.mru.oops;

public class Add implements Addition {

	@Override
	public void add1() {
		int num1 = 200;
		int num2 = 500;
		int res = num1+num2;
		System.out.println(res1);
	}

	@Override
	public void add2(int num1, int num2) {
		int res = num1+num2;
		System.out.print(res);

	}

	@Override
	public int add3() {
		int num1 = 200;
		int num2 = 500;
		
		return 0;
	}

	@Override
	public int add4(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
