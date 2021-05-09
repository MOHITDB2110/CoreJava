package com.nt;

import java.util.Scanner;

public class Logical11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the last number "); 
		int n=sc.nextInt();
		
		for (int i = n; i > 0; i--) 
			System.out.print(i+" ");
		
		
		sc.close();
	}

}
