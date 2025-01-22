package com.mru.faqs;

public class FindTheSumOfArrayElements {
	  public static void main(String[] args) { 
		int[] array = {1, 2, 3, 4, 5};
		int total = 0; 
		for (int num : array) { total += num; }
		System.out.println("Sum of array elements: " + total); 
		}
	}
