package com.nt;

import java.util.Scanner;

public class Logical15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the number");
		int n=sc.nextInt();
		
		int first=0;
		int last=0;
		last=n%10;
		
		if(n%10!=n) {
			while (n!=0) {
				first=n%10;
				n=n/10;
			}

			System.out.println("Total of First & Last : "+(first+last));
		}
		else
			System.out.println("Total of First & Last : "+n);
		
		sc.close();
	}

}
