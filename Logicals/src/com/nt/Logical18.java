package com.nt;

import java.util.Scanner;

public class Logical18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the number");
		int n=sc.nextInt();
		
		System.out.print("Prime factorial of "+n+" are :");
		for (int i = 2; i <= n; i++) {
			int b=0;
			if (n%i==0) {				// get multiplication factors
				b=i;
				int count=0;
				for (int k = 2; k < b; k++) { 
					if (b%k==0) {
						count=count+1;
					}
				}
				if (count<1) {			// check prime or not
					System.out.print(" "+b);
				}
			}
		}
		
		sc.close();
	}

}
