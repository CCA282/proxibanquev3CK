package com.ck.proxibanquev3.domaine;

public class Conseiller extends Personne{
	
	private int iDConseiller;
	private String login;
	private String password;
	
	/**
	 * Constructeur de conseillers
	 * @param iDConseiller Le num�ro d'identification du conseiller
	 * @param nom Le nom du conseiller
	 * @param prenom Le pr�nom du conseiller
	 * @param login Le login du conseiller
	 * @param password Le mot de passe du conseiller
	 */
	public Conseiller(int iDConseiller, String nom, String prenom, String login, String password) {
		super(nom, prenom);
		this.iDConseiller = iDConseiller;
		this.login = login;
		this.password = password;
	}
	
	/**
	 * Constructeur de conseillers
	 * @param nom Le nom du conseiller
	 * @param prenom Le pr�nom du conseiller
	 * @param login Le login du conseiller
	 * @param password Le mot de passe du conseiller
	 */
	public Conseiller(String nom, String prenom, String login, String password) {
		this(0, nom, prenom, login, password);
	}
	
	/**
	 * Constructeur de conseillers
	 * @param iDConseiller Le num�ro d'identification du conseiller
	 * @param nom Le nom du conseiller
	 * @param prenom Le pr�nom du conseiller
	 * @param login Le login du conseiller
	 */
	public Conseiller(int iDConseiller, String nom, String prenom, String login) {
		this(iDConseiller, nom, prenom, login, null);
	}
	
	/**
	 * Constructeur de conseillers par d�faut
	 */
	public Conseiller() {
		this(0, null, null, null, null);
	}

	/**
	 * Permet d'obtenir le num�ro d'identification d'un conseiller
	 * @return Un num�ro d'identification
	 */
	public int getiDConseiller() {
		return iDConseiller;
	}

	
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}



	@Override
	public String toString() {
		return "Conseiller [iDConseiller=" + iDConseiller + ", login=" + login + ", password=" + password + "]";
	}

}