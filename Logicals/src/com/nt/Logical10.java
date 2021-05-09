package com.nt;

import java.util.Scanner;

public class Logical10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the 1st No.");	double a=sc.nextDouble();
		System.out.println("Give the 2nd No.");	double b=sc.nextDouble();
		System.out.println("Give the operation from +, -, *, / ");
		String s=sc.next();
		
		switch (s) {
		case "+": System.out.println(a+" + "+b+" = "+(a+b));
			break;
		case "-": System.out.println(a+" - "+b+" = "+(a-b));
		break;
		case "*": System.out.println(a+" * "+b+" = "+(a*b));
		break;
		case "/": System.out.println(a+" / "+b+" = "+(a/b));
		break;
		default:System.out.println("Incorrect Operation");
			break;
		}
		
		sc.close();
	}

}
