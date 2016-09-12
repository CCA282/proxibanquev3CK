package com.ck.proxibanquev3.domaine;

public class Epargne extends Compte{

	/**
	 * Constructeur de comptes �pargnes
	 * @param iDCompte Le num�ro de compte
	 * @param type Le type du compte (d�fini automatiquement comme "�pargne")
	 * @param solde Le solde du compte
	 */
	public Epargne(int idCompte, String type, double solde) {
		super(idCompte, "epargne", solde);
	}
	
	/**
	 * Constructeur de comptes �pargnes par d�faut
	 */
	public Epargne() {
		this(0, "epargne", 0);
	}
}
