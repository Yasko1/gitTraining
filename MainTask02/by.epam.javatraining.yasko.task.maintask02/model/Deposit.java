package model;

public class Deposit extends Client {
	
	public double DOLLARS_DEPOSIT;
	public double EURO_DEPOSIT;
	public double RUB_DEPOSIT;

	public Deposit() {
	}

	public void setDollarDeposit(double DOLLARS_DEPOSIT) {
		if (DOLLARS_DEPOSIT >= 0) {
			this.DOLLARS_DEPOSIT = DOLLARS_DEPOSIT;
		} else {
			this.DOLLARS_DEPOSIT = 0;
		}
	}

	public double getDollarDeposit() {
		return DOLLARS_DEPOSIT;
	}

	public void setEuroDeposit(double EURO_DEPOSIT) {
		if (EURO_DEPOSIT >= 0) {
			this.EURO_DEPOSIT = EURO_DEPOSIT;
		} else {
			this.EURO_DEPOSIT = 0;
		}
	}

	public double getEuroDeposit() {
		return EURO_DEPOSIT;
	}

	public void setRubDeposit(double RUB_DEPOSIT) {
		if (RUB_DEPOSIT >= 0) {
			this.RUB_DEPOSIT = RUB_DEPOSIT;
		} else {
			this.RUB_DEPOSIT = 0;
		}
	}

	public double getRubDeposit() {
		return RUB_DEPOSIT;
	}

	public String getInfoAboutClient() {
		return super.getClient() + " Deposits: Dollars: " + getDollarDeposit() + "  || Euro: " + getEuroDeposit()
				+ "  || Rub: " + getRubDeposit() + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deposit other = (Deposit) obj;
		if (Double.doubleToLongBits(DOLLARS_DEPOSIT) != Double.doubleToLongBits(other.DOLLARS_DEPOSIT))
			return false;
		if (Double.doubleToLongBits(EURO_DEPOSIT) != Double.doubleToLongBits(other.EURO_DEPOSIT))
			return false;
		if (Double.doubleToLongBits(RUB_DEPOSIT) != Double.doubleToLongBits(other.RUB_DEPOSIT))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(DOLLARS_DEPOSIT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(EURO_DEPOSIT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(RUB_DEPOSIT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "\n Deposites:\nDollars: " + getDollarDeposit() + "\nEuro: " + getEuroDeposit()
		+ "\nRub: " + getRubDeposit() + "\n";
	}
	
}
