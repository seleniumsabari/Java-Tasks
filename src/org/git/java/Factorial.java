package org.git.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int f = sn.nextInt();
		int factorial=1;
		for (int i = 1; i <=f; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
