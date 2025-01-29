package com.mru.faqs;

import java.util.HashSet;

public class CheckDupilcates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1,2,3};
		HashSet<Integer> set=new HashSet<>();
		boolean flag = false;
		for(int element:arr) {
			if(set.contains(element)) {
				System.out.println("Duplicates are found");
				break;
				
			}
			else {
				set.add(element);
			}
		}
		System.out.println(flag ? "Duplicates are found" : "Duplicates Not Found");

	}

}
