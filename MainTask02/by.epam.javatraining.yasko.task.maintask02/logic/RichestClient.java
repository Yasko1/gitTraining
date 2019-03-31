package logic;

import model.*;
import container.*;
import org.apache.log4j.*;

public class RichestClient {

	private static final Logger logger;
	static {
		logger = Logger.getLogger(RichestClient.class);
	}

	public static Deposit getClientWithBiggestDeposit(ClientsBase base) {

		if (base.amountOfClients <= 0) {
			logger.debug("there are no clients");
			return null;
		} else if (base.amountOfClients == 1) {
			logger.debug("no one to compare");
			return null;
		} else {
			Deposit richestClient = null;
			double max = 0;
			for (int i = 0; i < base.amountOfClients; i++) {
				if (base.get(i).getDollarDeposit() > max) {
					max = base.get(i).getDollarDeposit();
					richestClient = base.get(i);
				}
				if (base.get(i).getEuroDeposit() > max) {
					max = base.get(i).getEuroDeposit();
					richestClient = base.get(i);
				}
				if (base.get(i).getRubDeposit() > max) {
					max = base.get(i).getRubDeposit();
					richestClient = base.get(i);
				}
			}
			return richestClient;
		}
	}
}
