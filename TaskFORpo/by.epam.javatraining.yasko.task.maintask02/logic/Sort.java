package logic;

import container.*;
import model.Deposite;

public class Sort {

	public static void sortByDollarDep(ClientsBase base) {
		for (int i = 1; i < base.amountOfClients; i++) {
			for (int j = 0; j < base.amountOfClients - i; j++) {
				if (base.get(j).DOLLARS_DEPOSITE > base.get(j + 1).DOLLARS_DEPOSITE) {
					Deposite buf = base.clients[j];
					base.clients[j]=base.clients[j+1];
					base.clients[j+1]=buf;
				}
			}
		}
	}

	public static void sortByEuroDep(ClientsBase base) {
		for (int i = 1; i < base.amountOfClients; i++) {
			for (int j = 0; j < base.amountOfClients - i; j++) {
				if (base.get(j).EURO_DEPOSITE > base.get(j + 1).EURO_DEPOSITE) {
					Deposite buf = base.clients[j];
					base.clients[j]=base.clients[j+1];
					base.clients[j+1]=buf;
				}
			}
		}
	}

	public static void sortByRubDeposite(ClientsBase base) {
		for (int i = 1; i < base.amountOfClients; i++) {
			for (int j = 0; j < base.amountOfClients - i; j++) {
				if (base.get(j).RUB_DEPOSITE > base.get(j + 1).RUB_DEPOSITE) {
					Deposite buf = base.clients[j];
					base.clients[j]=base.clients[j+1];
					base.clients[j+1]=buf;
					
				}
			}
		}
	}

}
