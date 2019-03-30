package controller;

import logic.*;
import model.*;
import view.View;
import container.*;


public class Main {

	public static void main(String[] args) {
		Deposite d1 = new Deposite();
		d1.setClient("01", "Ivan Ivanov");
		d1.setDollarDeposite(100);
		d1.setEuroDeposite(0.5);
		d1.setRubDeposite(-45);
		System.out.println(d1.getInfoAboutClient());
		
		Deposite d2 = new Deposite();
		d2.setClient("02", "Petya Petrov");
		d2.setEuroDeposite(50.50);
		System.out.println(d2.getInfoAboutClient());
		
		Deposite d3 = new Deposite();
		d3.setClient("03", "Fedya Fedorov");
		d3.setDollarDeposite(100000);
		d3.setEuroDeposite(10.5);
		d3.setRubDeposite(9);
		System.out.println(d3.getInfoAboutClient());
		
		Deposite d4 = new Deposite();
		d4.setClient("04", "Vasya Vasiliev");
		d4.setDollarDeposite(78);
		d4.setEuroDeposite(0);
		d4.setRubDeposite(0);
		System.out.println(d4.getInfoAboutClient());
		
		
		Deposite[] depositeS = {d1,d2,d3,d4};
		
		ClientsBase base = new ClientsBase(depositeS, 4);
		
		System.out.println(base.getClient(RichestClient.getClientWithBiggestDeposite(base))+"\n");
		
		SumOfAllDepositeInDollars.findSumOfAllDepositeInDollars(d4);
		SumOfAllDepositeInDollars.findSumOfAllDepositeInDollars(base);
		Sort.sortByDollarDep(base); View.out("Sort by Dollar: "); base.getAllClients();
		Sort.sortByEuroDep(base); View.out("Sort by Euro: "); base.getAllClients();
		Sort.sortByRubDeposite(base); View.out("Sort by Rub: ");base.getAllClients();

	
	}
}