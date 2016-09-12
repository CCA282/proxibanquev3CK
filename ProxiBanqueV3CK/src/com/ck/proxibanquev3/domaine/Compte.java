package com.ck.proxibanquev3.domaine;

public abstract class Compte {
	
	private int iDCompte;
	private String type;
	private double solde;
	
	/**
	 * Constructeur de comptes
	 * @param iDCompte Le num�ro de compte
	 * @param type Le type de compte, "courant" ou "epargne"
	 * @param solde Le solde du compte
	 */
	public Compte(int iDCompte, String type, double solde) {
		super();
		this.iDCompte = iDCompte;
		this.type = type;
		this.solde = solde;
	}
	
	/**
	 * Constructeur de comptes par d�faut
	 */
	public Compte() {
		this(0, null, 0);
	}


	/**
	 * Permet d'obtenir le num�ro du compte
	 * @return Un num�ro de compte
	 */
	public int getiDCompte() {
		return iDCompte;
	}
	
	/**
	 * Permet d'obtenir le solde du compte
	 * @return Le solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Permet d'obtenir le type du compte
	 * @return the type
	 */
	public String getType() {
		return type;
	}



	@Override
	public String toString() {
		return "Compte [type=" + type + ", solde=" + solde + "]";
	}


}