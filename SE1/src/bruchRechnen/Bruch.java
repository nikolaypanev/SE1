package bruchRechnen;

import Prog1Tools.IOTools;

public class Bruch {
	/*
	 *  @param zaehler - instance variable, used for the numerator
	 *  @param nenner - instance variable, used for the denominator
	 */
	int zaehler;
	int nenner;

	/*
	 *  Main object constructor
	 *  @param zaehler - numerator 
	 *  @param nenner - denominator
	 */
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	/*
	 *  Empty construct; allows to create objects without parameters, so they can be added later
	 */
	public Bruch() {
	}

	/*	
	 * 	
	 * 	@return String representation of the current fraction number
	 */
	public String toString() {
		return zaehler + "/" + nenner;
	}

	/*
	 *  This function computes the largest common divisor of 2 numbers
	 *  @param a - first number
	 *  @param b - second number
	 *  @return - the LCD of a and b
	 */
	public static int ggt(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		int x = Math.abs(a);
		int y = Math.abs(b);
		while (x != y)
			if (x > y)
				x = x - y;
			else
				y = y - x;
		return x;
	}

	/* 
	 *  @return New object; values of the current object are simplified by reducing them by their LCD
	 */
	public Bruch kuerze() {
		return new Bruch(zaehler / ggt(zaehler, nenner), nenner / ggt(zaehler, nenner));
	}
	
	/*
	 *  Reads the numerator and denominator values from the console and checks if the denominator is 0
	 */
	public void einlesen() {
		zaehler = IOTools.readInteger("Zaehler eingeben: ");
		nenner = 0;
		do {
			nenner = IOTools.readInteger("Nenner eingeben: ");
			if (nenner == 0)
				System.out.println("Nenner muss ungleich 0 sein");
		} while (nenner == 0);
	}
	
	/* 
	 *  @return New object, reciprocal to the object on which the method is called
	 */
	public Bruch kehrwert() {
		return new Bruch(nenner, zaehler);
	}

	/* 
	 * 	@return New object; negative to the object on which the method is called
	 */
	public Bruch neg() {
		return new Bruch(zaehler * -1, nenner);
	}
	
	/*
	 *  @return a double value of the object on which the method is called
	 */
	public double wert() {
		return (double) zaehler / nenner;
	}

	/*	
	 * 	@param b - fraction number, that will be multiplied with the current number
	 *  @return New object; argument values are multiplied with the values of the object on which the method is called
	 */
	public Bruch mul(Bruch b) {
		return new Bruch(b.zaehler * zaehler, b.nenner * nenner).kuerze();
	}

	/*
	 * 	@param b - fraction number, that will be divided to the current number
	 *  @return  New object; argument values are multiplied with the reciprocal values of the object on which the method is called
	 * 	@see #mul 
	 */
	public Bruch div(Bruch b) {
		return mul(b.kehrwert());
	}

	/*
	 * 	@param b - fraction number, that will be added the current number
	 *  @return New object, argument values are added to the values of the object on which the method is called
	 */
	public Bruch add(Bruch b) {
		return new Bruch(zaehler * b.nenner + b.zaehler * nenner, nenner * b.nenner).kuerze();
	}

	/*
	 * 	@param b - fraction number, that will be subtracted from the current number
	 *  @return new object; argument values  are added to the negated value of the object on which the method is called
	 *  @see #add
	 */
	public Bruch sub(Bruch b) {
		return add(b.neg());
	}
}