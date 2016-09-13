package com.ck.proxibanquev3.vue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class ClientBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private int idCourant;
	private double soldeCC;
	private int idEpargne;
	private double soldeCE;

	private List<Clients> clients = new ArrayList<Clients>() {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;

		{
			add(new Clients(1, "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0));
			add(new Clients(2, "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0));
			add(new Clients(3, "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0));
			add(new Clients(4, "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0));
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
		Clients cl=new Clients(6, this.nom, this.prenom, "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0);
		this.clients.add(cl);
		return "/00listeclients.xhtml";
	}
	
	public String update(){

		Clients cl=new Clients(this.id, this.nom, this.prenom, "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0);
		this.clients.add(cl);
		return "/10editionclients.xhtml";
	}
	
	public String afficher(){
		Clients cl=new Clients(20, "sqdgfhfdg", "fdsgdfgs", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0);
		this.clients.add(cl);
		return "/21listecomptesclients.xhtml";
	}

}
