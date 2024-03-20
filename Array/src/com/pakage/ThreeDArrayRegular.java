package com.pakage;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDArrayRegular {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] a= {10,20,30};
		int sum=0;
		for(int i:a) {
			sum +=i;
		}
		int max=a[0];
		System.out.println(sum);
		for (int i=0;i<a.length;i++) {
			if(a[i]<max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
