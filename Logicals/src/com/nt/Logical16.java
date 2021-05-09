package com.nt;

import java.util.Scanner;

public class Logical16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give the number ");
		Integer n=sc.nextInt();
		
		for (int i = 0; i <= 9; i++) {
			Integer num=n;
			Integer occ=0;
			Integer count=0;
			while(num!=0) {
				occ=num%10;
				if ( occ==i) {
					count=count+1;
				}
				num=num/10;
			}
			System.out.println("Occurence of "+i+" is "+count);
		}
		
		sc.close();
	}

}
