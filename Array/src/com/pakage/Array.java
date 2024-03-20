package com.pakage;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		System.out.println(b);
		for(int i=0;i<5;i++) {
			System.out.println("please Enter the marks of student"+(i+1));
			a[i]=scan.nextInt();
		}
		System.out.println(" the Marks of Students" );
		for(int i=0;i<5;i++) {
			System.out.println("the marks of student"+(i+1)+"is"+a[i]);
			
		}
		
		}
	}

	


