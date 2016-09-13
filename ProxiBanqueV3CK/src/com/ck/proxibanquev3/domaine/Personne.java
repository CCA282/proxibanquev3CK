package com.ck.proxibanquev3.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Classe Abstraite Personne qui représente une personne avec un id un nom et un prenom
 * @author Clément Karim
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Personne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	private String nom;
	private String prenom;
	
	
	/**Constructeur de personne
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Constructeur de personne
	 * @param nom Nom de la personne
	 * @param prenom Prénom de la personne
	 */
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * constructeur de personne
	 */
	public Personne() {
		super();
	}



	/**
	 * Méthode permettant d'obtenir le nom de la personne
	 * @return nom le nom de la personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Méthode permettant de modifier le nom de la personne
	 * @param nom le nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Méthode permettant d'obtenir le prenom de la personne
	 * @return prenom le prenom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Méthode permettant de modifier le prenom de la personne
	 * @param prenom le prenom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Méthode permettant d'obtenir l'id de la personne
	 * @return id l'identifiant de la personne
	 */
	public int getId() {
		return id;
	}

	/**
	 * Méthode permettant de modifier l'id de la personne
	 * @param id l'identifiant de la personne
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
