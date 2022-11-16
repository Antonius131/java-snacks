package org.generation.italy.security;

import java.util.Random;

public class Snack4 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] array2 = {1, 2, 3};
		
		int lengthDiff = array1.length - array2.length;
		
		for (int i=0; i<lengthDiff; i++) {
			
			int rndNum = rnd.nextInt(100);
			
			System.out.println(rndNum);
		}
		
	}
	
}
