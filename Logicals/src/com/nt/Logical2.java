package com.nt;

import java.util.Scanner;

public class Logical2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input your Basic Salary to Calculate Gross Salary");
		
		double basicsal=sc.nextDouble();
		double hra,da,grossSal;
		
		if (basicsal<=10000) {
			hra=basicsal*0.20;
			da=basicsal*0.80;	
		}else if (basicsal<=20000) {
			hra=basicsal*0.25;
			da=basicsal*0.90;
		}else {
			hra=basicsal*0.30;
			da=basicsal*0.95;
		}
		
		grossSal=basicsal+hra+da;
		
		System.out.println("GrossSalary is "+ grossSal);
		
		sc.close();
	}

}
