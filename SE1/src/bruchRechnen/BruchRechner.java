package bruchRechnen;

import Prog1Tools.IOTools;

public class BruchRechner {
	public static void main(String[] args) {
		Bruch b1 = new Bruch(), b2 = new Bruch();
		char e = ' ';
		while (e != 'x') {
			System.out.println("---------------------------------------------------");
			System.out.println();
			System.out.println("Bruch 1: " + b1);
			System.out.println("Bruch 2: " + b2);
			System.out.println();
			System.out.println(" x: beenden");
			System.out.println(" 1: Bruch 1 eingeben");
			System.out.println(" 2: Bruch 2 eingeben");
			System.out.println(" b: Brueche kuerzen");
			System.out.println(" *,/,+,-: Grundrechenarten");
			System.out.println(" n: Bruch 1 negativ");
			System.out.println(" k: Kehrwert von Bruch 1");
			System.out.println(" d: Double-Wert von Bruch 1");
			System.out.println();
			e = IOTools.readChar("Eingabe:");
			System.out.println();
			switch (e) {
			case '1':
				b1.einlesen();
				break;
			case '2':
				b2.einlesen();
				break;
			case '*':
				System.out.println("b1 * b2 = " + b1.mul(b2));
				break;
			case '/':
				System.out.println("b1 / b2 = " + b1.div(b2));
				break;
			case '+':
				System.out.println("b1 + b2 = " + b1.add(b2));
				break;
			case '-':
				System.out.println("b1 - b2 = " + b1.sub(b2));
				break;
			case 'b':
				b1 = b1.kuerze();
				b2 = b2.kuerze();
				break;
			case 'n':
				System.out.println("b1 negativ:" + b1.neg());
				break;
			case 'k':
				System.out.println("Kehrwert von b1:" + b1.kehrwert());
				break;
			case 'd':
				System.out.println("Double-Wert von b1:" + b1.wert());
				break;
			case 'x':
				System.out.println("... und tschuess!");
				break;
			}
		}
	}
}// BruchRechner