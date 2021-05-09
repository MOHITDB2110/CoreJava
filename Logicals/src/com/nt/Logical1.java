package com.nt;

import java.util.Scanner;

public class Logical1 {

	public static void main(String[] args) {
		double total;
		double percentage;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert the marks of Physics "); int physics=sc.nextInt();
		System.out.println("Insert the marks of Chemistry "); int chemistry=sc.nextInt();
		System.out.println("Insert the marks of Biology "); int biology=sc.nextInt();
		System.out.println("Insert the marks of Mathemetics "); int maths=sc.nextInt();
		System.out.println("Insert the marks of Computer "); int computer=sc.nextInt();
		
		total=physics+chemistry+biology+maths+computer;
		
		percentage=(total/500)*100;
		
		if(percentage>=90)
			System.out.println("Your secured A Grade");
		else if (percentage>=80)
			System.out.println("Your secured B Grade");
		else if (percentage>=70)
			System.out.println("Your secured C Grade");
		else if (percentage>=60)
			System.out.println("Your secured D Grade");
		else if (percentage>=40)
			System.out.println("Your secured E Grade");
		else
			System.out.println("Your secured F Grade");
			
		
		sc.close();
	}

}
