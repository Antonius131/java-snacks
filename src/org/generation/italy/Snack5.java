package org.generation.italy;

public class Snack5 {
	
	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int min = arr[0];
		int max = arr[0];
		
		
		// Trovare valore minimo e valore massimo
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] < min) {
				min = arr[i];
			}
			
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		
		
		// Calcolare sommatoria e media
		
		int sum = 0;
		int media;
		
		for (int i=0; i<arr.length; i++) {
			
			sum += arr[i];
		}
		media = sum / arr.length;
		
		System.out.println(sum);
		System.out.println(media);
	}
	
}
