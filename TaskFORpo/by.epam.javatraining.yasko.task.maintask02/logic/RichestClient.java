package logic; 

import model.*;
import container.*;


public class RichestClient {
	
	public static Deposite getClientWithBiggestDeposite(ClientsBase base) {

		Deposite richestClient = null;
		double max=0;
		for(int i=0; i<base.amountOfClients;i++) {
			if(base.get(i).getDollarDeposite()>max){
				max=base.get(i).getDollarDeposite();
				richestClient=base.get(i);
			}
			if(base.get(i).getEuroDeposite()>max){
				max=base.get(i).getEuroDeposite();
				richestClient=base.get(i);
			}
			if(base.get(i).getRubDeposite()>max){
				max=base.get(i).getRubDeposite();
				richestClient=base.get(i);
			}
		}
		return richestClient;
	}
}
