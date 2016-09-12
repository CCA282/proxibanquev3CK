package com.ck.proxibanquev3.vue;

public class Clients {

	private String id;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String idCourant;
	private String soldeCC;
	private String idEpargne;
	private String soldeCE;

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
	public Clients(String nom, String prenom, String adresse, String email, String idCourant, String soldeCC,
			String idEpargne, String soldeCE) {
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

	public Clients(String id, String nom, String prenom, String adresse, String email, String idCourant, String soldeCC,
			String idEpargne, String soldeCE) {
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
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
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
	public String getIdCourant() {
		return idCourant;
	}

	/**
	 * @param idCourant
	 *            the idCourant to set
	 */
	public void setIdCourant(String idCourant) {
		this.idCourant = idCourant;
	}

	/**
	 * @return the soldeCC
	 */
	public String getSoldeCC() {
		return soldeCC;
	}

	/**
	 * @param soldeCC
	 *            the soldeCC to set
	 */
	public void setSoldeCC(String soldeCC) {
		this.soldeCC = soldeCC;
	}

	/**
	 * @return the idEpargne
	 */
	public String getIdEpargne() {
		return idEpargne;
	}

	/**
	 * @param idEpargne
	 *            the idEpargne to set
	 */
	public void setIdEpargne(String idEpargne) {
		this.idEpargne = idEpargne;
	}

	/**
	 * @return the soldeCE
	 */
	public String getSoldeCE() {
		return soldeCE;
	}

	/**
	 * @param soldeCE
	 *            the soldeCE to set
	 */
	public void setSoldeCE(String soldeCE) {
		this.soldeCE = soldeCE;
	}

}
