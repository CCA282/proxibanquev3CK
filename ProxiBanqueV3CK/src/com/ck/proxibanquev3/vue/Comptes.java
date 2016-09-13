package com.ck.proxibanquev3.vue;

public class Comptes {


	private int id;
	private double solde;
	
	
	/**
	 * @param id
	 * @param solde
	 */
	public Comptes(int id, double solde) {
		super();
		this.id = id;
		this.solde = solde;
	}

	/**
	 * 
	 */
	public Comptes() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
