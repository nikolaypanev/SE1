package se_blatt4;

public class ArraySumme {

	public static int getArraySumme(int[] werte) {
		int summe = 0;
		for (int i = 0; i < werte.length - 1; i++) {
			summe = summe + werte[i];
		}
		return summe;
	}
}
