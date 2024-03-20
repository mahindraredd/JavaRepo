package com.test;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		int[]arr= {10,40,50,20,13};
		Arrays.sort(arr);
		for(int ele:arr)
		System.out.println(ele);
		System.out.println(Arrays.binarySearch(arr,40));
		

	}

}
