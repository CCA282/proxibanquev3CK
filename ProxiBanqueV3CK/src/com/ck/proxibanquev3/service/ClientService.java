package com.ck.proxibanquev3.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.ck.proxibanquev3.dao.ClientDAO;
import com.ck.proxibanquev3.dao.CompteDAO;
import com.ck.proxibanquev3.dao.ConseillerDAO;
import com.ck.proxibanquev3.domaine.Client;

/**
 * Classe du domaine service qui concerne l'ensemble des services Clients. Cette
 * classe va permettre de: modifier, supprimer, creer, lire un client et
 * egalement d'obtenir la liste de tous les clients.
 * @author Clement et Karim
 */
public class ClientService {
	
	
	ConseillerDAO conseillerDao = new ConseillerDAO();
	ConseillerService conseillerService = new ConseillerService();
	ClientDAO clientDao = new ClientDAO();
	CompteDAO compteDao = new CompteDAO();
	
	
	/**
	 * Cette méthode permet de créer un client dans la base de donnée.
	 * 
	 * @param client
	 *            Le client qu'on souhaite créer dans la base de donnée. (Objet
	 *            de type CLient)
	 * @return Retourne un booléen: true si tout se déroule sans problemes sinon
	 *         false. (booléen)
	 */
	public boolean creerClient(Client client) {
		boolean result = clientDao.createClient(client);
		return result;
	}
	
	/**
	 * Cette méthode permet de modifier un client à partir de son identifiant
	 * (id).
	 * 
	 * @param idClient
	 *            L'identifiant du client qu'on souhaite changer. (int)
	 * @param client
	 *            L'objet client qui va permettre de mettre à jour le client
	 *            dans la base de données. (Objet de type Client)
	 * 
	 */
	public boolean modifierClient(Client client) {
		boolean result = clientDao.updateClient(client);
		return result;
	}
	
	/**
	 * Cette méthode permet de supprimer un client de la base de donnée.
	 * 
	 * @param idClient
	 *            L'identifiant (id) du client qu'on souhaite supprimer.
	 */
	public boolean suppressionClient(Client client) {
		boolean result = clientDao.deleteClient(client);
		return result;
	}

	/**
	 * Cette méthode permet de recuperer les informations client sous la forme
	 * d'un objet Client à partir de l'id du client.
	 * 
	 * @param idClient
	 *            L'identifiant (id) du client dont on souhaite consulter les
	 *            données. (int)
	 * @return Retourne un booléen: true si tout se déroule sans problemes sinon
	 *         false. (booléen)
	 */
	public Client lireClient(int idClient) {
		Client client = clientDao.findClientById(idClient);
		return client;
	}
	
	/**
	 * Cette méthode permet de recuperer une liste de l'ensemble des clients qui
	 * existent.
	 * 
	 * @return Cette methode retourne une liste de Client sous forme d'ArrayList
	 *         (List<Client>)
	 */
	public List<Client> lireTousLesCLients() {
		List<Client> listeClient = clientDao.getAllClient();
		return listeClient;
	}

	/**
	 * Cette méthode permet à partir du login d'un conseiller de retrouver
	 * l'ensemble des clients rattachés à ce conseiller. Cette methode renvoie
	 * les Clients sous forme d'ArrayList
	 * 
	 * @param id
	 *            L'id du conseiller responsable des clients dont on veut la
	 *            liste (int).
	 * @return Cette methode retourne une liste de Client sous forme d'ArrayList
	 *         (List<Client>)
	 */
	public List<Client> lireClientsParConseiller(int id) {
		List<Client> listeClient = clientDao.getAllCLientByConseiller(id);
		return listeClient;
	}

}
