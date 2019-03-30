package container;

import java.util.Arrays;

import model.*;
import view.View;

public class ClientsBase {

	public Deposite[] clients;
	private static final int DEFAULT_COUNT_OF_CLIENTS = 10;
	public int amountOfClients;

	public ClientsBase() {
		clients = new Deposite[DEFAULT_COUNT_OF_CLIENTS];
	}

	public ClientsBase(int amount) {
		clients = new Deposite[amount];
	}

	public ClientsBase(Deposite[] clients, int amountOfClients) {
		this.clients = clients;
		this.amountOfClients = amountOfClients;
	}

	public ClientsBase(Object... objects) {
	}

	public ClientsBase(ClientsBase clientsBase) {
		clients = clientsBase.clients;
		amountOfClients = clientsBase.amountOfClients;
	}

	public int amountOfClients() {
		return amountOfClients;
	}

	public Deposite[] getClients() {
		return clients;
	}

	public void setClients(Deposite[] clients) {
		this.clients = clients;
	}

	public Deposite get(int id) {

		if (id < amountOfClients)
			return clients[id];

		return null;
	}
	
	public String getClient(Deposite d) {
		return d.ACCOUNT +". "+ d.CLIENT_NAME;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amountOfClients;
		result = prime * result + Arrays.hashCode(clients);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientsBase other = (ClientsBase) obj;
		if (amountOfClients != other.amountOfClients)
			return false;
		if (!Arrays.equals(clients, other.clients))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClientsBase [clients=" + Arrays.toString(clients) + ", amountOfClients=" + amountOfClients + "]";
	}
	
	public void getAllClients() {
		for (int i = 0; i < amountOfClients; i++) {
			View.out(clients[i].getInfoAboutClient());
		}
	}
	

}
