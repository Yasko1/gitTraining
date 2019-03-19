package by.epam.javatraining.logic.model;

public class TomorrowDate {

	public static final int january = 1;
	public static final int february = 2;
	public static final int march = 3;
	public static final int april = 4;
	public static final int may = 5;
	public static final int june = 6;
	public static final int july = 7;
	public static final int august = 8;
	public static final int september = 9;
	public static final int october = 10;
	public static final int november = 11;
	public static final int december = 12;

	public static String findTodayDate(int[] date) {
		if (date[1] == december) { // December
			if (date[0] != 31) {
				date[0]++; // day
				return toString(date);
			}
			date[0] = 1; // day
			date[1] = 1; // month
			date[2]++; // year
			return toString(date);
		} else if (date[1] == february) { // February
			if (isLeapYear(date[2])) {
				if (date[0] != 29) {
					date[0]++; // day
					return toString(date);
				}
				date[0] = 1; // day
				date[1]++; // month
				return toString(date);
			}
			if (date[0] != 28) {
				date[0]++; // day
				return toString(date);
			}
			date[0] = 1; // day
			date[1]++; // month
			return toString(date);
		} else if (date[1] == april || date[1] == june || date[1] == september || date[1] == november) { // 30-day
																											// months
			if (date[0] != 30) {
				date[0]++; // day
				return toString(date);
			}
			date[0] = 1; // day
			date[1]++; // month
			return toString(date);
		} else { // 31-day
			if (date[0] != 31) {
				date[0]++;
				return toString(date);
			}
			date[0] = 1; // next day
			date[1]++; // next month
			return  toString(date);
		}
	}
	
	private static String toString(int[] date) {
		String s = "";
		for (int i = 0; i < date.length; i++) {
			s = (String) s + "  " + date[i];
		}
		return s;
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 100 == 0 && year % 400 != 0) {
			return false;
		}
		return true;
	}
}
