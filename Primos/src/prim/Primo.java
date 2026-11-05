package prim;

import java.util.Scanner;

public class Primo {

	public static String isPrim(long zahl) {
		if (zahl <= 1) {
			return "Keine Primzahl";
		}
		for (int i = 2; i < Math.sqrt(zahl); i++) {
			long restwert = zahl - (i * (zahl / i));
			if (restwert == 0) {
				return "Keine Primzahl";
			}
		}
		return "Primzahl";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte Zahl eingeben: ");
		long eingabe = scanner.nextLong();

		long startzeit = System.nanoTime();

		String antwort = isPrim(eingabe);
		System.out.println(antwort);
		scanner.close();

		long endzeit = System.nanoTime();
		long zeit = endzeit - startzeit;
		System.out.println("Gebrauchte Zeit: " + zeit);
	}
}