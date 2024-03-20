package com.Pattern2;

public class Condition_patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for (int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i+j==(n-1)/2||(j-i)==(n-1)/2||i-j==(n-1)/2||i+j==n-1+(n-1)/2) {
//					System.out.print("*");
//					
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
			
			//A
			for(int j=0;j<n;j++) {
				if(i+j==n/2||(j-i==n/2)||i==n/2-1&&j==n/2) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
