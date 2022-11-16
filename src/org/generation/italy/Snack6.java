package org.generation.italy;

public class Snack6 {

	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };

		
		
		// nuovo array con valori somma dei due precendeti
		
		int[] arrSum;
		arrSum = new int[arr1.length];
		
		for (int i=0; i<arr1.length && i<arr2.length; i++) {
			
			arrSum[i] = arr1[i] + arr2[i];
		}
		
		
		// valore minimo e massimo in entrambi gli array
		
		int min1 = arr1[0];
		int max1 = arr1[0];
		
		for (int i=0; i<arr1.length; i++) {
			
			if (arr1[i] < min1) {
				min1 = arr1[i];
			}
			
			if (arr1[i] > max1) {
				max1 = arr1[i];
			}
		}
		
		System.out.println("Min e Max di arr1:");
		System.out.println(min1);
		System.out.println(max1);
		
		
		int min2 = arr2[0];
		int max2 = arr2[0];
		
		for (int i=0; i<arr2.length; i++) {
			
			if (arr2[i] < min2) {
				min2 = arr2[i];
			}
			
			if (arr2[i] > max2) {
				max2 = arr2[i];
			}
		}
		
		System.out.println("Min e Max di arr2:");
		System.out.println(min2);
		System.out.println(max2);
		
		
		
		// media di entrambi gli array
		
		int sum = 0;
		int media;
		
		for (int i=0; i<arr1.length; i++) {
			
			sum += arr1[i] + arr2[i];
		}
		
		media = sum / (arr1.length + arr2.length);
		
		System.out.print("La media di entrambi gli array è: ");
		System.out.println(media);
		
		
		// Somma di tutti gli elementi degli array
		
		int totalSum = 0;
		
		for (int i=0; i<arrSum.length; i++) {
			
			totalSum += arrSum[i];
		}
		
		System.out.print("la somma di tutti gli elementi è: ");
		System.out.println(totalSum);
		
	}
	
}
