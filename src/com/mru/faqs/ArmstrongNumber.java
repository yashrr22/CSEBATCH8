package com.mru.faqs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter number :");
		int num = scanner.nextInt();
		int original_num = num;
		
		
		
		int digits = String.valueOf(num).length();
		
		int sum = 0;
		while (num!=0) {
			int last = num%10;
			sum+=Math.pow(last, digits);
			num=num/10;
		}
		System.out.println( original_num == sum ? "ArmStrong !!!" : "Not ArmStrong !!!");
		

	}

}
