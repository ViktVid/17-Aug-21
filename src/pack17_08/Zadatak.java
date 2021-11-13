package pack17_08;

import java.util.Scanner;

public class Zadatak {

	public static void main(String[] args) {

		/*
		 * Ispisati na ekran, koristeci do while petlju (zadnji red 10 zvezdica) [ *
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 ********
		 *********
		 ********** ]
		 */
		Scanner s = new Scanner(System.in);

		int i = 0;
		String z = "*";
		do {
			System.out.println(z);
			z = z + "*";
			i++;
		} while (i <= 9);

		System.out.println("Kraj programa.");
	}

}
