package com.ck.proxibanquev3.domaine;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * Classe Conseiller qui représente des Conseiller de proxibanque
 * @author Clément et Karim
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Conseiller.findByLogin", query = "select c From Conseiller c where c.login=?1"), })

public class Conseiller extends Personne{

	private String login;
	private String password;
	
	@OneToMany(mappedBy="conseiller")
	private Collection<Client> clients;
	

	/**
	 * Constructeur de la classe Conseiller
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 * @param clients
	 */
	public Conseiller(String nom, String prenom, String login, String password, Collection<Client> clients) {
		super(nom, prenom);
		this.login = login;
		this.password = password;
		this.clients = clients;
	}

	/**
	 * Constructeur de la classe Conseiller
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 */
	public Conseiller(String nom, String prenom, String login, String password) {
		super(nom, prenom);
		this.login = login;
		this.password = password;
	}

	/**
	 * Constructeur de la classe Conseiller
	 * @param nom
	 * @param prenom
	 */
	public Conseiller(String nom, String prenom) {
		super(nom, prenom);
	}


	/**
	 * Méthode permettant d'obtenir le login du conseiller
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Méthode permettant de modifier le login du conseiller
	 * @param login le login du conseiller
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Méthode permettant d'obtenir le mot de passe du conseiller
	 * @return the password le mot de passe du conseiller
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Méthode permettant de modifier le mot de passe du conseiller
	 * @param password le mot de passe du conseiller
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Méthode permettant d'obtenir la liste des clients d'un conseiller
	 * @return clients la liste des clients d'un conseiller
	 */
	public Collection<Client> getClients() {
		return clients;
	}

	/**
	 * Méthode permettant de modifier la liste des clients d'un conseiller
	 * @param clients la liste des clients d'un conseiller
	 */
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	
}
