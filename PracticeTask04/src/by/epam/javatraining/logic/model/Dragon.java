package by.epam.javatraining.logic.model;

public class Dragon {

	public static final int First_Period = 200;
	public static final int Second_Period = 300;

	public static int cauntHead(int y) {

		if (y <= 0) {
			return -1;
		}
		int h = 3;
		if (y < First_Period) {
			h += y * 3;
		} else if (y < Second_Period) {
			h += First_Period * 3 - First_Period * 2 + 2 * y;
		} else if (y > 300) {
			h += First_Period * 3 + (Second_Period - First_Period) * 2 + (Second_Period - y);
		}
		return h;
	}
}
