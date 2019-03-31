package controller;

import java.io.IOException;
import org.apache.log4j.Logger;
import logic.*;
import model.*;
import view.View;
import container.*;

public class Main {

	private static final Logger logger;
	static {
		logger = Logger.getLogger(Main.class);
	}

	public static void main(String[] args) throws IOException {

		logger.info("Clients: ");
		Deposit d1 = new Deposit();
		d1.setClient("01", "Ivan Ivanov ");
		d1.setDollarDeposit(100);
		d1.setEuroDeposit(0.5);
		d1.setRubDeposit(-45);
		View.out(d1.getInfoAboutClient());

		Deposit d2 = new Deposit();
		d2.setClient("02", "Petya Petrov ");
		d2.setEuroDeposit(50.50);
		View.out(d2.getInfoAboutClient());

		Deposit d3 = new Deposit();
		d3.setClient("03", "Fedya Fedorov ");
		d3.setDollarDeposit(100000);
		d3.setEuroDeposit(10.5);
		d3.setRubDeposit(9);
		View.out(d3.getInfoAboutClient());

		Deposit d4 = new Deposit();
		d4.setClient("04", "Vasya Vasiliev ");
		d4.setDollarDeposit(78);
		d4.setEuroDeposit(0);
		d4.setRubDeposit(0);
		View.out(d4.getInfoAboutClient());

		Deposit[] deposits = { d1, d2, d3, d4 };

		ClientsBase base = new ClientsBase(deposits, 4);

		View.out((base.getClient(RichestClient.getClientWithBiggestDeposit(base)) + "\n"));

		SumOfAllDepositInDollars.findSumOfAllDepositInDollars(d4);
		SumOfAllDepositInDollars.findSumOfAllDepositInDollars(base);
		Sort.sortByDollarDep(base);
		View.out("\nSort by Dollar: ");
		base.getAllClients();
		Sort.sortByEuroDep(base);
		View.out("\nSort by Euro: ");
		base.getAllClients();
		Sort.sortByRubDeposite(base);
		View.out("\nSort by Rub: ");
		base.getAllClients();

		View.out("\nDeposit 'Hot' for 10 month: ");
		HotDepositForTenMonth.getInfoAboutPercentForDeposit();

		View.out(base.toString());
	}
}