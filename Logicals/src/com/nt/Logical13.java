package com.nt;

import java.util.Scanner;

public class Logical13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Give the of Range ");
		int n=sc.nextInt();
		
		int total=0;
		for (int i = n; i > 0; i--) {
			if(i%2!=0)
				total+=i;
		}
		
		System.out.println("Total : "+ total);
		sc.close();
	}

}
