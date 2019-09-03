package org.git.java;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number :");
		int o = sn.nextInt();
		
		if(o%2!=0) {
			System.out.println("Odd Number");	
		}
		else {
			System.out.println("Even Number");
		}
			
	}
}
