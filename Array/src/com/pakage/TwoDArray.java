package com.pakage;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[][] a=new int[3][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.println("Enter the marks of Class "+(i+1)+"of Student "+(j+1));
				a[i][j]=scan.nextInt();
			}	
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.println("the marks of Class "+(i+1)+"of Student "+(j+1)+" is "+a[i][j]);
			}	
		}
		

	}

}
