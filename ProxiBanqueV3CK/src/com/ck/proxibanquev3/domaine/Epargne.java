package com.ck.proxibanquev3.domaine;

public class Epargne extends Compte{

	/**
	 * Constructeur de comptes épargnes
	 * @param iDCompte Le numéro de compte
	 * @param type Le type du compte (défini automatiquement comme "épargne")
	 * @param solde Le solde du compte
	 */
	public Epargne(int idCompte, String type, double solde) {
		super(idCompte, "epargne", solde);
	}
	
	/**
	 * Constructeur de comptes épargnes par défaut
	 */
	public Epargne() {
		this(0, "epargne", 0);
	}
}
