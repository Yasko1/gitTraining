package logic;

import container.ClientsBase;
import model.*;
import view.*;

public class SumOfAllDepositeInDollars {

	public static void findSumOfAllDepositeInDollars(Deposite d) {

		double all = d.DOLLARS_DEPOSITE + d.EURO_DEPOSITE + Converter.convertEuroInDollar(d.EURO_DEPOSITE)
				+ Converter.convertRubInDollar(d.RUB_DEPOSITE);
		View.out("Sum of all deposite for " + d.getClient() + " is : " + all +"$\n");

	}

	public static void findSumOfAllDepositeInDollars(ClientsBase base) {

		for (int i = 0; i < base.amountOfClients; i++) {
			double all = base.get(i).DOLLARS_DEPOSITE + Converter.convertEuroInDollar(base.get(i).EURO_DEPOSITE)
					+ Converter.convertRubInDollar(base.get(i).RUB_DEPOSITE);
			View.out("Sum of all deposite in dollars for client " + base.get(i).getClient() + " is: " + all + "$");
		}
	}

}
