package model;

public class Deposite extends Client {

	public double DOLLARS_DEPOSITE;
	public double EURO_DEPOSITE;
	public double RUB_DEPOSITE;

	public Deposite() {
	}

	public void setDollarDeposite(double DOLLARS_DEPOSITE) {
		if (DOLLARS_DEPOSITE >= 0) {
			this.DOLLARS_DEPOSITE = DOLLARS_DEPOSITE;
		} else {
			this.DOLLARS_DEPOSITE = 0;
		}
	}

	public double getDollarDeposite() {
		return DOLLARS_DEPOSITE;
	}

	public void setEuroDeposite(double EURO_DEPOSITE) {
		if (EURO_DEPOSITE >= 0) {
			this.EURO_DEPOSITE = EURO_DEPOSITE;
		} else {
			this.EURO_DEPOSITE = 0;
		}
	}

	public double getEuroDeposite() {
		return EURO_DEPOSITE;
	}

	public void setRubDeposite(double RUB_DEPOSITE) {
		if (RUB_DEPOSITE >= 0) {
			this.RUB_DEPOSITE = RUB_DEPOSITE;
		} else {
			this.RUB_DEPOSITE = 0;
		}
	}

	public double getRubDeposite() {
		return RUB_DEPOSITE;
	}

	public String getInfoAboutClient() {
		return super.getClient() + "Deposites: Dollars: " + getDollarDeposite() + "  || Euro: " + getEuroDeposite()
				+ "  || Rub: " + getRubDeposite() + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deposite other = (Deposite) obj;
		if (Double.doubleToLongBits(DOLLARS_DEPOSITE) != Double.doubleToLongBits(other.DOLLARS_DEPOSITE))
			return false;
		if (Double.doubleToLongBits(EURO_DEPOSITE) != Double.doubleToLongBits(other.EURO_DEPOSITE))
			return false;
		if (Double.doubleToLongBits(RUB_DEPOSITE) != Double.doubleToLongBits(other.RUB_DEPOSITE))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(DOLLARS_DEPOSITE);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(EURO_DEPOSITE);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(RUB_DEPOSITE);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "\n Deposites:\nDollars: " + getDollarDeposite() + "\nEuro: " + getEuroDeposite()
		+ "\nRub: " + getRubDeposite() + "\n";
	}
	
}
