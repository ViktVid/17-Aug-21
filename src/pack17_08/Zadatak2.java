package pack17_08;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * ZADATAK Napraviti program koji od korisnika zahteva da unese dva broja koja
		 * ce sabrati i ispisati rezultat korisniku. Takodje nakon ispisa rezultat
		 * ponuditi korisniku da ponovi unos sa novi brojevima ili da izadje iz
		 * aplikacije.
		 */
		Scanner a = new Scanner(System.in);
		System.out.println("Unesite broj X: ");
		double x = a.nextDouble();

		System.out.println("Unesite broj Y: ");
		double y = a.nextDouble();

		double z = x + y;
		String rec = a.nextLine();

		do {
			System.out.println("Zbir ovih brojeva je: " + z);
			z = x + y;
		} while (z == 0);
		System.out.println("Da li zelite da pokusate ponovo? D/N" + rec);
		while (rec != "N")
			;
		if (rec == "N") {
			System.out.println("Uspesno ste zavrsili program."); 
		}
		/*
		 * do {
		 * 
		 * double xN = a.nextDouble(); System.out.println("Unesite novi broj X: " + xN);
		 * 
		 * double yN = a.nextDouble(); System.out.println("Unesite novi broj Y: " + yN);
		 * 
		 * } while (rec != "N");
		 */

	}

}
