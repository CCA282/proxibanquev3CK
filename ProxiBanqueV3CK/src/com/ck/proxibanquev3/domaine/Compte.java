package com.ck.proxibanquev3.domaine;

public abstract class Compte {
	
	private int idCompte;
	private String type;
	private double solde;
	
	/**
	 * Constructeur de comptes
	 * @param idCompte Le numéro de compte
	 * @param type Le type de compte, "courant" ou "epargne"
	 * @param solde Le solde du compte
	 */
	public Compte(int idCompte, String type, double solde) {
		super();
		this.idCompte = idCompte;
		this.type = type;
		this.solde = solde;
	}
	
	/**
	 * Constructeur de comptes par défaut
	 */
	public Compte() {
		this(0, null, 0);
	}


	/**
	 * Permet d'obtenir le numéro du compte
	 * @return Un numéro de compte
	 */
	public int getIdCompte() {
		return idCompte;
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
