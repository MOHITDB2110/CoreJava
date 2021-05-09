package com.nt;

import java.util.Scanner;

public class Logical9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give the Cost Price of Product ");	int cp=sc.nextInt();
		System.out.println("Give the Sell Price of Product ");	int sp=sc.nextInt();
		
		
		if (cp<sp) 			//profit
			System.out.println("You made a Profit of "+ (sp-cp));
		else if(cp>sp)		//loss
			System.out.println("You made a Loss of "+ (cp-sp));
		else
			System.out.println("No Profit No Loss");
		
		
		sc.close();
	}

}
