package by.epam.javatraining.controller;

import by.epam.javatraining.logic.model.*;
import by.epam.javatraining.view.View;

public class Controller {
	private View view;
	private Vector v;
	private Matrix m;

	public Controller(View view, Vector v){
		this.view = view;
		this.v = v;
	}
	
	public Controller(View view, Matrix m){
		this.view=view;
		this.m=m;
	}
	
	public void getTasksAboutVector() {

		view.out("Our vector: " + v.toString());
		view.out("Max element:  " + v.findMaxElement());
		view.out("Min element:  " + v.findMinElement());
		view.out("Arifmetical Average:  " + v.getArifmeticalAverage());
		view.out("Geometry average:  " + v.getGeometryAverage());
		view.out("IsSort: " + v.isSort());
		view.out("Loc min: " + v.findPositionOfFirstLocMin());
		view.out("Binary serch of '2' : " + v.binarySearch(2));
		v.reverseVector();		view.out("Reverse vector: " + v.toString());
		v.bubbleSort();			view.out("Bubble Sort: " + v.toString());
		v.easySort();			view.out("Easy Sort: " + v.toString());
		v.sortByInsertMethod();	view.out("Sort by insert method: " + v.toString());

	}
	
	public void getTaskAboutMatrix() {
		
		view.out("\nOur matrix: \n" + m.toString());
		view.out("Max element:  " + m.findMaxElement());
		view.out("Min element:  " + m.findMinElement());
		view.out("Simmetrical: "+ m.isSimmetrical());
		view.out("Mirrow simmetrical: " + m.isMirrowSimmetrical());
		m.transpose();	view.out("Transpose: " + m.toString());
	}
	
}
