package model;

public class Client {
	
	public String ACCOUNT;
	public String CLIENT_NAME;

	Client() {
	}

	Client(String number, String name) {
		ACCOUNT = number;
		CLIENT_NAME = name;
	}

	Client(Client c) {
		ACCOUNT = c.ACCOUNT;
		CLIENT_NAME = c.CLIENT_NAME;
	}

	public void setClient(String number, String name) {
		ACCOUNT = number;
		CLIENT_NAME = name;
	}

	public String getClient() {
		return ACCOUNT + ". " + CLIENT_NAME;
	}

	public String getNumberOfClient() {
		return ACCOUNT;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Client other = (Client) obj;

		if (ACCOUNT == null) {
			if (other.ACCOUNT != null)
				return false;

		} else if (!ACCOUNT.equals(other.ACCOUNT))
			return false;
		if (CLIENT_NAME == null) {
			if (other.CLIENT_NAME != null)
				return false;

		} else if (!CLIENT_NAME.equals(other.CLIENT_NAME))
			return false;
		
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ACCOUNT == null) ? 0 : ACCOUNT.hashCode());
		result = prime * result + ((CLIENT_NAME == null) ? 0 : CLIENT_NAME.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Client's number: =" + ACCOUNT + ". Name: " + CLIENT_NAME;
	}

}