package by.epam.javatraining.view;

public class View {

	public static int[] todayDate = { 7, 3, 2019 };
	
	
	public static int getDragonAge() {
		return 150;
	}

	public static String getTodayDate() {
		return toString(todayDate);
	}

	public static char getLetter() {
		return 'a';
	}
	
	private static String toString(int[] date) {
		String s = "";
		for (int i = 0; i < date.length; i++) {
			s = (String) s + "  " + date[i];
		}
		return s;
	}

}
