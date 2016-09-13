package com.ck.proxibanquev3.dao;

import com.ck.proxibanquev3.domaine.Client;
import com.ck.proxibanquev3.domaine.Conseiller;
import com.ck.proxibanquev3.domaine.Courant;

public class Main {
	
	public static void main(String[] args) {

		Conseiller conseiller1 = new Conseiller("castro", "clement", "cca", "gtm");
		Client client1 = new Client("pierre", "jacque");
		Client client2 = new Client("Amanda", "Stark");
		ConseillerDAO conseillerDAO = new ConseillerDAO();
		ClientDAO clientDAO = new ClientDAO();
		CompteDAO compteDAO = new CompteDAO();
		Client client3;
		Courant courant1 = new Courant(540, "12/08/2015", client1);
		
		clientDAO.createClient(client1);
		conseillerDAO.createConseiller(conseiller1);
		clientDAO.createClient(client2);
		System.out.println(clientDAO.getAllClient());
		clientDAO.deleteClient(client1);
		System.out.println(clientDAO.getAllClient());
		client3 = clientDAO.findClientById(7);
		client3.setNom("Jean");
		clientDAO.updateClient(client3);
		System.out.println(clientDAO.getAllClient());
		compteDAO.createCourant(courant1);
		
	}

}
