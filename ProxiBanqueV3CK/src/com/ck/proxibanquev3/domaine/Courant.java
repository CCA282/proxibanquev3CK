package com.ck.proxibanquev3.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


/**
 * Classe Courant qui représente des compte Courant de client
 * @author Clément et Karim
 */
@Entity
@DiscriminatorValue("Courant")
public class Courant extends Compte{

	@OneToOne
	private Client titulaire;

			// Constructeur de la classe Courant
	
	/**
	 * Constructeur de la classe Courant
	 * @param idCompte
	 * @param solde
	 * @param dateOuverture
	 * @param titulaire
	 */
	public Courant(int idCompte, double solde, String dateOuverture, Client titulaire) {
		super(idCompte, solde, dateOuverture);
		this.titulaire = titulaire;
	}
	
	public Courant(double solde, String dateOuverture, Client titulaire) {
		super(solde, dateOuverture);
		this.titulaire = titulaire;
	}
	
	/**
	 * Constructeur de la classe Courant
	 * @param idCompte
	 * @param solde
	 * @param dateOuverture
	 */
	public Courant(int idCompte, double solde, String dateOuverture) {
		super(idCompte, solde, dateOuverture);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe Courant
	 * @param idCompte
	 * @param solde
	 */
	public Courant(int idCompte, double solde) {
		super(idCompte, solde);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe Courant
	 * @param idCompte
	 */
	public Courant(int idCompte) {
		super(idCompte);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur de la classe Courant
	 * @param idCompte
	 */
	public Courant(double solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur de la classe Courant
	 */
	public Courant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
			// Getter et Setter de la classe Courant
	
	/**
	 * Méthode permettant d'obtenir le client qui possède le compte Courant
	 * @return titulaire le client qui possède le compte Courant
	 */
	public Client getTitulaire() {
		return titulaire;
	}

	
	/**
	 * Méthode permettant de modifier le client qui possède le compte Courant
	 * @param titulaire le client qui possède le compte Courant
	 */
	public void setTitulaire(Client titulaire) {
		this.titulaire = titulaire;
	}
	

}
