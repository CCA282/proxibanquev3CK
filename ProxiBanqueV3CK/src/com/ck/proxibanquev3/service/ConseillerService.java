package com.ck.proxibanquev3.service;

import javax.inject.Inject;

import com.ck.proxibanquev3.dao.ConseillerDAO;
import com.ck.proxibanquev3.domaine.Conseiller;

public class ConseillerService {
	
	@Inject
	ConseillerDAO conseillerdao;
	
	/**
	 * Permet de comparer le mot de passe entré par un conseiller lors de sa tentative d'authentification avec celui présent en base de données
	 * @param login Le login du conseiller
	 * @param password Le password entré par le conseiller lors de la tentative d'authentification
	 * @return True si le mot de passe fourni correspond à celui présent en base de données, false si le mot de passe fourni n'est pas correct
	 */
	public boolean estValide(String login, String password) {
		
		String expectedpass = conseillerdao.getExpectedPass(login);
		
		if (expectedpass != null && expectedpass.equalsIgnoreCase(password))
			return true;
		else 
			return false;
	}
	
	
	/**
	 * Permet d'obtenir les informations d'un conseiller
	 * @param login Le login du conseiller
	 * @return Un conseiller
	 */
	public Conseiller readByLogin(String login) {
		return conseillerdao.readByLogin(login);
		
	}
}
