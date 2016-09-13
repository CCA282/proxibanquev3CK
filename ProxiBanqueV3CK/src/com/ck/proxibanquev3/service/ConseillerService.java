package com.ck.proxibanquev3.service;


import com.ck.proxibanquev3.dao.ConseillerDAO;
import com.ck.proxibanquev3.domaine.Conseiller;

/**
* Classe du domaine service qui concerne l'ensemble des services Conseiller. Cette
 * classe va permettre de: authentifier, lire un Conseiller
 * @author Clement et Karim
 */
public class ConseillerService {
	
	
	ConseillerDAO conseillerdao=new ConseillerDAO();
	
	/**
	 * Permet de comparer le mot de passe entr� par un conseiller lors de sa tentative d'authentification avec celui pr�sent en base de donn�es
	 * @param login Le login du conseiller
	 * @param password Le password entr� par le conseiller lors de la tentative d'authentification
	 * @return True si le mot de passe fourni correspond � celui pr�sent en base de donn�es, false si le mot de passe fourni n'est pas correct
	 */
	public boolean estValide(String login, String password) {
		String expectedpass = conseillerdao.getExpectedPass(login);
		
		if (expectedpass != null && expectedpass.equalsIgnoreCase(password))
			return true;
		else 
			return false;
	}
	
	/**
	 * Permet d'obtenir les informations d'un conseiller en base de donn�e � partir d'un login
	 * @param login Le login du conseiller
	 * @return Un conseiller
	 */
	public Conseiller readByLogin(String login) {
		Conseiller conseiller = conseillerdao.findConseillerByLogin(login);
		return conseiller;
	}
}
