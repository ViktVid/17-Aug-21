package pack17_08;

public class DoWhileLoop {

	public static void main(String[] args) {
/*  Radi dok je zadovoljen uslov!
 * Sintaksa: do {this;} while (condition is true);
		 */
		int i = 0;
		
		do {
			System.out.println("i: " + i);
			i++;
		} while (i < 10);
		
		System.out.println("Kraj programa.");
	}

}
