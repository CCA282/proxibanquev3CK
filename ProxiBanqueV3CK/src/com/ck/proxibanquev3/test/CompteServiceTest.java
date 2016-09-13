package com.ck.proxibanquev3.test;

import org.junit.Before;
import org.junit.Test;
import com.ck.proxibanquev3.domaine.Courant;
import com.ck.proxibanquev3.service.CompteService;

import junit.framework.Assert;

/**
 * Classe permettant de tester les methodes de la classe CompteService
 * @author Clement et karim
 *
 */
public class CompteServiceTest {

	private CompteService compteService;
	

	@Before
	public void AvantChaqueTest() {
		compteService = new CompteService();
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testcrediter() {
		double montantTestAvant = compteService.lireCourant(5).getSolde();
		Courant courant = compteService.lireCourant(5);
		compteService.crediter(courant, 5000);
		double total = montantTestAvant + 5000;
		double montantTestApres = (compteService.lireCourant(5).getSolde());
		Assert.assertEquals(total, montantTestApres, 0.1);
	}

}
