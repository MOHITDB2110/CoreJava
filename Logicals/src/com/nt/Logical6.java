package com.nt;

import java.util.Scanner;

public class Logical6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Please enter first number: ");
	      int num1 = sc.nextInt();
	      System.out.println("Please enter second number: ");
	      int num2 = sc.nextInt();
	      System.out.println("Please enter third number: ");
	      int num3 = sc.nextInt();
	      System.out.println("Please enter fourth number: ");
	      int num4 = sc.nextInt();
	      if(num1 > num2)
	      {
	         if(num1 > num3)
	         {
	            if(num1 > num4)
	               System.out.println("Largest of four nums is: " + num1);
	            else
	               System.out.println("Largest of four nums is: " + num4);
	         }
	      }
	      else if(num2 > num3)
	      {
	         if(num2 > num4)
	            System.out.println("Largest of four nums is: " + num2);
	         else
	            System.out.println("Largest of four nums is: " + num4);
	      }
	      else if(num3 > num4)
	         System.out.println("Largest of four nums is: " + num3);
	      else
	         System.out.println("Largest of four nums is: " + num4);
	      
	      
	      sc.close();
	   
	}
}
