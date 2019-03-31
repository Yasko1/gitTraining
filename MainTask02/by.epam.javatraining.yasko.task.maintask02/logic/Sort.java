package logic;

import org.apache.log4j.Logger;

import container.*;
import model.Deposit;

public class Sort {

	private static final Logger logger;
	static {
		logger = Logger.getLogger(Sort.class);
	}

	public static void sortByDollarDep(ClientsBase base) {
		if (base.amountOfClients == 0) {
			logger.info("there are no clients");
		} else {
			logger.info("Sort");
			for (int i = 1; i < base.amountOfClients; i++) {
				for (int j = 0; j < base.amountOfClients - i; j++) {
					if (base.get(j).DOLLARS_DEPOSIT > base.get(j + 1).DOLLARS_DEPOSIT) {
						Deposit buf = base.clients[j];
						base.clients[j] = base.clients[j + 1];
						base.clients[j + 1] = buf;
					}
				}
			}
		}
	}

	public static void sortByEuroDep(ClientsBase base) {
		for (int i = 1; i < base.amountOfClients; i++) {
			for (int j = 0; j < base.amountOfClients - i; j++) {
				if (base.get(j).EURO_DEPOSIT > base.get(j + 1).EURO_DEPOSIT) {
					Deposit buf = base.clients[j];
					base.clients[j] = base.clients[j + 1];
					base.clients[j + 1] = buf;
				}
			}
		}
	}

	public static void sortByRubDeposite(ClientsBase base) {
		for (int i = 1; i < base.amountOfClients; i++) {
			for (int j = 0; j < base.amountOfClients - i; j++) {
				if (base.get(j).RUB_DEPOSIT > base.get(j + 1).RUB_DEPOSIT) {
					Deposit buf = base.clients[j];
					base.clients[j] = base.clients[j + 1];
					base.clients[j + 1] = buf;

				}
			}
		}
	}

}
