import java.util.Scanner;

public class InsertNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int number = sc.nextInt();
		
		sc.close();
		
		if (number % 2 == 0) {
			
			System.out.println("Il numero stampato è:");
			System.out.println(number);
		} else {
			
			System.out.println("Il numero stampato è:");
			System.out.println(number + 1);
		}
		
		
//		System.out.println(number % 2 == 0 ? number : number + 1);
	}
	
}