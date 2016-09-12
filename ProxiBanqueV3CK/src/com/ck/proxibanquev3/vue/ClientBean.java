package com.ck.proxibanquev3.vue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class ClientBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String idCourant;
	private String soldeCC;
	private String idEpargne;
	private String soldeCE;

	private List<Clients> clients = new ArrayList<Clients>() {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;

		{
			add(new Clients("1", "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", "1", "25.0", "2", "30.0"));
			add(new Clients("2", "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", "1", "25.0", "2", "30.0"));
			add(new Clients("3", "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", "1", "25.0", "2", "30.0"));
			add(new Clients("4", "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", "1", "25.0", "2", "30.0"));
		}
	};

	/**
	 * 
	 */
	public ClientBean() {
		super();
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

	/**
	 * @return the clients
	 */
	public List<Clients> getClients() {
		return clients;
	}

	/**
	 * @param clients
	 *            the clients to set
	 */
	public void setClients(List<Clients> clients) {
		this.clients = clients;
	}
	
	public String creer(){
		Clients cl=new Clients("6", this.nom, this.prenom, "3 rue du catch", "Huld@Hogan.com", "1", "25.0", "2", "30.0");
		this.clients.add(cl);
		return "00listeclients.xhtml?i=0";
	}
	
	public String update(){
		Clients cl=new Clients("2", this.nom, this.prenom, "3 rue du catch", "Huld@Hogan.com", "1", "25.0", "2", "30.0");
		this.clients.add(cl);
		return "10editionclients.xhtml?i=1";
	}

}
