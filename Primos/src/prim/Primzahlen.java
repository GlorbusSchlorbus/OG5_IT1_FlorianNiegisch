package prim;

import java.util.ArrayList;
import java.util.Scanner;

public class Primzahlen {

	public static String isPrim(long zahl) {
		if (zahl <= 1) {
			return zahl + " ist keine Primzahl";
		}
		for (int i = 2; i < Math.sqrt(zahl); i++) {
			long restwert = zahl - (i * (zahl / i));
			if (restwert == 0) {
				return zahl + " ist keine Primzahl";
			}
		}
		return zahl + " ist eine Primzahl";
	}

	public static void main(String[] args) {
		ArrayList<Long> eingaben = new ArrayList<>();
		long sacrifice = 1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Wollen sie eine Zahl hinzufuegen? (1), oder losrechnen? (2)");
			int babo = scanner.nextInt();
			if (babo == 1 || babo == 2) {
				if (babo == 1) {
					System.out.print("Bitte Zahl eingeben: ");
					long eingabe = scanner.nextLong();
					eingaben.add(eingabe);
					sacrifice = babo;
				} else {
					for (int i = 0; i < eingaben.size(); i++) {
						long startzeit = System.nanoTime();

						String antwort = isPrim(eingaben.get(i));
						System.out.println(antwort);

						long endzeit = System.nanoTime();
						long zeit = endzeit - startzeit;
						System.out.println("Gebrauchte Zeit: " + zeit);
					}
				}
			} else {
				System.out.println("Keine gültige Antwort");
			}
		} while (sacrifice == 1);
		scanner.close();
		
	}
}