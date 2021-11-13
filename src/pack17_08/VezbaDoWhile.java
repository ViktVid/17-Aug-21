package pack17_08;

import java.util.Scanner;

public class VezbaDoWhile {

	public static void main(String[] args) {

		/*
		 * int i = 0; do { System.out.println("i: " + i); i++; } while (false);
		 */

		/*
		 * ZADATAK: Napraviti program koji omogucava unos proizvoljnog broja. Nakon
		 * unosa ispisati sve parne brojeve od 0 do vrednosti unetog broja.
		 */

		/*
		 * Scanner skener = new Scanner(System.in);
		 * 
		 * int i = 0; int unetiBr = skener.nextInt();
		 * 
		 * do { System.out.println("Brojevi su = " + i);
		 * 
		 * if(unetiBr>0) {i += 2;}
		 * 
		 * else { i-=2; }; }
		 * 
		 * while (i != unetiBr);
		 */

		Scanner pb = new Scanner(System.in);
		System.out.println("Unesite neki broj: ");

		int br = pb.nextInt();

		int i = 0;

		do {
			if (br > 0) {
				if (i % 2 == 0) {
					System.out.println("Paran broj: " + i);
				}
			}

			i++;

		} while (br > 0 && i < br);

		System.out.println("Gotovo.");
	}

}
