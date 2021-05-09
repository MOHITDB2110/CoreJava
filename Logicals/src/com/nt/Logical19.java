package com.nt;

import java.util.Scanner;

public class Logical19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the range");
		int n=sc.nextInt();
				
		System.out.print("Even Number between 1 to "+n+" are :");
		for (int i = 2; i <= n; i++) {
			if(i%2==0)
				System.out.print(" "+i);
		}
		sc.close();
	}

}
