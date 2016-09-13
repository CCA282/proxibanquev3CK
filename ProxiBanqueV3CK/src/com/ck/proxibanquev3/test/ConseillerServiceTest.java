package com.ck.proxibanquev3.test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ck.proxibanquev3.domaine.Client;
import com.ck.proxibanquev3.domaine.Conseiller;
import com.ck.proxibanquev3.service.ClientService;
import com.ck.proxibanquev3.service.ConseillerService;

public class ConseillerServiceTest {
	
	private ConseillerService conseillerService;

	@Before
	public void setUp() throws Exception {
		conseillerService = new ConseillerService();
	}


	@Test
	public void testreadByLogin() {
		String login = "cca";
		String login1 = conseillerService.readByLogin("cca").getLogin();
		assertTrue(login.equalsIgnoreCase(login1));
		;
	}

}
