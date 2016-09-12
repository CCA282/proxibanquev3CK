package com.ck.proxibanquev3.domaine;

import javax.persistence.Entity;

@Entity
public class Courant extends Compte{

	/**
	 * Constructeur de comptes courants
	 * @param iDCompte Le numéro de compte
	 * @param type Le type du compte (défini automatiquement comme "courant")
	 * @param solde Le solde du compte
	 */
	public Courant(int idCompte, String type, double solde) {
		super(idCompte, "courant", solde);
	}
	
	/**
	 * Constructeur de comptes courants par défaut
	 */
	public Courant() {
		this(0, "courant", 0);
	}
	
}
