package com.nt;

import java.util.Scanner;

public class Logical7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the Amout to get change ");
		int amount=sc.nextInt();
		
		int[] notes = new int[]{ 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		
        int[] count = new int[notes.length];
		
        for (int i = 0; i < notes.length; i++) { //to check for all notes
			if (amount >=notes[i]) { 			 // to check which note can we get
				count[i]=amount/notes[i];		 // to get no of notes and store in another array
				amount=amount-count[i]*notes[i]; // to get left over amount for next note
			}
		}
        // now print notes 
        System.out.println("Take the Change friend-> ");
        for (int i = 0; i < count.length; i++) {
				System.out.println(notes[i]+" : "+ count[i]);
		}
		
		sc.close();
	}

}
