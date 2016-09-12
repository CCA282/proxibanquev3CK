package com.ck.proxibanquev3.domaine;

public class Courant extends Compte{

	/**
	 * Constructeur de comptes courants
	 * @param iDCompte Le num�ro de compte
	 * @param type Le type du compte (d�fini automatiquement comme "courant")
	 * @param solde Le solde du compte
	 */
	public Courant(int iDCompte, String type, double solde) {
		super(iDCompte, "courant", solde);
	}
	
	/**
	 * Constructeur de comptes courants par d�faut
	 */
	public Courant() {
		this(0, "courant", 0);
	}
	
}
