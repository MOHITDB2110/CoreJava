package com.nt;

import java.util.Scanner;

public class Logical4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character ");
		Character c=sc.next().charAt(0);
		
		if(c>='a' &&  c<='z' || c>='A' && c<='Z')
			System.out.println("Character is alphabet");
		else
			System.out.println("Character is NOT a alphabet");
		
		sc.close();
	}

}
