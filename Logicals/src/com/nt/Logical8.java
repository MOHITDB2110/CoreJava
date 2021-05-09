package com.nt;

import java.util.Scanner;

public class Logical8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Lets Check Triangle is valid or not from given conditions ");
		
		System.out.println("Give 1st side of triangle");    int a=sc.nextInt();
		System.out.println("Give 2nd side of triangle");    int b=sc.nextInt();
		System.out.println("Give 3rd side of triangle");    int c=sc.nextInt();
		
		if((b+c)>a && (a+c)>b && (a+b)>c)
			System.out.println("Triangle is Valid");
		else
			System.out.println("Triangle is invalid");
		
		sc.close();
	}

}
