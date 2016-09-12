package com.ck.proxibanquev3.domaine;

public class Courant extends Compte{

	/**
	 * Constructeur de comptes courants
	 * @param iDCompte Le numéro de compte
	 * @param type Le type du compte (défini automatiquement comme "courant")
	 * @param solde Le solde du compte
	 */
	public Courant(int iDCompte, String type, double solde) {
		super(iDCompte, "courant", solde);
	}
	
	/**
	 * Constructeur de comptes courants par défaut
	 */
	public Courant() {
		this(0, "courant", 0);
	}
	
}
