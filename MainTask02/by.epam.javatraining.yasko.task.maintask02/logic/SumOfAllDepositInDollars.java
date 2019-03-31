package logic;

import container.ClientsBase;
import model.*;
import view.*;

public class SumOfAllDepositInDollars {

	public static void findSumOfAllDepositInDollars(Deposit d) {

		double all = d.DOLLARS_DEPOSIT + d.EURO_DEPOSIT + Converter.convertEuroInDollar(d.EURO_DEPOSIT)
				+ Converter.convertRubInDollar(d.RUB_DEPOSIT);
		View.out("Sum of all deposit for " + d.getClient() + " is : " + all +"$\n");

	}

	public static void findSumOfAllDepositInDollars(ClientsBase base) {

		for (int i = 0; i < base.amountOfClients; i++) {
			double all = base.get(i).DOLLARS_DEPOSIT + Converter.convertEuroInDollar(base.get(i).EURO_DEPOSIT)
					+ Converter.convertRubInDollar(base.get(i).RUB_DEPOSIT);
			View.out("Sum of all deposit in dollars for client " + base.get(i).getClient() + " is: " + all + "$");
		}
	}

}
