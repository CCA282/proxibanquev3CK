package com.ck.proxibanquev3.domaine;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Classe Compte qui représente des comptes client
 * @author Clément et Karim
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Compte")
@DiscriminatorValue("Mere")
public class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCompte;
	
	private double solde;
	private String dateOuverture;
	
	
	// Constructeur de la classe Compte
	
	/**
	 * Constructeur de la classe Compte
	 * @param idCompte
	 * @param solde
	 * @param dateOuverture
	 */
	public Compte(int idCompte, double solde, String dateOuverture) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	
	/**
	 * Constructeur de la classe Compte
	 * @param idCompte
	 * @param solde
	 */
	public Compte(int idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}
	
	
	/**
	 * Constructeur de la classe Compte
	 * @param solde
	 * @param dateOuverture
	 */
	public Compte(double solde, String dateOuverture) {
		super();
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}


	/**
	 * Constructeur de la classe Compte
	 * @param idCompte
	 */
	public Compte(int idCompte) {
		super();
		this.idCompte = idCompte;
	}
	/**
	 * Constructeur de la classe Compte
	 * @param idCompte
	 */
	public Compte(double solde) {
		super();
		this.solde = solde;
	}
	
	/**
	 * Constructeur de la classe Compte
	 */
	public Compte() {
		super();
	}


	
	// Getter et Setter de la classe Compte
	
	/**
	 * Méthode permettant d'obtenir l'identifiant du compte
	 * @return idCompte l'identifiant du compte
	 */
	public int getIdCompte() {
		return idCompte;
	}


	
	/**
	 * Méthode permettant de modifier l'identifiant du compte
	 * @param idCompte l'identifiant du compte
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}


	
	/**
	 * Méthode permettant d'obtenir le solde du compte
	 * @return solde le solde du compte
	 */
	public double getSolde() {
		return solde;
	}
	


	/**
	 * Méthode permettant de modifier le solde du compte
	 * @param solde le solde du compte
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}


	
	/**
	 * Méthode permettant d'obtenir la date d'ouverture du compte
	 * @return dateOuverture la date d'ouverture du compte
	 */
	public String getDateOuverture() {
		return dateOuverture;
	}


	
	/**
	 * Méthode permettant de modifier la date d'ouverture du compte
	 * @param dateOuverture la date d'ouverture du compte
	 */
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
}
