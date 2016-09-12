package com.ck.proxibanquev3.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client extends Personne{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idClient;
	
	private String adresse;
	private String email;
	private int idCourant;
	private int idEpargne;
	
	/**
	 * Constructeur de clients
	 * @param idClient Le numéro d'identification du client
	 * @param nom Le nom du client
	 * @param prenom Le prénom du client
	 * @param adresse L'adresse du client
	 * @param email L'adresse e-mail du client
	 * @param idCourant Le numéro de compte courant du client
	 * @param idEpargne Le numéro de compte épargne du client
	 */
	public Client(int idClient, String nom, String prenom, String adresse, String email, int idCourant, int idEpargne) {
		super(nom, prenom);
		this.idClient = idClient;
		this.adresse = adresse;
		this.email = email;
		this.idCourant = idCourant;
		this.idEpargne = idEpargne;
	}
	
	/**
	 * Constructeur de clients
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 * @param idCourant
	 * @param idEpargne
	 */
	public Client(String nom, String prenom, String adresse, String email, int idCourant, int idEpargne) {
		super(nom, prenom);
		this.adresse = adresse;
		this.email = email;
		this.idCourant = idCourant;
		this.idEpargne = idEpargne;
	}

	/**
	 * Constructeur de clients
	 * @param nom Le nom du client
	 * @param prenom Le prénom du client
	 * @param adresse L'adresse du client
	 * @param email L'adresse e-mail du client
	 */
	public Client(String nom, String prenom, String adresse, String email) {
		this(0, nom, prenom, adresse, email, 0, 0);
	}
	
	/**
	 * Constructeur de clients par défaut
	 */
	public Client() {
		this(0, null, null, null, null, 0, 0);
	}

	/**
	 * Permet d'obtenir le numéro d'identification du client
	 * @return Le numéro d'identification du client
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * Permet d'obtenir le numéro de compte courant du client
	 * @return Un numéro de compte courant
	 */
	public int getIdCourant() {
		return idCourant;
	}

	/**
	 * Permet d'obtenir le numéro de compte épargne du client
	 * @return Un numéro de compte épargne
	 */
	public int getIdEpargne() {
		return idEpargne;
	}

	
	
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param iDClient the iDClient to set
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	/**
	 * @param iDCourant the iDCourant to set
	 */
	public void setIdCourant(int idCourant) {
		this.idCourant = idCourant;
	}

	/**
	 * @param iDEpargne the iDEpargne to set
	 */
	public void setIdEpargne(int idEpargne) {
		this.idEpargne = idEpargne;
	}

	@Override
	public String toString() {
		return "Client [adresse=" + adresse + ", email=" + email + "]";
	}

	
	
}
