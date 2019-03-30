package logic;

public class Converter {

	private static final double euroToDollar = 1.13;
	private static final double rubToDollar = 0.47;

	public static double convertEuroInDollar(double moneyInEuro) {
		return moneyInEuro * euroToDollar;
	}

	public static double convertRubInDollar(double moneyInRub) {
		return moneyInRub * rubToDollar;
	}
}
