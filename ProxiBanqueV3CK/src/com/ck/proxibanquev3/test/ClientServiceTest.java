package com.ck.proxibanquev3.test;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ck.proxibanquev3.dao.ClientDAO;
import com.ck.proxibanquev3.dao.ConseillerDAO;
import com.ck.proxibanquev3.domaine.Client;
import com.ck.proxibanquev3.domaine.Conseiller;
import com.ck.proxibanquev3.service.ClientService;

public class ClientServiceTest {

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
//		conseiller1 = new Conseiller("castro", "clement", "cca", "gtm");
//		client1 = new Client("pierre", "jacque");
//		client2 = new Client("Amanda", "Stark");
//		conseillerDAO = new ConseillerDAO();
//		clientDAO = new ClientDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ClientService clientservice = new ClientService();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreerClient() {

		fail("Not yet implemented");
	}

}
