package by.epam.javatraining.yasko.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import view.View;
import container.ClientsBase;
import model.Deposit;
import logic.RichestClient;

public class RichestClientTest {

	Deposit d1 = new Deposit("First", 1000, 1000, 1000);
	Deposit d2 = new Deposit("Second", 2000, 2000, 2000);
	Deposit d3 = new Deposit("Third", 1000, 1000, 1000);
	Deposit[] actualtrue = { d1, d2 };
	Deposit[] actualfalse = { d1, d3 };
	Deposit[] actualfalse2 = null;
	Deposit richestClient = null;
	Deposit expected = d2;

	
	@Test
	public void testGetClientWithBiggestDeposit1() {
		
		ClientsBase bas = new ClientsBase((int)-5);
		richestClient= RichestClient.getClientWithBiggestDeposit(bas);
		if(expected != richestClient)
			fail("expected fail");
	}
	
	@Test
	public void testGetClientWithBiggestDeposit2() {
		
		ClientsBase bas = new ClientsBase(0);
		richestClient= RichestClient.getClientWithBiggestDeposit(bas);
		if(expected != richestClient)
			fail("expect 'no clients' ");
	}
	@Test
	public void testGetClientWithBiggestDeposit3() {
		
		ClientsBase bas = new ClientsBase(actualfalse2);
		richestClient= RichestClient.getClientWithBiggestDeposit(bas);
		if(expected != richestClient)
			fail("expect 'no clients' ");
	}
	
	@Test
	public void testGetClientWithBiggestDeposit4() { 
		
		ClientsBase bas4 = new ClientsBase(actualtrue);
		richestClient= RichestClient.getClientWithBiggestDeposit(bas4);
		if(expected != richestClient)
			fail("epic fail");
	}
	
	@Test
	public void testGetClientWithBiggestDeposit5() {
		
		ClientsBase bas = new ClientsBase(actualfalse);
		richestClient= RichestClient.getClientWithBiggestDeposit(bas);
		if(expected != richestClient)
			fail("expect error");
		
	}

}
