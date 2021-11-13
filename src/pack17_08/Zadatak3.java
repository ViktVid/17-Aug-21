package pack17_08;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		/*
		 * ZADATAK Napraviti program za koji ce moci da unosimo brojeve pojedinacno. A
		 * nakon svakog unosa proracunamo i ispisemo zbir dotad unetih vrednosti.
		 * Algoritam treba da radi za unos do 5 brojeva ili ako se dostigne suma preko
		 * 50.
		 */
		
		/*		
		int sum = 0;
		int count = 0;
Scanner sc = new Scanner(System.in);
		do {		
			System.out.print("Enter a number ["+count+"]: ");
			int number = sc.nextInt();

			sum += number;
			System.out.println("   Sum = " + sum);
			
			count ++;			
		} while (count < 5 && sum < 50);

		
		sc.close();
	} */

		Scanner br = new Scanner(System.in);

		int i = 0;
		int zbir = 0;

		do {
			System.out.println("Unesite neki broj: ");
			int x = br.nextInt();

			if (zbir <= 50 && i < 5) {

				zbir = zbir + x;

				System.out.println("Zbir ovih brojeva je: " + zbir);
				;
			} else {
				System.out.println("Pogresan broj."); break;
			}
		} while (zbir < 50 && i < 5);
	}
}
