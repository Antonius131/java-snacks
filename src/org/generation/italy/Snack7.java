package org.generation.italy;

public class Snack7 {

	public static void main(String[] args) {
		
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		String concatWord = "";
		String invConcatWord = "";
		
		// Quesito 1
		for (int i=0; i<words.length; i++) {
			
			String word = words[i];
			concatWord += word + " ";
		}
		
		System.out.println(concatWord);
		

		// Quesito 2
		
		for (int i=words.length-1; i>=0; i--) {
			
			String word = words[i];
			invConcatWord += word + " ";
		}
		
		System.out.println(invConcatWord);
		
		
		// Quesito 3
		
		String maxWord = words[0];
		int maxWordLength = 0;
		
		for (int i=0; i<words.length; i++) {
			
			if (words[i].length() > maxWord.length()) {
				
				maxWord = words[i];
			}
		}
		
		maxWordLength = maxWord.length();
		
		System.out.print("La parola più lunga è: ");
		System.out.println(maxWord);
		System.out.print("La sua lunghezza è di: ");
		System.out.println(maxWordLength);
		
		
		// Quesito 4
		
		String minWord = words[0];
		int minWordLength = 0;
		
		for (int i=0; i<words.length; i++) {
			
			if (words[i].length() < minWord.length()) {
				
				minWord = words[i];
			}
		}
		
		minWordLength = minWord.length();
		
		System.out.print("La parola più corta è: ");
		System.out.println(minWord);
		System.out.print("La sua lunghezza è di: ");
		System.out.println(minWordLength);
	}
	
}