package logic;

import java.io.*;
import org.apache.log4j.*;
import model.*;
import view.View;
import java.util.Scanner;

public class HotDepositForTenMonth {

	private static final Logger logger;
	static {
		logger = Logger.getLogger(RichestClient.class);
	}

	public static void getInfoAboutPercentForDeposit() throws IOException {

		try {
			File file = new File("PercentsForDeposits.txt");

			if (!file.exists()) {
				logger.info("File doesn't exist! So, create it ");
				file.createNewFile();
				PrintWriter p = new PrintWriter(file);
				p.println("15");
				p.println("12");
				p.println("20");
				p.close();
				View.out("New file: ");
			}
		} catch (IOException e) {
			logger.error("Error: " + e);
		}

		try (Scanner scn = new Scanner(new FileReader("PercentsForDeposits.txt"))) {
			Deposits[] all = Deposits.values();
			while (scn.hasNext()) {
				for (Deposits d : all) {
					View.out(d + ": " + scn.next() + "%");
				}
			}
		}
	}
}