package com.ck.proxibanquev3.service;

import java.util.ArrayList;
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
	
	@Inject
	ConseillerDAO conseillerDao;
	ConseillerService conseillerService;
	ClientDAO clientDao;
	CompteDAO compteDao;
	
	
	/**
	 * Cette m�thode permet de cr�er un client dans la base de donn�e.
	 * 
	 * @param client
	 *            Le client qu'on souhaite cr�er dans la base de donn�e. (Objet
	 *            de type CLient)
	 * @return Retourne un bool�en: true si tout se d�roule sans problemes sinon
	 *         false. (bool�en)
	 */
	public boolean creerClient(Client client) {
		clientDao.createClient(client);
		return true;
	}
	
	/**
	 * Cette m�thode permet de modifier un client � partir de son identifiant
	 * (id).
	 * 
	 * @param idClient
	 *            L'identifiant du client qu'on souhaite changer. (int)
	 * @param client
	 *            L'objet client qui va permettre de mettre � jour le client
	 *            dans la base de donn�es. (Objet de type Client)
	 * 
	 */
	public boolean modifierClient(int idClient, Client client) {
		return true;
	}
	
	/**
	 * Cette m�thode permet de supprimer un client de la base de donn�e.
	 * 
	 * @param idClient
	 *            L'identifiant (id) du client qu'on souhaite supprimer.
	 */
	public boolean suppressionClient(int idClient) {
		return true;
	}

	/**
	 * Cette m�thode permet de recuperer les informations client sous la forme
	 * d'un objet Client � partir de l'id du client.
	 * 
	 * @param idClient
	 *            L'identifiant (id) du client dont on souhaite consulter les
	 *            donn�es. (int)
	 * @return Retourne un bool�en: true si tout se d�roule sans problemes sinon
	 *         false. (bool�en)
	 */
	public Client lireClient(int idClient) {
		Client client = null;
		return client;
	}
	
	/**
	 * Cette m�thode permet de recuperer une liste de l'ensemble des clients qui
	 * existent.
	 * 
	 * @return Cette methode retourne une liste de Client sous forme d'ArrayList
	 *         (ArrayList<Client>)
	 */
	public ArrayList<Client> lireTousLesCLients() {
		ArrayList<Client> listeClient = null;
		return listeClient;
	}

	/**
	 * Cette m�thode permet � partir du login d'un conseiller de retrouver
	 * l'ensemble des clients rattach�s � ce conseiller. Cette methode renvoie
	 * les Clients sous forme d'ArrayList
	 * 
	 * @param login
	 *            Le login du conseiller responsable des clients dont on veut la
	 *            liste (String).
	 * @return Cette methode retourne une liste de Client sous forme d'ArrayList
	 *         (ArrayList<Client>)
	 */
	public ArrayList<Client> lireClientsParConseiller(String login) {
		ArrayList<Client> listeClient = null;
		return listeClient;
	}

}
