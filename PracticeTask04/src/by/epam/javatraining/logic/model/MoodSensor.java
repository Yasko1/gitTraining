package by.epam.javatraining.logic.model;

public class MoodSensor {

	public static final int moodTypes = 5;
	public static final String happy = "happy";
	public static final String sad = "sad";
	public static final String norm = "norm";
	public static final String disappointed = "disappointed";
	public static final String angry = "angry";
	public static final String nothing = "You feel nothing";

	public static String identifyMood() {
		int num = (int) (Math.random() * (moodTypes)) + 1;
		switch (num) {
		case 1:
			return happy;
		case 2:
			return sad;
		case 3:
			return norm;
		case 4:
			return disappointed;
		case 5:
			return angry;
		default:
			return nothing;
		}
	}

}
