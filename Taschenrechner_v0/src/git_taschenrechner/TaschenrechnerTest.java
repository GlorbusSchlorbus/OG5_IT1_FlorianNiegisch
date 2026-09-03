package git_taschenrechner;

import java.util.Scanner;

public class TaschenrechnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		Taschenrechner ts = new Taschenrechner();

		int swValue;
		double zahl1;
		double zahl2;

		// Display menu graphics
		System.out.println("============================");
		System.out.println("|      MENU SELECTION      |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|        1. Addieren       |");
		System.out.println("|        2. Subtrahieren   |");
		System.out.println("|        3. Multiplizieren |");
		System.out.println("|        4. Dividieren     |");
		System.out.println("|        5. Exit           |");
		System.out.println("============================");
		System.out.print(" Select option: ");
		swValue = myScanner.next().charAt(0);

		// Switch construct
		switch (swValue) {
		case '1':
			System.out.println("Bitte ersten Summand eingeben: ");
	        zahl1 = myScanner.nextDouble();
	        System.out.println("Bitte zweiten Summand eingeben: ");
	        zahl2 = myScanner.nextDouble();
			System.out.println(zahl1 + " + " + zahl2 + " = " + ts.add(zahl1, zahl2));
			break;
		case '2':
			System.out.println("Bitte Minuend eingeben: ");
	        zahl1 = myScanner.nextDouble();
	        System.out.println("Bitte Subtrahend eingeben: ");
	        zahl2 = myScanner.nextDouble();
			System.out.println(zahl1 + " - " + zahl2 + " = " + ts.sub(zahl1, zahl2));
			break;
		case '3':
			System.out.println("Bitte ersten Faktor eingeben: ");
	        zahl1 = myScanner.nextDouble();
	        System.out.println("Bitte zweiten Faktor eingeben: ");
	        zahl2 = myScanner.nextDouble();
			System.out.println(zahl1 + " * " + zahl2 + " = " + ts.mul(zahl1, zahl2));
			break;
		case '4':
			System.out.println("Bitte Dividend eingeben: ");
	        zahl1 = myScanner.nextDouble();
	        System.out.println("Bitte Divisor eingeben: ");
	        zahl2 = myScanner.nextDouble();
			System.out.println(zahl1 + " / " + zahl2 + " = " + ts.div(zahl1, zahl2));
			break;
		case '5':
			System.exit(0);
			break;
		default:
			System.out.println("Invalid selection");
			break; // This break is not really necessary
		}

	}

}
