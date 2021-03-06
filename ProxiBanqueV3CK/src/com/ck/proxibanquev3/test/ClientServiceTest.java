package com.ck.proxibanquev3.test;


import org.junit.Before;
import org.junit.Test;
import com.ck.proxibanquev3.domaine.Client;
import com.ck.proxibanquev3.service.ClientService;
import junit.framework.Assert;


/**
 * Classe permettant de tester les methodes de la classe ClientService
 * @author Clement et karim
 *
 */
public class ClientServiceTest {

	private ClientService clientService;
	
	@Before
	public void AvantTest() throws Exception {
		clientService = new ClientService();
		Client client = clientService.lireClient(9);
		client.setNom("Haliday");
		clientService.modifierClient(client);
	}


	@SuppressWarnings("deprecation")
	@Test
	public void testmodifierClient() {
		String nomClientAvantTest = clientService.lireClient(9).getNom();
		Client client = clientService.lireClient(9);
		client.setNom("Holliday");
		clientService.modifierClient(client);
		Assert.assertFalse(nomClientAvantTest.equalsIgnoreCase(clientService.lireClient(9).getNom()));
	}

}
