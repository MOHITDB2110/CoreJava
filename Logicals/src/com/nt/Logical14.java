package com.nt;

import java.util.Scanner;

public class Logical14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the number for finding Factors of");
		int n=sc.nextInt();
		
		System.out.print("Factors of "+n+" are :");
		for (int i = 1; i <=n ; i++) {
			if(n%i==0)
				System.out.print(" "+i);
		}
		
		sc.close();
	}

}
