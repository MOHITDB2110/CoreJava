package com.nt;

import java.util.Scanner;

public class Logical5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter only one character ");
		Character c = sc.next().charAt(0);

		if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
			System.out.println(c+" is alphabet");
		else if(c>='0' && c<='9')
			System.out.println(c+" is a Digit");
		else
			System.out.println(c+" is a special character");
		
		sc.close();
	}

}
