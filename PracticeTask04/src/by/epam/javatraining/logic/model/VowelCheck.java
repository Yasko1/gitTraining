package by.epam.javatraining.logic.model;

public class VowelCheck {

	public static boolean isVowel (char letter){
        letter = Character.toLowerCase (letter);
        switch (letter) {
            case 'a':
            case 'u':
            case 'o':
            case 'e':
            case 'i':
            case 'y':
                return true;
        }
        return false;
    }
	
}
