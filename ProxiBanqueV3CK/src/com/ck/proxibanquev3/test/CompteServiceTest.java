package com.ck.proxibanquev3.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ck.proxibanquev3.domaine.Client;
import com.ck.proxibanquev3.domaine.Courant;
import com.ck.proxibanquev3.service.ClientService;
import com.ck.proxibanquev3.service.CompteService;

import junit.framework.Assert;

public class CompteServiceTest {

	private CompteService compteService;
	

	@Before
	public void AvantChaqueTest() {
		compteService = new CompteService();
	}
	
	
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
