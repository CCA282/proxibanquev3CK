package com.ck.proxibanquev3.vue;

public class Clients {

	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private int idCourant;
	private double soldeCC;
	private int idEpargne;
	private double soldeCE;

	/**
	 * 
	 */
	public Clients() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 * @param idCourant
	 * @param soldeCC
	 * @param idEpargne
	 * @param soldeCE
	 */
	public Clients(String nom, String prenom, String adresse, String email, int idCourant, double soldeCC,
			int idEpargne, double soldeCE) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.idCourant = idCourant;
		this.soldeCC = soldeCC;
		this.idEpargne = idEpargne;
		this.soldeCE = soldeCE;
	}

	public Clients(int id, String nom, String prenom, String adresse, String email, int idCourant, double soldeCC,
			int idEpargne, double soldeCE) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.idCourant = idCourant;
		this.soldeCC = soldeCC;
		this.idEpargne = idEpargne;
		this.soldeCE = soldeCE;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
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
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the idCourant
	 */
	public int getIdCourant() {
		return idCourant;
	}

	/**
	 * @param idCourant
	 *            the idCourant to set
	 */
	public void setIdCourant(int idCourant) {
		this.idCourant = idCourant;
	}

	/**
	 * @return the soldeCC
	 */
	public double getSoldeCC() {
		return soldeCC;
	}

	/**
	 * @param soldeCC
	 *            the soldeCC to set
	 */
	public void setSoldeCC(double soldeCC) {
		this.soldeCC = soldeCC;
	}

	/**
	 * @return the idEpargne
	 */
	public int getIdEpargne() {
		return idEpargne;
	}

	/**
	 * @param idEpargne
	 *            the idEpargne to set
	 */
	public void setIdEpargne(int idEpargne) {
		this.idEpargne = idEpargne;
	}

	/**
	 * @return the soldeCE
	 */
	public double getSoldeCE() {
		return soldeCE;
	}

	/**
	 * @param soldeCE
	 *            the soldeCE to set
	 */
	public void setSoldeCE(double soldeCE) {
		this.soldeCE = soldeCE;
	}

}
