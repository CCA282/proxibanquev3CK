package com.ck.proxibanquev3.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.ck.proxibanquev3.service.ConseillerService;

/**
 * Classe permettant de tester les methodes de la classe ConseilerService
 * @author Clement et karim
 *
 */
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
