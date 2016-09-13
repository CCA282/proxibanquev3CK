package com.ck.proxibanquev3.domaine;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Classe Client qui représente des clients de proxibanque
 * @author Clément et Karim
 */
@Entity
public class Client extends Personne{
	
	private String adresse;
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Courant courant;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Epargne epargne;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Conseiller conseiller;
	

	/**
	 * Méthode permettant d'obtenir l'adresse du client
	 * @return adresse l'adresse du client
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Méthode permettant d'obtenir l'adresse du client
	 * @param adresse l'adresse du client
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Méthode permettant d'obtenir l'email du client
	 * @return email l'email du client
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Méthode permettant de modifier l'email du client
	 * @param email l'email du client
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Méthode permettant d'obtenir le compte courant du client
	 * @return courant le compte courant du client
	 */
	public Courant getCourant() {
		return courant;
	}

	/**
	 * Méthode permettant de modifier le compte courant du client
	 * @param courant le compte courant du client
	 */
	public void setCourant(Courant courant) {
		this.courant = courant;
	}

	/**
	 * Méthode permettant d'obtenir  le compte epargne du client
	 * @return Epargne le compte epargne du client
	 */
	public Epargne getEpargne() {
		return epargne;
	}

	/**
	 * Méthode permettant de modifier le compte épargne du client
	 * @param Epargne le compte epargne du client
	 */
	public void setEpargne(Epargne epargne) {
		this.epargne = epargne;
	}

	/**
	 * Méthode permettant d'obtenir  le conseiller du client
	 * @return conseiller le conseiller du client
	 */
	public Conseiller getConseiller() {
		return conseiller;
	}

	/**
	 * Méthode permettant de modifier le conseiller du client
	 * @param conseiller le conseiller du client
	 */
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	
	//Constructeur de la classe Client 
	
	/**
	 * Constructeur de la classe Client
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 * @param idCourant
	 * @param idEpargne
	 * @param conseiller
	 */
	public Client(String nom, String prenom, String adresse, String email, Courant courant, Epargne epargne,
			Conseiller conseiller) {
		super(nom, prenom);
		this.adresse = adresse;
		this.email = email;
		this.courant = courant;
		this.epargne = epargne;
		this.conseiller = conseiller;
	}

	/**
	 * Constructeur de la classe Client
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 * @param conseiller
	 */
	public Client(String nom, String prenom, String adresse, String email, Conseiller conseiller) {
		super(nom, prenom);
		this.adresse = adresse;
		this.email = email;
		this.conseiller = conseiller;
	}

	/**
	 * Constructeur de la classe Client
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 * @param idCourant
	 * @param idEpargne
	 */
	public Client(String nom, String prenom, String adresse, String email, Courant courant, Epargne epargne) {
		super(nom, prenom);
		this.adresse = adresse;
		this.email = email;
		this.courant = courant;
		this.epargne = epargne;
	}

	/**
	 * Constructeur de la classe Client
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 */
	public Client(String nom, String prenom, String adresse, String email) {
		super(nom, prenom);
		this.adresse = adresse;
		this.email = email;
	}
	/**
	 * Constructeur de la classe Client
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 */
	public Client(int id,String nom, String prenom, String adresse, String email) {
		super(id,nom, prenom);
		this.adresse = adresse;
		this.email = email;
	}
	/**
	 * Constructeur de la classe Client
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Client(int id, String nom, String prenom) {
		super(id, nom, prenom);
	}

	/**
	 * Constructeur de la classe Client
	 * @param nom
	 * @param prenom
	 */
	public Client(String nom, String prenom) {
		super(nom, prenom);
	}
	
	/**
	 * Constructeur de la classe Client
	 */
	public Client() {
		super();
	}

}
