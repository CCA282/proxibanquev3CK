package com.ck.proxibanquev3.domaine;

public class Client extends Personne{

	private int iDClient;
	private String adresse;
	private String email;
	private int iDCourant;
	private int iDEpargne;
	
	/**
	 * Constructeur de clients
	 * @param iDClient Le numéro d'identification du client
	 * @param nom Le nom du client
	 * @param prenom Le prénom du client
	 * @param adresse L'adresse du client
	 * @param email L'adresse e-mail du client
	 * @param idcourant Le numéro de compte courant du client
	 * @param idepargne Le numéro de compte épargne du client
	 */
	public Client(int iDClient, String nom, String prenom, String adresse, String email, int idcourant, int idepargne) {
		super(nom, prenom);
		this.iDClient = iDClient;
		this.adresse = adresse;
		this.email = email;
		this.iDCourant = idcourant;
		this.iDEpargne = idepargne;
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
	public int getiDClient() {
		return iDClient;
	}

	/**
	 * Permet d'obtenir le numéro de compte courant du client
	 * @return Un numéro de compte courant
	 */
	public int getiDCourant() {
		return iDCourant;
	}

	/**
	 * Permet d'obtenir le numéro de compte épargne du client
	 * @return Un numéro de compte épargne
	 */
	public int getiDEpargne() {
		return iDEpargne;
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
	public void setiDClient(int iDClient) {
		this.iDClient = iDClient;
	}

	/**
	 * @param iDCourant the iDCourant to set
	 */
	public void setiDCourant(int iDCourant) {
		this.iDCourant = iDCourant;
	}

	/**
	 * @param iDEpargne the iDEpargne to set
	 */
	public void setiDEpargne(int iDEpargne) {
		this.iDEpargne = iDEpargne;
	}

	@Override
	public String toString() {
		return "Client [adresse=" + adresse + ", email=" + email + "]";
	}

	
	
}
