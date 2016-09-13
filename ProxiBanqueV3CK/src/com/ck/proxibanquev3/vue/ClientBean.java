package com.ck.proxibanquev3.vue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ck.proxibanquev3.dao.ClientDAO;
import com.ck.proxibanquev3.domaine.Client;
import com.ck.proxibanquev3.domaine.Conseiller;
import com.ck.proxibanquev3.domaine.Courant;
import com.ck.proxibanquev3.domaine.Epargne;
import com.ck.proxibanquev3.service.ClientService;



public class ClientBean implements Serializable {

	
	ClientDAO clientDAO=new ClientDAO();
	
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
	private Courant courant;
	private Epargne epargne;

	private List<Client> clients = new ArrayList<Client>() {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;

		{
			addAll(clientDAO.getAllClient());
//			add(new Clients(1, "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0));
//			add(new Clients(2, "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0));
//			add(new Clients(3, "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0));
//			add(new Clients(4, "Hogan", "Hulk", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0));
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
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients
	 *            the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	/**
	 * @return the courant
	 */
	public Courant getCourant() {
		return courant;
	}

	/**
	 * @param courant the courant to set
	 */
	public void setCourant(Courant courant) {
		this.courant = courant;
	}

	/**
	 * @return the epargne
	 */
	public Epargne getEpargne() {
		return epargne;
	}

	/**
	 * @param epargne the epargne to set
	 */
	public void setEpargne(Epargne epargne) {
		this.epargne = epargne;
	}

	public String creer(){
		Courant courant=new Courant(this.soldeCC*1.0);
		Epargne epargne=new Epargne(this.soldeCE*1.0);
		Conseiller conseiller=new Conseiller("Douglas", "Mbiandou", "douglas", "mbiandou");
		Client cl=new Client(this.nom, this.prenom,this.adresse, this.email, courant, epargne, conseiller);
		clientDAO.createClient(cl);
		clients=new ArrayList<Client>() {
			private static final long serialVersionUID = 1L;
			{
				addAll(clientDAO.getAllClient());
			}};
		return "/00listeclients.xhtml";
	}
	
	public String update(){

//		Clients cl=new Clients(this.id, this.nom, this.prenom, "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0);
//		this.clients.add(cl);
		return "/10editionclients.xhtml";
	}
	
	public String afficher(){
//		Clients cl=new Clients(20, "sqdgfhfdg", "fdsgdfgs", "3 rue du catch", "Huld@Hogan.com", 1, 25.0, 2, 30.0);
//		this.clients.add(cl);
		return "/21listecomptesclients.xhtml";
	}

}
