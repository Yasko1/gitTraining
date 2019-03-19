package by.epam.javatraining.main;

import by.epam.javatraining.controller.Controller;
import by.epam.javatraining.logic.model.*;
import by.epam.javatraining.view.View;

public class Main {
	
	public static void main(String[] args) {
		
		// Vector v = new Vector(4); 						// вектор с рандомным заполнением

		double[] array = { 1.2, 56, 2, 98.2, 0, 1 }; // вектор с нашим заполнением
		Vector vector = new Vector(array);
		double[][] m = { { 0, 56, 8.4, 45 }, { 2, 8, 0.1, 99 } };
		Matrix matrix = new Matrix(m);
		View view = new View();
		
		Controller controllerAboveVector = new Controller(view, vector);
		controllerAboveVector.getTasksAboutVector();

		Controller controllerAboveMatrix = new Controller(view, matrix);
		controllerAboveMatrix.getTaskAboutMatrix();
	}

}
