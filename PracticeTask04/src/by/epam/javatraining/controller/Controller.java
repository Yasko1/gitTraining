package by.epam.javatraining.controller;

import by.epam.javatraining.logic.model.*;
import by.epam.javatraining.view.*;

public class Controller {

	public void getTasks() {
		get("Is triangle: "+ TriangleCheck.isTriangle(0, 0, 0, 1, 1, 0));
		
		get("How much head has dragon when he " + View.getDragonAge() + " years old: " +
		Dragon.cauntHead(View.getDragonAge()));
		
		get("Mood Seansor: " + MoodSensor.identifyMood());
		
		get("Is '" + View.getLetter() + "' vowel? : " + VowelCheck.isVowel(View.getLetter()));
		
		get("If today is " + View.getTodayDate() + " . Tomorrow will be: " + 
		TomorrowDate.findTodayDate(View.todayDate));
		
	}

	private void get(String string) {
		System.out.println(string); 
	}

}
