package com.nt;

import java.util.Scanner;

public class Logical17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give a number");
		int n=Integer.parseInt(sc.nextLine(), 8);
		
		String binary=Integer.toBinaryString(n);
		System.out.println("Binary Value is "+binary);
		
		sc.close();
	}

}
