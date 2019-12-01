package bruchRechnen;

import Prog1Tools.*;

@SuppressWarnings("unused")
public class BruchTest {
	public static void main(String args[]) {
		Bruch b1 = new Bruch();
		Bruch b2 = new Bruch();
		b1.einlesen();
		b2.einlesen();
		System.out.println("Multiplikation: " + b1.mul(b2));
		System.out.println("Division: " + b1.div(b2));
		System.out.println("Addition: " + b1.add(b2));
		System.out.println("Subtrakion: " + b1.sub(b2));
		System.out.println("Doublewert: " + b1.wert());
		System.out.println("Kehrwert: " + b1.kehrwert());
		System.out.println("negativ: " + b1.neg());
		System.out.println("gekuerzt: " + b1.kuerze());
	}
}