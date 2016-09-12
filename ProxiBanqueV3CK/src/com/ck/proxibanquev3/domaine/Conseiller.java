package com.ck.proxibanquev3.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conseiller extends Personne{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idConseiller;
	
	private String login;
	private String password;
	
	/**
	 * Constructeur de conseillers
	 * @param idConseiller Le numéro d'identification du conseiller
	 * @param nom Le nom du conseiller
	 * @param prenom Le prénom du conseiller
	 * @param login Le login du conseiller
	 * @param password Le mot de passe du conseiller
	 */
	public Conseiller(int idConseiller, String nom, String prenom, String login, String password) {
		super(nom, prenom);
		this.idConseiller = idConseiller;
		this.login = login;
		this.password = password;
	}
	
	/**
	 * Constructeur de conseillers
	 * @param nom Le nom du conseiller
	 * @param prenom Le prénom du conseiller
	 * @param login Le login du conseiller
	 * @param password Le mot de passe du conseiller
	 */
	public Conseiller(String nom, String prenom, String login, String password) {
		this(0, nom, prenom, login, password);
	}
	
	/**
	 * Constructeur de conseillers
	 * @param idConseiller Le numéro d'identification du conseiller
	 * @param nom Le nom du conseiller
	 * @param prenom Le prénom du conseiller
	 * @param login Le login du conseiller
	 */
	public Conseiller(int idConseiller, String nom, String prenom, String login) {
		this(idConseiller, nom, prenom, login, null);
	}
	
	/**
	 * Constructeur de conseillers par défaut
	 */
	public Conseiller() {
		this(0, null, null, null, null);
	}

	/**
	 * Permet d'obtenir le numéro d'identification d'un conseiller
	 * @return Un numéro d'identification
	 */
	public int getIdConseiller() {
		return idConseiller;
	}

	
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}



	@Override
	public String toString() {
		return "Conseiller [iDConseiller=" + idConseiller + ", login=" + login + ", password=" + password + "]";
	}

}
