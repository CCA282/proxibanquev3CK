package com.ck.proxibanquev3.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


/**
 * Classe Epargne qui repr�sente des compte Epargne de client
 * @author Cl�ment et Karim
 */
@Entity
@DiscriminatorValue("Epargne")
public class Epargne extends Compte{

	@OneToOne
	private Client titulaire;

	
			// Constructeur de la classe Epargne
	
	/**
	 * Constructeur de la classe Epargne
	 * @param idCompte
	 * @param solde
	 * @param dateOuverture
	 * @param titulaire
	 */
	public Epargne(int idCompte, double solde, String dateOuverture, Client titulaire) {
		super(idCompte, solde, dateOuverture);
		this.titulaire = titulaire;
	}

	

	/**
	 * Constructeur de la classe Epargne
	 * @param idCompte
	 * @param solde
	 * @param dateOuverture
	 */
	public Epargne(int idCompte, double solde, String dateOuverture) {
		super(idCompte, solde, dateOuverture);
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * Constructeur de la classe Epargne
	 * @param idCompte
	 * @param solde
	 */
	public Epargne(int idCompte, double solde) {
		super(idCompte, solde);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructeur de la classe Epargne
	 * @param idCompte
	 */
	public Epargne(int idCompte) {
		super(idCompte);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur de la classe Epargne
	 */
	public Epargne() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	
			// Setter et Getter de la classe Epargne
	
	/**
	 * M�thode permettant d'obtenir le client qui poss�de le compte Epargne
	 * @return titulaire le client qui poss�de le compte Epargne
	 */
	public Client getTitulaire() {
		return titulaire;
	}
	



	/**
	 * M�thode permettant de modifier le client qui poss�de le compte Epargne
	 * @param titulaire le client qui poss�de le compte Epargne
	 */
	public void setTitulaire(Client titulaire) {
		this.titulaire = titulaire;
	}
	
	
}
